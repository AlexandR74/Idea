package trainingFromOleg.trackerProject;

public class Item {


    /**
     * инициализируем Id
     */

    private int position;
    /*
    * Еще раз перечитай внимтально как работают статики и помймешь ниже был полный бред
    * */
    private String id;

    /**
     * инициализируем name
     */
    private  String name;

    /**
     * инициализируем desc
     */
    private  String desc;

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

    // конструктор с 3мя параметрами Вот это вообще был "высший пилотаж":) (когда  у тебя конструктор с 4мя параметрами но ты говоришь что три)
    public Item(String name, String desc, String id){
        this.name = name;
        this.desc = desc;
        this.id = id;
    }

    /**
     * Зачем статики?! Никода сеттеры не делаются статиками
     */
    public  int getPosition() { return position;  }
    public  void setPosition(int newPosition) { position = newPosition; }

    public   String getId() {
        return id;
    }
    public   void setId(String newId) {
        id = newId;
    }

    public   String getName() {
        return name;
    }
    public   void setName(String newName) { name = newName;}

    public  String getDesc() {
        return desc;
    }
    public  void setDesc(String newDesc) {
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

    /**
     * Это не надо, позикцию должен контролировать Трекер
     */
//    public static void changePosition(){
//         int count = getPosition();
//         count ++;
//         setPosition(count);
//        System.out.println("Теперь позиция равна " + getPosition() );
//    }

}
