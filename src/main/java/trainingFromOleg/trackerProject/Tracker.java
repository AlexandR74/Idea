package trainingFromOleg.trackerProject;


public class Tracker {


    /**
     * Массив для хранение заявок.
     */


    public  static Item[] items = new Item[5];
    public  static Item[] swapItems = new Item[5];

    //-------------------Методы------------------------

    /**
     * Метод ADD: Добавляет заявку (а для этого он):
     *            1)генерирует № позиции (пожаробезопасно).
     *            2)для безопасной генерации введен тригер позиции - isTrigPos  (отвечает:назначалась ли ранее позиция)
     *            3)добавление item в массив items.
     * @param item
     * @return
     */
    public Item add(Item item) {
        System.out.println("Запущен метод ADD," + " генерируем позицию.");

        // Важный блок
        int number = generatePosition(item);
        this.items[number] = item;
        // Конец важного блока
         return item;
    }


    /**
     * Метод findAll: Выводит на экран Все зявки. (а для этого он):
     *                1) Копирует все (кроме пустых) завки в дублирующий массив.
     *                2) Отправляет дублирующий массив на выход метода.
     *                3) В StartUI дублирующий массив распечатывается методом  printItems.
     * @return swapItems
     */
    public Item[] findAll() {
        System.out.println(" метод findAll");
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                this.swapItems[i] = this.items[i];
            }
        }
        return swapItems;
    }


    /**
     *  Метод replace: Замена Имени и Описание заявки, найденной по id.  (а для этого он):
     *                  1) добавляет имя и описание новой завки в дублирующий массив (первый элемент).
     *                  2) находит перебором заявку с нужным id в основном массиве заявок.
     *                  3) производит выгрузку имени,описания из дублирующего массива в примитив переменные
     *                      добавление имени, описания в найденный элемент основного массива.
     *                  4) выводит из метода true если замена заявки произошла.
     * @param id
     * @param item2Cons
     * @return boolean
     */
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


    /**
     * Метод findById :  Находит Заявку по ID  и возвращает ее, не распечатывая. (а для этого он):
     *                   1) Поиск по основному массиву перебором на сравнение по id
     *                   2) Копирование заявки в ссылочную переменную itemresult
     *                   3) возврат из метода itemresult если заявка найдена. else null.
     * @param id
     * @return Item item
     */
    public  Item findById (String id){
        //  для itemresult мы создали конструктор без параметров
        Item itemresult;
            boolean result = false;
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
     *Метод delete: Должен находить заявку по id.
     *               Удалять ее, сдвигая хвост основного массива заявки на 1 позицию влево.(а для этого он):
     *               1) Перебирает массив и находит заявку по Id
     *               2) Сдвигает заявки (начиная с найденного +1) влево, затирает найденную заявку.
     *               3) возвращает true при успешном удалении завки
     * @param id
     * @return
     * 1 - проверка на пустую зявку через swapB
     * 2 - сдвиг стека на 1 позицию влево, начиная с найденой по ID
     * 3 - ужасно большой, уродливый код, но безопасный. SOUPы оставляем до прогона тестов.
     */

    public boolean delete(String id) {
        System.out.println("метод delete");
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            boolean swapB = (this.items[i] == null) ? false : true;

            if ( (swapB) && (this.items[i].getId().equals(id) )){
                System.out.println("мы в цикле и запускаем новый цикл с найденной заявки ");
                for ( int j = i+1; j < this.items.length; j++  ){
                    System.out.println("элемент № " + j +"; Всего -" + this.items.length +" эл-в.");
                    this.items[j-1] = this.items[j];
                    System.out.println("переписали очередной элемент");
                 }
                //хрень внизу не работает... вот незадача.
                //System.arraycopy(this.items, i + 1, this.swapItems, 0, (this.items.length - i));
                //System.arraycopy(this.swapItems, 0,this.items, i,this.swapItems.length-1);
                result = true;
            }
        }
        return result;
    }


    /**
     * Метод findByName: Находит в массиве заявок все заявки имеющие совпадение по Имени.
     *                   Выводит их отдельно.(а для этого он):
     *                   1) Идет перебором по элементам массива сравнивая по Имени.
     *                   2) Копирует заявку имеющую совпадение по имени в дублирующий массив.
     *                   3) Отправляет на вывод метода дублирующий массив с найденными заявками.
     * @param key
     * @return
     */
    public Item[] findByName (String key){

        boolean result = false;
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
     *
     * Служебный Метод generatePosition:  генирует позицию для метода ADD:
     *      1) Перебором находит в основном массиве номер первого Пустого элемента
     *      2) назначает этот номер в виде позиции для добавленной заявки.
     */
    public int generatePosition (Item item) {
        System.out.println("метод генерации позиции / generatePosition");
        for (int i = 0; i < this.items.length; i++) {
            int swapPos=i;

            boolean swapB = (this.items[i] == null) ? false : true;
            System.out.println(" ранее позиция назначалась? = " +swapB);
            if (swapB == false) {
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






    /**
     *  Служеблный метод printItems Выводит на экран  items по строчно
     *
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

    /**
     * Служебный метод cleansSwapItems(): производит удаление всех элементов во вспомагательном массиве swapItems;
     */
    public  void cleansSwapItems (){
        for (int i = 0; i < this.swapItems.length; i++){
            this.swapItems[i] = null;
        }
    }


}