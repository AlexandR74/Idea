package trainingFromOleg.trackerProject;

public class Tracker {


    /**
     * Массив для хранение заявок.
     */
    private final  Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0; // про это ничего нет  в Астах







    //-------------------Методы-----------------------
    /**
     * Метод реализаущий добавление заявки в хранилище (add)
     * @param item новая заявка
     */
    public Item add(Item item){
        item.setId(this.generateId());

        this.items[this.position++] = item;

        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
//Реализовать метод генерации.
        Integer  idInt  = (0 + (int) (Math.random() * 10000)); // Правильно ли?

        System.out.println("Integer  idInt (генерируется и равен =" + idInt);

        String id = idInt.toString();

        System.out.println("тестовый вывод String id =" +id);
        return id;
    }




    // метод replace -- он же  update в астах
    public boolean replace(String id, Item item){

        return  false;
    }


    // метод delete
    public boolean delete(String id){

        return false;
    }


    // метод findAll -- оно же getAll в астах
    public Item[] findAll(){
        return items;
    }


    // метод findByName
    public Item[] findByName(String key){
        return items;
    }


    //метод findById
    public Item findById(String id){
        return items;
    }



}
