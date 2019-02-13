package trainingFromOleg.trackerProject;

//import com.sun.tools.javac.jvm.Items;

public class Tracker {


    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;


    //-------------------Методы-----------------------

    /**
     * Метод реализаущий добавление заявки в хранилище (add)
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    // метод replace
    public boolean replace(String id, Item item) {
        //item.getId().equals(tmp.getId()). сравнивать надо так
        /**
         * . Метод public boolean replace(String id, Item item)
         * должен заменить ячейку в массиве this.items.
         * Для этого необходимо найти ячейку в массиве по id.
         * Метод должен вернуть boolean результат - удалось ли провести операцию.
         */

        boolean result = false;

        for (int i = 0; i < this.items.length; i++){
            if (this.items[i].getId().equals(id)){

            }
        }


        return result;
    }


    // метод delete
    public boolean delete(String id) {
        boolean result = false;

        for (int i = 0; i < this.items.length; i++) {
            if (Item.getId().equals(id)) {

            }
        }
        return result;
    }






    /**
     * метод findAll -- оно же getAll в астах
     */

    public Item[] findAll() {
        //инициализируем копию массива
        Item[] itemsResult = new Item[100];

        for (int i = 0; i < this.items.length; i++) {

            if (!(items[i] == null)) {
                itemsResult[itemsResult.length] = this.items[i];
            }
        }
        return itemsResult;
    }


    /**
     * Метод findByName
     * @param key
     * @return itemsResult (новый массив)
     */
    public Item[] findByName (String key){

        //инициализируем результирующий массив;
        Item[] itemsResult = new Item[100];

        for (int i = 0; i < this.items.length; i++) {
            if (Item.getName().equals(key)) {
                itemsResult[itemsResult.length] = this.items[i];
            }
        }
        return itemsResult;
    }


    //метод findById
    public  Item findById (String id){    //  Item[] ? или Item (как в задании)
        boolean unicumID = false;

        for (int i = 0; i < this.items.length; i++) {

            if ( this.items[i].getId().equals(id)){
                unicumID = true;
                return items[i];
            }

        }

        return item;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private final String generateId(){
//Реализовать метод генерации.
        Integer idInt = (0 + (int) (Math.random() * 10000)); // Правильно ли?

        System.out.println("idInt генерируется и равен =" + idInt);
        String id = idInt.toString();
        System.out.println("тестовый вывод String id =" + id);
        return id;
    }

}
