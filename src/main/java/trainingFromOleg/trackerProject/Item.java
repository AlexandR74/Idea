package trainingFromOleg.trackerProject;

public class Item {

    /**
     * инициализируем Id
     */
    public static String id;

    /**
     * инициализируем name
     */
    public static String name;

    /**
     * инициализируем desc
     */
    public String desc;

    /**
     * инициализируем created
     */
    public long created;

    /**
     * инициализируем comments
     */
    public String[] comments;




    // конструктор с 2мя параметрами
    public Item(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    // конструктор с 3мя параметрами
    public Item(String name, String desc, String id){
        this.name = name;
        this.desc = desc;
        this.id = id;
    }



    public static String getId() {
        return id;
    }

    public  void setId(String id) {
        this.id = id;
    }

    public static String getName() {
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
