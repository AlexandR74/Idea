package trainingFromOleg.trackerProject;

public class Item {

    // позиция
    private static int position=0;
    /**
     * инициализируем Id
     */
    private static String id;

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
    private long created;

    /**
     * инициализируем comments
     */
    private String[] comments;



    // конструктор без парметров
    public Item (){
    }


    // конструктор с 2мя параметрами
    public Item(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    // конструктор с 3мя параметрами
    public Item(int position, String name, String desc, String id){
        this.position = position;
        this.name = name;
        this.desc = desc;
        this.id = id;
    }

    public static int getPosition() { return position;  }
    public static void setPosition(int newPosition) { position = newPosition; }

    public  static String getId() {
        return id;
    }
    public  static void setId(String newId) {
        id = newId;
    }

    public  static String getName() {
        return name;
    }
    public  static void setName(String newName) { name = newName;}

    public static String getDesc() {
        return desc;
    }
    public static void setDesc(String newDesc) {
        desc = newDesc;
    }

    public long getCreated() {
        return this.created;
    }
    public void setCreated(long created) {
        this.created = created;
    }

    public String[] getComments() {
        return this.comments;
    }
    public void setComments(String[] comments) {
        this.comments = comments;
    }



    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
     public static String generateId(){

        Integer idInt = (0 + (int) (Math.random() * 10000));
        String id = idInt.toString();
        return id;
    }

    public static void changePosition(){
         int count = getPosition();
         count ++;
         setPosition(count);
        System.out.println("Теперь позиция равна " + getPosition() );
    }

}
