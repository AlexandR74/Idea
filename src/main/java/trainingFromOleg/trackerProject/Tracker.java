package trainingFromOleg.trackerProject;

import java.util.Arrays;
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


    //конструктор position

    private int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    // сеттер присваивает номер позиции последний в массиве items
    private int setPositionNEXT() {

        return this.position = items.length; //ПРОВЕРИТЬ
    }





    //-------------------Методы-----------------------

    /**
     * Метод реализаущий добавление заявки в хранилище (add)
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.setPositionNEXT()] = item;
        return item;
    }

    // метод replace
    public boolean replace(String id, Item item) {

        boolean result = false;
        //перебор элементов
        for (int i = 0; i < this.items.length; i++){

            //сравнение id
            if (this.items[i].getId().equals(id)){
                item.setId(this.items[i].getId());
                this.items[i] = item;
                result = true;
            }
        }
        return result;
    }


    // метод delete   с помощью arrayCopy().
    public boolean delete(String id) {
        boolean result = false;
        //перебор элементов
        for (int i = 0; i < this.items.length; i++) {
            //сравнение id
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(items, i+1, items, i, (items.length-i));//ПРОВЕРИТЬ
                 result = true;
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

        //перебор элементов
        for (int i = 0; i < this.items.length; i++) {
            //сравнение на не null
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
            if (this.items[i].getName().equals(key)) {
                itemsResult[itemsResult.length] = this.items[i];
            }
        }
        return itemsResult;
    }


    //метод findById
    public  Item findById (String id){

        //  для itemresult мы создали конструктор без параметров
        Item itemresult = new Item();

        for (int i = 0; i < this.items.length; i++) {

            if ( this.items[i].getId().equals(id)){

                itemresult=this.items[i];
                return itemresult;
            }
        }
        return null;
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

    /**
     * printItem распечтает item
     */
    public final void printItem( Item item) {
        if (item.getId()==null) {
            System.out.println("ID заявки не удалось найти ");
        }
        System.out.println("ID = " + item.getId() +  "Name = " + item.getName() + "Desc = " + item.getDesc());
    }
}
