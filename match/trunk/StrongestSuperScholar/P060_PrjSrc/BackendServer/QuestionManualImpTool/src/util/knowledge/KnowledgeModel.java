package util.knowledge;

import util.TreeNode;

import java.util.List;

/**
 * @author miaoyu
 * @date 2018/6/26 17:50
 */
public class KnowledgeModel {
    private String knowledgeID;
    private List<TreeNode> data;

    public String getKnowledgeID() {
        return knowledgeID;
    }

    public void setKnowledgeID(String knowledgeID) {
        this.knowledgeID = knowledgeID;
    }

    public List<TreeNode> getData() {
        return data;
    }

    public void setData(List<TreeNode> data) {
        this.data = data;
    }
}
