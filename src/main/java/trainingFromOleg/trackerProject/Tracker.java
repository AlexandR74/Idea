package trainingFromOleg.trackerProject;

//import com.sun.tools.javac.jvm.Items;

public class Tracker {


    /**
     * Массив для хранение заявок.
     */
    int position = 0;  // номер позиции в памяти
    private final Item[] items = new Item[100];
    private final Item[] swapItems = new Item[100];







    //-------------------Методы-----------------------

    //Метод ADD
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position] = item;
        System.out.println("Тестовый вывод заявки  item из метода ADD в классе Tracker: ");
        System.out.println("ID = " + item.getId() +  " Name = " +  item.getName() + " Desc = " + item.getDesc());
        System.out.println(" Тестовый вывод заявки из items[this.position] = ");
        System.out.println( "ID = "+ this.items[this.position].getId() +"Name =" + this.items[this.position].getName() + "Desc =" + this.items[this.position].getDesc());
        return item;


    }

    // метод Replace
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


    //Метод Findall
    public Item[] findAll() {
        int j = 0;
        //форматирование временного массива перед использованием
        for (int i = 0; i <= 99; i++){
            System.out.println("this.swapItems[i]=null" + this.swapItems[i] );
            this.swapItems[i]=null;
        }
       //перебор и заполнение элементов

        System.out.println("перебор и заполнение элементов");
        for (int i = 0; i <= 99; i++) {
            System.out.println( "мы в цикле for  и i = " +i);


            if ((this.items[i] != null) && (this.items[i].getId()!=null)) {
                System.out.println( "(this.items[i] != null)? = " + (this.items[i] != null) +"&&" +"(this.items[i].getId() ?=" + (this.items[i].getId()));



                    Item swapItem = new Item(items[i].getName(), items[i].getDesc());
                    System.out.println("Item swapItem = new Item(items[i].getName(), items[i].getDesc());" + swapItem.getName()+ " " + swapItem.getDesc());


                 swapItem.setId(items[i].getId());
                    System.out.println("swapItem.setId(items[i].getId())" + swapItem.getId());

                this.swapItems[j] = swapItem; // j-я потому как новый надо и переписанный. без дыр
                 j++;
                }
            }
        return swapItems;
    }



    /**
     * Метод findByName
     * @param key
     * @return itemsResult (новый массив)
     */
    public Item[] findByName (String key){

        //инициализируем результирующий массив;
        Item[] itemsResult = new Item[100];

        /*
         * Аналогичная ошибка как и в методе findAll()
         */
        for (int i = 0; i <= this.items.length; i++) {
            if (this.items[i].getName().equals(key)) {
                itemsResult[itemsResult.length] = this.items[i];
            }
        }
        return itemsResult;
    }


    //метод findById
    public  Item findById (String id){

        //  для itemresult мы создали конструктор без параметров
        Item itemresult;
        //= new Item(); это тебе здесь не надо ты просто создаешь ссылочную переменную, которой потом по результатам поиска присвоишь значение

        for (int i = 0; i <= this.items.length; i++) {

            if ( items[i].getId().equals(id)){

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
    public final void printItem(Item[] Items) {

        for (int i = 0 ; this.swapItems[i]!=null ; i++)
                System.out.println("ID = " + this.swapItems[i].getId() +  " Name = " + this.swapItems[i].getName() + " Desc = " +this.swapItems[i].getDesc());
    }
}
