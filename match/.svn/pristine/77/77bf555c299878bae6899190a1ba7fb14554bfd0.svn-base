package util;

/**
 * @author miaoyu
 * @date 2018/6/26 08:45
 */
public class TreeNode implements Comparable<TreeNode> {
    private String level;
    private String name;
    private String description;
    private String createTime;
    private String createUser;
    private String lastUpdateTime;
    private String lastUpdateUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    @Override
    public int compareTo(TreeNode o) {
        String[] level1 = this.level.split("\\.");
        String[] level2 = o.getLevel().split("\\.");
        //首先判断两者级号长度
        if(level1.length < level2.length){
            for(int i = 0;i<level1.length;i++){
                int num1 = Integer.valueOf(level1[i]);
                int num2 = Integer.valueOf(level2[i]);
                if(num1 < num2) {
                    return -1;
                }else if(num1 > num2) {
                    return 1;
                }else{
                    continue;
                }
            }
            return -1;
        }else if(level1.length > level2.length){
            for(int i = 0;i<level2.length;i++){
                int num1 = Integer.valueOf(level1[i]);
                int num2 = Integer.valueOf(level2[i]);
                if(num1 < num2) {
                    return -1;
                }else if(num1 > num2) {
                    return 1;
                }else{
                    continue;
                }
            }
            return 1;
        }
        //当两者级别长度相等时，逐位比较
        for(int i = 0;i<level1.length;i++){
            int num1 = Integer.valueOf(level1[i]);
            int num2 = Integer.valueOf(level2[i]);
            if(num1 < num2) {
                return -1;
            }else if(num1 > num2) {
                return 1;
            }
        }
        return 0;
    }
}
