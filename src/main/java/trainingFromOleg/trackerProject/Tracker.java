package trainingFromOleg.trackerProject;

//import com.sun.tools.javac.jvm.Items;

public class Tracker {


    /**
     * Массив для хранение заявок.
     */

    /*
    * Отжиг! просто отжиг! Читай еще раз как работает ключевое слово final Ты сделал два неизменямых массива и пытаешь туда что то пложить:)
    * */
//    public static final Item[] items = new Item[5];
//    public static final Item[] swapItems = new Item[5];

    public Item[] items = new Item[5];
    public Item[] swapItems = new Item[5];

    private int position = 0;

    //-------------------Методы------------------------

    //Метод ADD
    public Item add(Item item) {
        System.out.println("Мы в методе ADD");
        // Прилепить позицию к номеру new массива()
        // проверить список

        items[position] = item; // <<<<<<<<<<<<  КАКОЙ ИМЕННО ITEM ТАМ ?
        position++;
        return item;   // <<<<<<<<<<<<<<<<<ПОЧЕМУ ITEM ВЕДЬ МЫ ИЗГОТОВИЛИ ITEMS?
    }


    //Метод Findall
    public Item[] findAll() {
        System.out.println("Метод findAll");


        //перебор и заполнение элементов

        System.out.println("перебор и заполнение элементов"); //Какое заполнение?! Просто верни заявку:)
        //Если у тебя есть массив на 5 элементов, а ты туда положил 1 то что лежит в остальных 4х?:)
        for (int i = 0; i < position; i++) {
            if (items[i].getId() != null) {
                swapItems[items[i].getPosition()] = items[i];
            }
        }
        return swapItems;
    }


    /**
     * printItem распечтает item
     */
    public final void printSwapItems() {

        for (int i = 0; this.swapItems[i] != null; i++)
            System.out.println("ID = " + this.swapItems[i].getId() + "; " + " Name = " + this.swapItems[i].getName() + "; " + " Desc = "
                    + this.swapItems[i].getDesc() + "; " + "position = " + this.swapItems[i].getPosition() + "; ");
    }
}
