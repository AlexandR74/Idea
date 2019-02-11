package trainingFromOleg.trackerProject;

public class Item {

    /**
     * реализуем поля ( с Астах)
     */

    /**
     * инициализируем Id
     */
    String id;

    /**
     * инициализируем name
     */
    String name;

    /**
     * инициализируем desc
     */
    String desc;

    /**
     * инициализируем created
     */
    long created;

    /**
     * инициализируем comments
     */
    String [] comments;





    public Item(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }
}
