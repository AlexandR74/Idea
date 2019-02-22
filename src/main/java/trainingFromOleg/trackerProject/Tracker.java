package trainingFromOleg.trackerProject;



public class Tracker {


    /**
     * Массив для хранение заявок.
     */


    public Item[] items = new Item[5];
    public Item[] swapItems = new Item[5];

    private int position = 0;

    //-------------------Методы------------------------

    //Метод ADD
    public Item add(Item item) {
        System.out.println("метод ADD");
        this.items[position] = item;
        position++;
        return item;
    }


    //Метод Findall
    public Item[] findAll() {
        System.out.println("Метод findAll");
        for (int i = 0; i < this.items.length; i++) {

            if (this.items[i].getId().equals(this.swapItems[i].getId())) {
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
            if ( this.items[i].getId().equals(id)){
                itemresult=this.items[i];
                return itemresult;
            }
        }
        return null;
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
     * printItem распечтает item
     */
    public  void printItems(Item[] items ) {

        for (int i = 0; this.items[i] != null; i++) {
            System.out.println("ID = " + this.items[i].getId() + "; " + " Name = " + this.items[i].getName() + "; " + " Desc = "
                    + this.items[i].getDesc() + "; ");
        }
    }

    public  void cleansSwapItems (){
        for (int i = 0; this.swapItems[i] != null; i++){
            delete(this.swapItems[i].getId());
        }
    }
}