package trainingFromOleg.trackerProject;

public class Item {



      // БЛОК ПОЗИЦИИ  ( не удалять и не трогать)
    // position = номер позиции   ; isTrigPos = индикатор что позиция назначалась заявке
    /**
     * Блок относится к переменной position для контроля за ячейками массива
     * так как простая переменная position  не надежна и не устойчива к повторным запускам программы
     * мы городим весь этот гребаный огород (ДА, Я ОЧЕНЬ ЗОЛ!!!и напился КОФЕ!!!) в седьмой раз!
     */
    /**
     * инициализируем position
     */
    private int position;

    /**
     * инициализируем isTrigPos
     */
    private boolean isTrigPos;
   // КОНЕЦ БЛОКА ПОЗИЦИИ


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

    // конструктор с 3мя параметрами
    public Item(String name, String desc, String id){
        this.name = name;
        this.desc = desc;
        this.id = id;
    }

    //------ БЛОК ГЕТТЕРОВ И СЕТТЕРОВ ---------
    public boolean isTrigPos() { return isTrigPos;  }
    public void setTrigPos(boolean trigPos) { isTrigPos = trigPos;    }

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
     * Метод генерирует позицию
     */

    public int generatePosition (Item item) {
        System.out.println("метод генерации позиции / generatePosition");
        for (int i = 0; i < Tracker.items.length; i++) {
            System.out.println("Запущен цикл перебора массива");
            int swapPos=i;
            System.out.println(" элемент № " +swapPos);
            Boolean booSwapPos = Tracker.items[i].isTrigPos();
             boolean SwapB = (boolean) booSwapPos;
            System.out.println(" ранее позиция назначалась? = " +SwapB);

            if (SwapB == false) {
                System.out.println("назначаем позицию = " +swapPos);
                item.setPosition(swapPos);
                item.setTrigPos(true);
                return  swapPos;
            }
        }
        return -1; // Надо посоветоваться как правильно делать.
        /**
         * если поставить null то это не выдаст ошибку когда она будет.
         * если поставить -1  то выдаст ошибку, так как генерация передается в номер массива при инициализации
         */
    }


}
