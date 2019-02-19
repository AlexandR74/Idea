package trainingFromOleg.trackerProject;

//import com.sun.tools.javac.jvm.Items;

public class Tracker {


    /**
     * Массив для хранение заявок.
     */

    public static final Item[] items = new Item[5];
    public static final Item[] swapItems = new Item[5];

    //-------------------Методы-----------------------

    //Метод ADD
    public Item add(Item item) {
        System.out.println("Мы в методе ADD");
        // Прилепить позицию к номеру new массива()
        // проверить список
        System.out.println("выполняем команду: item.getPosition() ,  = " + item.getPosition());
        int number = item.getPosition();
        System.out.println("int number = item.getPosition(); = " + number);
        Item.changePosition();
        this.items[number] = item;

        System.out.println("Состояние переменных");
        System.out.println("position = " + Item.getPosition()+";" + "Name = " + Item.getName()+";"+"Desc = "+ Item.getDesc()+";"+
                "ID =" + Item.getId()+";");
        System.out.println("обнуление!!! (окромя позиции)");
        Item.setDesc("");
        Item.setName("");
        Item.setId("");
        System.out.println("position = " + Item.getPosition()+";" + "Name = " + Item.getName()+";"+"Desc = "+ Item.getDesc()+";"+
                "ID =" + Item.getId()+";");


        return item;
    }


    //Метод Findall
    public Item[] findAll() {
        System.out.println("Метод findAll");
        int j =0;


       //перебор и заполнение элементов

        System.out.println("перебор и заполнение элементов");
        for (int i = 0; i <= 4; i++) {
            if (this.items[i].getId()!=null){
                 this.swapItems[j].setId(this.items[i].getId());
                this.swapItems[j].setName(this.items[i].getName());
                this.swapItems[j].setDesc(this.items[i].getDesc());

                System.out.println(   "name = " +this.swapItems[j].getName()+";"+ ""+
                                    "desc = " +this.swapItems[j].getDesc()+";"+ ""+
                                     "id = " +this.swapItems[j].getId()+";"+ "");
                j++;
            }
        }
        return swapItems;
    }




    /**
     * printItem распечтает item
     */
    public final void printSwapItems() {

        for (int i = 0 ; this.swapItems[i]!=null ; i++)
                System.out.println("ID = " + this.swapItems[i].getId()+"; " +  " Name = " + this.swapItems[i].getName()+"; " + " Desc = "
                        +this.swapItems[i].getDesc()+"; "+"position = "+ this.swapItems[i].getPosition()+"; ");
    }
}
