/**
 * 实现功能：针对Docx操作Word的应用的示例
 */

package MyPkg;

import java.io.StringWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBElement;

import org.docx4j.TextUtils;
import org.docx4j.TraversalUtil;
import org.docx4j.XmlUtils;
import org.docx4j.finders.RangeFinder;
import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.io.SaveToZipFile;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.openpackaging.parts.relationships.Namespaces;
import org.docx4j.wml.*;
import org.docx4j.wml.P.Hyperlink;

public class MyDocx4JDemo
{
	public void CreateDocx(String outputfilepath,boolean blIsOverride) throws Docx4JException
	{
		java.io.File curFile = new java.io.File(outputfilepath); 
		if (!blIsOverride && curFile.exists())
		{
			return;			
		}
		
		// 针对Word操作的对象
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();

		// 增加段落：内容为X
		wordMLPackage.getMainDocumentPart().addParagraphOfText("x");

		// 增加段落：内容为X
		wordMLPackage.getMainDocumentPart().addParagraphOfText("x");

		// 增加段落：内容为helloWorld
		wordMLPackage.getMainDocumentPart().addParagraphOfText("hello world");

		// 得到内容（内容即段落）
		P p = (P) wordMLPackage.getMainDocumentPart().getContent().get(2);		
		R r = (R) p.getContent().get(0);

		//插入标签
		String bookmarkName = "abcd";
		bookmarkRun(p, r, bookmarkName, 123);

		wordMLPackage.getMainDocumentPart().addParagraphOfText("x");
		wordMLPackage.getMainDocumentPart().addParagraphOfText("x");

		// Now add an internal hyperlink to it
		Hyperlink h = MainDocumentPart.hyperlinkToBookmark(bookmarkName, "link to bookmark");
		wordMLPackage.getMainDocumentPart().addParagraphOfText("some text").getContent().add(h);

		System.out.println(XmlUtils.marshaltoString(p, true));

		@SuppressWarnings("deprecation")
		SaveToZipFile saver = new SaveToZipFile(wordMLPackage);
		saver.save(outputfilepath);
	}

	public void ReadBookMark(String strDocFileName) throws Docx4JException
	{
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(strDocFileName));
		MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();

		org.docx4j.wml.Document wmlDocumentEl = (org.docx4j.wml.Document) documentPart.getJaxbElement();
		Body body = wmlDocumentEl.getBody();

		Set<String> names = new HashSet<String>();
		Set<BigInteger> ids = new HashSet<BigInteger>();

		RangeFinder rt = new RangeFinder("CTBookmark", "CTMarkupRange");

		new TraversalUtil(body.getContent(), rt);

		for (CTBookmark bm : rt.getStarts())
		{

			BigInteger id = bm.getId();
			String name = bm.getName();

			System.out.printf("\n当前书签ID:%s,名称为:%s，值为:%s",
					          id == null?"":id.longValue(),
					          name,					          
					          bm.getParent() == null?"":bm.getParent());
		}
	}
	
	/**
	 * Surround the specified r in the specified p with a bookmark (with specified
	 * name and id)
	 * 
	 * @param p
	 * @param r
	 * @param name
	 * @param id
	 */
	protected void bookmarkRun(P p, R r, String name, int id)
	{
		// Find the index
		int index = p.getContent().indexOf(r);

		if (index < 0)
		{
			System.out.println("P does not contain R!");
			return;
		}

		ObjectFactory factory = Context.getWmlObjectFactory();
		BigInteger ID = BigInteger.valueOf(id);

		// Add bookmark end first
		CTMarkupRange mr = factory.createCTMarkupRange();
		mr.setId(ID);
		JAXBElement<CTMarkupRange> bmEnd = factory.createBodyBookmarkEnd(mr);
		p.getContent().add(index + 1, bmEnd);

		// Next, bookmark start
		CTBookmark bm = factory.createCTBookmark();
		bm.setId(ID);
		bm.setName(name);
		JAXBElement<CTBookmark> bmStart = factory.createBodyBookmarkStart(bm);
		p.getContent().add(index, bmStart);

	}
	
	public void ReadTableDemo(String strDocxFile) throws Exception
	{
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(strDocxFile));
		List<Tbl> arrTable = this.getAllTbl(wordMLPackage);
		
		if (arrTable == null || arrTable.size() <= 0)
		{
			System.out.println("当前表格并不存在！");
			return;
		}
		
		for(Tbl tableTmp:arrTable)
		{		
			System.out.println("\n---------当前表格的内容如下-------------------");
			
			List<String> lstContent = this.getTblContentList(tableTmp);
			
			if (lstContent == null || lstContent.size() <= 0)
			{
				System.out.println("当前表格的内容并不存在！");
				continue;
			}
			
			for(String strTmp:lstContent)
			{
				System.out.print("\n当前表格行内容为:");
				System.out.println(strTmp);
			}	
		}
	}
	
	
	/**
	 * @Description:得到所有表格
	 */
	protected List<Tbl> getAllTbl(WordprocessingMLPackage wordMLPackage)
	{
		MainDocumentPart mainDocPart = wordMLPackage.getMainDocumentPart();
		List<Object> objList = getAllElementFromObject(mainDocPart, Tbl.class);
		if (objList == null)
		{
			return null;
		}
		List<Tbl> tblList = new ArrayList<Tbl>();
		for (Object obj : objList)
		{			
			if (obj instanceof Tbl)
			{
				Tbl tbl = (Tbl) obj;
				
				tblList.add(tbl);
			}
		}
		return tblList;
	}
	
	/**
	 * @Description: 获取表格内容
	 */
	protected List<String> getTblContentList(Tbl tbl) throws Exception
	{
		List<String> resultList = new ArrayList<String>();
		List<Tr> trList = getTblAllTr(tbl);
		for (Tr tr : trList)
		{
			StringBuffer sb = new StringBuffer();
			List<Tc> tcList = getTrAllCell(tr);
			for (Tc tc : tcList)
			{
				sb.append(getElementContent(tc) + ",");
			}
			resultList.add(sb.toString());
		}
		return resultList;
	}
	
	protected String getElementContent(Object obj) throws Exception
	{
		StringWriter stringWriter = new StringWriter();
		TextUtils.extractText(obj, stringWriter);
		return stringWriter.toString();
	}
	
	/**
	 * @Description: 获取所有的单元格
	 */
	protected List<Tc> getTrAllCell(Tr tr)
	{
		List<Object> objList = getAllElementFromObject(tr, Tc.class);
		List<Tc> tcList = new ArrayList<Tc>();
		if (objList == null)
		{
			return tcList;
		}
		for (Object tcObj : objList)
		{
			if (tcObj instanceof Tc)
			{
				Tc objTc = (Tc) tcObj;
				tcList.add(objTc);
			}
		}
		return tcList;
	}
	
	/**
	 * @Description:得到指定类型的元素
	 */
	protected static List<Object> getAllElementFromObject(Object obj, Class<?> toSearch)
	{
		List<Object> result = new ArrayList<Object>();
		if (obj instanceof JAXBElement)
			obj = ((JAXBElement<?>) obj).getValue();
		if (obj.getClass().equals(toSearch))
			result.add(obj);
		else if (obj instanceof ContentAccessor)
		{
			List<?> children = ((ContentAccessor) obj).getContent();
			for (Object child : children)
			{
				result.addAll(getAllElementFromObject(child, toSearch));
			}
		}
		return result;
	}
	
	/**
	 * @Description: 得到表格所有的行
	 */
	protected List<Tr> getTblAllTr(Tbl tbl)
	{
		List<Object> objList = getAllElementFromObject(tbl, Tr.class);
		List<Tr> trList = new ArrayList<Tr>();
		if (objList == null)
		{
			return trList;
		}
		for (Object obj : objList)
		{
			if (obj instanceof Tr)
			{
				Tr tr = (Tr) obj;
				trList.add(tr);
			}
		}
		return trList;

	}

	/**
	 * 创建表格
	 * @param filePath
	 * @param rowNum
	 * @param colsNum
	 * @throws Exception
	 */
	public void createTable(String filePath,int rowNum,int colsNum) throws Exception{
		java.io.File file = new java.io.File(filePath);
		if(!file.exists()){
			throw new Exception("找不到文件");
		}
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(file);

		Tbl table = createTable(wordMLPackage,rowNum,colsNum);
		wordMLPackage.getMainDocumentPart().addObject(table);
		wordMLPackage.getMainDocumentPart().addParagraphOfText("\n");
		wordMLPackage.save(file);
	}

	public Tbl createTable(WordprocessingMLPackage wordMLPackage,int rowNum, int colsNum) throws Exception{


		colsNum = Math.max(1, colsNum);
		rowNum = Math.max(1, rowNum);
		int widthTwips = getWritableWidth(wordMLPackage);
		int colWidth = widthTwips / colsNum;
		int[] widthArr = new int[colsNum];
		for (int i = 0; i < colsNum; i++)
		{
			widthArr[i] = colWidth;
		}

		return createTable(rowNum,colsNum,widthArr);
	}

	/**
	 * @Description:创建表格(默认水平居中,垂直居中)
	 */
	public Tbl createTable(int rowNum, int colsNum, int[] widthArr) throws Exception
	{
		colsNum = Math.max(1, Math.min(colsNum, widthArr.length));
		rowNum = Math.max(1, rowNum);
		Tbl tbl = new Tbl();
		StringBuffer tblSb = new StringBuffer();
		tblSb.append("<w:tblPr ").append(Namespaces.W_NAMESPACE_DECLARATION).append(">");
		tblSb.append("<w:tblStyle w:val=\"TableGrid\"/>");
		tblSb.append("<w:tblW w:w=\"0\" w:type=\"auto\"/>");
		// 上边框
		tblSb.append("<w:tblBorders>");
		tblSb.append("<w:top w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
		// 左边框
		tblSb.append("<w:left w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
		// 下边框
		tblSb.append("<w:bottom w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
		// 右边框
		tblSb.append("<w:right w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
		tblSb.append("<w:insideH w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
		tblSb.append("<w:insideV w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
		tblSb.append("</w:tblBorders>");
		tblSb.append("</w:tblPr>");
		TblPr tblPr = null;
		tblPr = (TblPr) XmlUtils.unmarshalString(tblSb.toString());
		Jc jc = new Jc();
		// 单元格居中对齐
		jc.setVal(JcEnumeration.CENTER);
		tblPr.setJc(jc);

		tbl.setTblPr(tblPr);

		// 设定各单元格宽度
		TblGrid tblGrid = new TblGrid();
		tbl.setTblGrid(tblGrid);
		for (int i = 0; i < colsNum; i++)
		{
			TblGridCol gridCol = new TblGridCol();
			gridCol.setW(BigInteger.valueOf(widthArr[i]));
			tblGrid.getGridCol().add(gridCol);
		}
		// 新增行
		for (int j = 0; j < rowNum; j++)
		{
			Tr tr = new Tr();
			tbl.getContent().add(tr);
			// 列
			for (int i = 0; i < colsNum; i++)
			{
				Tc tc = new Tc();
				tr.getContent().add(tc);

				TcPr tcPr = new TcPr();
				TblWidth cellWidth = new TblWidth();
				cellWidth.setType("dxa");
				cellWidth.setW(BigInteger.valueOf(widthArr[i]));
				tcPr.setTcW(cellWidth);
				tc.setTcPr(tcPr);

				// 垂直居中
				setTcVAlign(tc, STVerticalJc.CENTER);
				P p = new P();
				PPr pPr = new PPr();
				pPr.setJc(jc);
				p.setPPr(pPr);
				R run = new R();
				p.getContent().add(run);
				tc.getContent().add(p);
			}
		}
		return tbl;
	}

	/**
	 * @Description：获取文档的可用宽度
	 */
	protected int getWritableWidth(WordprocessingMLPackage wordPackage) throws Exception
	{
		return wordPackage.getDocumentModel().getSections().get(0).getPageDimensions().getWritableWidthTwips();
	}

	/**
	 * @Description: 设置单元格垂直对齐方式
	 */
	protected void setTcVAlign(Tc tc, STVerticalJc vAlignType)
	{
		if (vAlignType != null)
		{
			TcPr tcPr = getTcPr(tc);
			CTVerticalJc vAlign = new CTVerticalJc();
			vAlign.setVal(vAlignType);
			tcPr.setVAlign(vAlign);
		}
	}

	public TcPr getTcPr(Tc tc)
	{
		TcPr tcPr = tc.getTcPr();
		if (tcPr == null)
		{
			tcPr = new TcPr();
			tc.setTcPr(tcPr);
		}
		return tcPr;
	}

	public void createQuestion(String filePath)throws Exception{
		java.io.File file = new java.io.File(filePath);
		if(!file.exists()){
			throw new Exception("找不到文件");
		}
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(file);
		Tbl tbl = createTable(wordMLPackage,7,2);

		mergeCellsHorizontal(tbl,0,0,1);
		Jc jc = new Jc();
		jc.setVal(JcEnumeration.CENTER);
		PPr ppr = new PPr();
		ppr.setJc(jc);
		P p;
		//题目类型
		p = wordMLPackage.getMainDocumentPart().createParagraphOfText("选择题");
		p.setPPr(ppr);
		getTc(tbl,0,0).getContent().set(0,p);

		//题干
		p = wordMLPackage.getMainDocumentPart().createParagraphOfText("题干");
		p.setPPr(ppr);
		getTc(tbl,1,0).getContent().set(0,p);
		p =wordMLPackage.getMainDocumentPart().createParagraphOfText("这是题干");
		p.setPPr(ppr);
		getTc(tbl,1,1).getContent().set(0,p);
		//答案
		getTc(tbl,2,0).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("答案"));
		getTc(tbl,2,1).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("这是答案"));
		//选项A
		getTc(tbl,3,0).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("选项A"));
		getTc(tbl,3,1).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("这是选项A"));
		//选项B
		getTc(tbl,4,0).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("选项B"));
		getTc(tbl,4,1).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("这是选项B"));
		//选项C
		getTc(tbl,5,0).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("选项C"));
		getTc(tbl,5,1).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("这是选项C"));
		//选项D
		getTc(tbl,6,0).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("选项D"));
		getTc(tbl,6,1).getContent().add(wordMLPackage.getMainDocumentPart().createParagraphOfText("这是选项D"));
		wordMLPackage.getMainDocumentPart().addObject(tbl);
		wordMLPackage.getMainDocumentPart().addParagraphOfText("\n");
		wordMLPackage.save(file);
	}

	/**
	 * @Description: 跨列合并
	 */
	public void mergeCellsHorizontal(Tbl tbl, int row, int fromCell, int toCell)
	{
		if (row < 0 || fromCell < 0 || toCell < 0)
		{
			return;
		}
		List<Tr> trList = getTblAllTr(tbl);
		if (row > trList.size())
		{
			return;
		}
		Tr tr = trList.get(row);
		List<Tc> tcList = getTrAllCell(tr);
		for (int cellIndex = fromCell, len = Math.min(tcList.size() - 1, toCell); cellIndex <= len; cellIndex++)
		{
			Tc tc = tcList.get(cellIndex);
			TcPr tcPr = getTcPr(tc);
			TcPrInner.HMerge hMerge = tcPr.getHMerge();
			if (hMerge == null)
			{
				hMerge = new TcPrInner.HMerge();
				tcPr.setHMerge(hMerge);
			}
			if (cellIndex == fromCell)
			{
				hMerge.setVal("restart");
			} else
			{
				hMerge.setVal("continue");
			}
		}
	}

	/**
	 * @Description:得到指定位置的单元格
	 */
	public Tc getTc(Tbl tbl, int row, int cell)
	{
		if (row < 0 || cell < 0)
		{
			return null;
		}
		List<Tr> trList = getTblAllTr(tbl);
		if (row >= trList.size())
		{
			return null;
		}
		List<Tc> tcList = getTrAllCell(trList.get(row));
		if (cell >= tcList.size())
		{
			return null;
		}
		return tcList.get(cell);
	}

}
