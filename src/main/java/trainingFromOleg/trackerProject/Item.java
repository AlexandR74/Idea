package trainingFromOleg.trackerProject;

public class Item {

    // позиция
    public static boolean marker;
    /**
     * инициализируем Id
     */
    public static String id;

    /**
     * инициализируем name
     */
    private static String name;

    /**
     * инициализируем desc
     */
    private static String desc;

    /**
     * инициализируем created
     */
    public long created;

    /**
     * инициализируем comments
     */
    public String[] comments;



    // конструктор без парметров
    public Item (){
    }


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

    public static boolean getMarker() { return marker;  }
    public void setMarker(boolean marker) { this.marker = marker; }

    public  String getId() {
        return this.id;
    }
    public  void setId(String id) {
        this.id = id;
    }

    public  String getName() {
        return this.name;
    }
    public void setName(String name) { this.name = name;}

    public String getDesc() {
        return this.desc;
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
