package trainingFromOleg.trackerProject;


import java.util.Arrays;

import static java.lang.Integer.numberOfLeadingZeros;
import static java.lang.Integer.parseInt;

public class Tracker {


    /**
     * Массив для хранение заявок.
     */


    public static Item[] items = new Item[5];
    public Item[] swapItems = new Item[5];




    //-------------------Методы------------------------

    //Метод ADD
    public Item add(Item item) {
        System.out.println("запущен ADD");
        System.out.println("генерируем чертову позицию");
        // Важный блок
        int number = item.generatePosition(item);
        System.out.println(" внутри item должна сохранииться position: "+ item.getPosition() +"; TrigPos: " + item.isTrigPos()+";" );
        this.items[number] = item;
        // Конец важного блока

//        boolean count = false;
//
//        for (int i = 0; i < this.items.length; i++){
//
//            int arrId = parseInt(this.items[i].getId());
//            System.out.println("arrId = " + arrId);
//
//            if (arrId == 0){
//                this.items[i] = item;
//
//                System.out.println(" ");
//            count = true;
//            }
//            if (count){
//                System.out.println("заявка успешна добавлена");
//            }
//
//        }

        return item;
    }


    //Метод Findall
    public Item[] findAll() {
        System.out.println(" метод findAll");

        for (int i = 0; i < this.items.length; i++) {

            if (items[i] != null) {
               this.swapItems[i] = this.items[i];
            }
        }
        return swapItems;
    }


    // метод Replace
    public boolean replace(String id, Item item2Cons) {

        boolean result = false;

        for (int i = 0; i < this.items.length; i++){

                if (this.items[i].getId().equals(id)) {
                    this.items[i].setName(item2Cons.getName());
                    this.items[i].setDesc(item2Cons.getDesc());
                    result = true;
                }
        }
        return result;
    }


    //метод findById
    public  Item findById (String id){
        //  для itemresult мы создали конструктор без параметров
        Item itemresult;

        for (int i = 0; i < this.items.length; i++) {

            // пришлось вывести сравниваемые элементы в примитивы (id)
            int arrId = parseInt(this.items[i].getId());
            int newId = parseInt(id);
            System.out.println(arrId);

            if (arrId == newId){
                itemresult=this.items[i];
                return itemresult;
            }
        }
        return null;
    }


    // метод delete
    public boolean delete(String id) {
        System.out.println("метод delete");
        boolean result = false;
        //перебор элементов
        System.out.println("result = " + result);
        for (int i = 0; i < this.items.length; i++) {
            //сравнение id

            System.out.println(" if ((this.items[i].getId().equals(id) )) = "  +((this.items[i].getId().equals(id) )) );
            if ((this.items[i].getId().equals(id) )){

            System.arraycopy(this.items, i + 1, this.swapItems, 0, (this.items.length - i));//ПРОВЕРИТЬ
            System.arraycopy(this.swapItems, 0,this.items, i,this.swapItems.length-1);
            result = true;
            }
        }

        return result;
        }




    //Метод findByName
    public Item[] findByName (String key){

        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getName().equals(key)) {
                this.swapItems[i] = this.items[i];
            }
        }
        return swapItems;
    }


    /**
     * printItems Выводит на экран  items по строчно
     */
    public  void printItems(Item[] items ) {
        System.out.println("Запущен printItems");
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i]==null){
                break;
            }
            else {
                boolean printTrigPos = this.items[i].isTrigPos();
                int printPosition = this.items[i].getPosition();
                String printID = this.items[i].getId();
                String printName = this.items[i].getName();
                String printDeck = this.items[i].getDesc();

                System.out.println("printPosition = " + printPosition + "; " +"TrigPos = " + printTrigPos + "; " +"ID = " + printID + "; " + " Name = " + printName + "; " + " Desc = "
                        + printDeck + ";");
            }
        }
    }

    public  void cleansSwapItems (){
        for (int i = 0; i < this.swapItems.length; i++){
            this.swapItems[i] = null;
        }
    }


}