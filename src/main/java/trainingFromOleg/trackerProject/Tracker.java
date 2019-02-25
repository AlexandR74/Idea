package trainingFromOleg.trackerProject;


public class Tracker {


    /**
     * Массив для хранение заявок.
     */


    public static Item[] items = new Item[5];
    public static Item[] swapItems = new Item[5];

    //-------------------Методы------------------------

    /**
     * Метод ADD: 1)генерирует № позиции (пожаробезопасно).
     *            2)для безопасной генерации введен тригер позиции - isTrigPos  (отвечает:назначалась ли ранее позиция)
     *            3)добавление item в массив items
     * @param item
     * @return
     */
    public Item add(Item item) {
        System.out.println("Запущен метод ADD," + " генерируем позицию.");

        // Важный блок
        int number = item.generatePosition(item);
        System.out.println(" внутри item должна сохранииться position: "+ item.getPosition() +"; trigPos: " + item.isTrigPos()+";" );
        this.items[number] = item;
        // Конец важного блока
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
        System.out.println("запущен Replace");
        boolean result = false;
        this.swapItems[0] =  item2Cons;

        for (int i = 0; i < this.items.length; i++){

            boolean swapB = (this.items[i] == null) ? false : true;
            if ((swapB) &&(this.items[i].getId().equals(id))) {
                System.out.println("мы в цикле");
                String name = this.swapItems[0].getName();
                String desc = this.swapItems[0].getDesc();

                System.out.println("name =  "+name +": desc ="+desc +";");

                this.items[i].setName(name);
                this.items[i].setDesc(desc);

                result = true;
            }
        }
        return result;
    }


    //метод findById
    public  Item findById (String id){
        //  для itemresult мы создали конструктор без параметров
        Item itemresult;
            boolean result = false;
            System.out.println("Сначала result = " + result);
            for (int i = 0; i < this.items.length; i++) {
                boolean swapB = (this.items[i] == null) ? false : true;
                if ((swapB) && (this.items[i].getId().equals(id))) {
                    System.out.println(" заявка по ID  найдена");
                    itemresult = this.items[i];
                    result = true;
                    return itemresult;
                }
                if (!result) {
                    System.out.println("заявка по ID не найдена");
                }
            }
            return null;   // спросить  про корректность этой фигни   и как ее обезопасить
        }



    /**
     *Метод DELETE
     * @param id
     * @return
     * 1 - проверка на пустую зявку через swapB
     * 2 - сдвиг стека на 1 позицию влево, начиная с найденой по ID
     * 3 - ужасно большой, уродливый код, но безопасный. SOUPы оставляем до прогона тестов.
     */

    public boolean delete(String id) {
        System.out.println("метод delete");
        boolean result = false;
        System.out.println("result = " + result);
        for (int i = 0; i < this.items.length; i++) {
            boolean swapB = (this.items[i] == null) ? false : true;

            if ( (swapB) && (this.items[i].getId().equals(id) )){
                System.out.println("мы в цикле и запускаем новый цикл с найденной заявки ");
                for ( int j = i+1; j < this.items.length; j++  ){
                    System.out.println("элемент № " + j +"; Всего -" + this.items.length +" эл-в.");
                    this.items[j-1] = this.items[j];
                    System.out.println("перехерачили очередной элемент");
                 }
                //хрень внизу не работает... вот незадача.
                //System.arraycopy(this.items, i + 1, this.swapItems, 0, (this.items.length - i));
                //System.arraycopy(this.swapItems, 0,this.items, i,this.swapItems.length-1);
                result = true;
            }
        }
        return result;
    }


    //Метод findByName
    public Item[] findByName (String key){

        boolean result = false;
        System.out.println("Сначала result = " + result);
        for (int i = 0; i < this.items.length; i++) {
            boolean swapB = (this.items[i] == null) ? false : true;
            if ((swapB) && (this.items[i].getName().equals(key))) {
                System.out.println(" заявка по NAME  найдена");
                    for (int j =0; j < this.swapItems.length ; j++)
                        swapItems[j] = this.items[i];
                        result = true;
                }
            if (!result) {
                System.out.println("заявка по NAME не найдена");
            }
        }
        return null;   // спросить  про корректность этой фигни   и как ее обезопасить
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