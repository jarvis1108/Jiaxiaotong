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
		//����ģ��·��
		String modelPath = "docs/model/����ģ��.docx";
		//֪ʶ��ģ��·��
		String knowledgeModelPath = "docs/model/֪ʶ��ģ��.docx";
		//��Ŀģ��·��
		String subjectModelPath = "docs/model/ѧ��ģ��test.docx";
		//��ǩģ��·��
		String bookMarkModelPath = "docs/model/��ǩģ��.docx";
		//����������ļ�·��
		String testOutputPath = "docs/output/����ģ�����.docx";
		//�����ѧ���ļ�·��
		String testSubjectPath = "docs/output/ѧ��ģ�����test.docx";
		//�����֪ʶ���ļ�·��
		String testKnowledgePath = "docs/output/֪ʶ��ģ�����.docx";
		//�������ǩģ���ļ�·��
		String testBookmarkPath = "docs/output/��ǩģ�����.docx";
		//�������������
		Docx4JUtil docx4JUtil = new Docx4JUtil();
		//��д��ǩ
//		List<CTBookmark> bookmarks = docx4JUtil.readBookMark(bookMarkModelPath);
//		docx4JUtil.writeBookMark(bookmarks,testBookmarkPath);

		//��д����
//		List<Map<String,String>> list = docx4JUtil.readQuestionDocx(modelPath);
//		docx4JUtil.writeQuestionDocx(testOutputPath,list);

		//��д��Ŀ
		List<TreeNode> list = docx4JUtil.readSubjectDocx(subjectModelPath);
		List<Subject> subjects = new ArrayList<>();
		for (int i = 1;i<=list.size();i++) {
			Subject subject = new Subject(list.get(i-1));
			subject.setInitNo(String.valueOf(i));
			subjects.add(subject);
		}
//		docx4JUtil.writeSubjectDocx(testSubjectPath,list);
		//��д֪ʶ��
//		KnowledgeModel model = docx4JUtil.readKnowledgeDocx(knowledgeModelPath);
//		docx4JUtil.writeKnowledgeDocx(testKnowledgePath,model);
		long start = System.currentTimeMillis();
		String uuid = "INT_"+ UUID.randomUUID().toString();
		//DBUtil.executeSave(uuid,"");
		DBUtil.batchSave(subjects);
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��"+(end-start)/1000+"��");

		System.out.printf("\n�밴�������������..............");
		System.in.read();
	}	
}
