package MyPkg;

import db.DBUtil;
import entity.Subject;
import org.docx4j.wml.CTBookmark;
import util.Docx4JUtil;
import util.TreeNode;
import util.knowledge.KnowledgeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class main
{
	public static void main(String[] args) throws Exception
	{
		//试题模板路径
		String modelPath = "docs/model/试题模板.docx";
		//知识点模板路径
		String knowledgeModelPath = "docs/model/知识点模板.docx";
		//科目模板路径
		String subjectModelPath = "docs/model/学科模板test.docx";
		//书签模板路径
		String bookMarkModelPath = "docs/model/书签模板.docx";
		//待输出试题文件路径
		String testOutputPath = "docs/output/试题模板输出.docx";
		//待输出学科文件路径
		String testSubjectPath = "docs/output/学科模板输出test.docx";
		//待输出知识点文件路径
		String testKnowledgePath = "docs/output/知识点模板输出.docx";
		//待输出书签模板文件路径
		String testBookmarkPath = "docs/output/书签模板输出.docx";
		//创建工具类对象
		Docx4JUtil docx4JUtil = new Docx4JUtil();
		//读写书签
//		List<CTBookmark> bookmarks = docx4JUtil.readBookMark(bookMarkModelPath);
//		docx4JUtil.writeBookMark(bookmarks,testBookmarkPath);

		//读写试题
//		List<Map<String,String>> list = docx4JUtil.readQuestionDocx(modelPath);
//		docx4JUtil.writeQuestionDocx(testOutputPath,list);

		//读写科目
		List<TreeNode> list = docx4JUtil.readSubjectDocx(subjectModelPath);
		List<Subject> subjects = new ArrayList<>();
		for (int i = 1;i<=list.size();i++) {
			Subject subject = new Subject(list.get(i-1));
			subject.setInitNo(String.valueOf(i));
			subjects.add(subject);
		}
//		docx4JUtil.writeSubjectDocx(testSubjectPath,list);
		//读写知识点
//		KnowledgeModel model = docx4JUtil.readKnowledgeDocx(knowledgeModelPath);
//		docx4JUtil.writeKnowledgeDocx(testKnowledgePath,model);
		long start = System.currentTimeMillis();
		String uuid = "INT_"+ UUID.randomUUID().toString();
		//DBUtil.executeSave(uuid,"");
		DBUtil.batchSave(subjects);
		long end = System.currentTimeMillis();
		System.out.println("用时："+(end-start)/1000+"秒");

		System.out.printf("\n请按任意键结束程序..............");
		System.in.read();
	}	
}
