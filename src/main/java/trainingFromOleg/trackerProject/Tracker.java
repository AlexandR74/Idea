package trainingFromOleg.trackerProject;

public class Tracker {


    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0; // про это ничего нет  в Астах


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

    // метод replace -- он же  update в астах
    public boolean replace(String id, Item item) {
        //item.getId().equals(tmp.getId()). сравнивать надо так
        /**
         * . Метод public boolean replace(String id, Item item)
         * должен заменить ячейку в массиве this.items.
         * Для этого необходимо найти ячейку в массиве по id.
         * Метод должен вернуть boolean результат - удалось ли провести операцию.
         */

        return false;
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





    // метод findAll -- оно же getAll в астах
    // ЧТО ИМЕЛОСЬ ВВИДУ ПО ЗАДАНИЮ? Метод public Item[] findAll() возвращает копию массива this.items без null элементов
    public Item[] findAll() {
        for (int i = 0; i < this.items.length; i++) {
            //инициализируем копию массива
            Item[] resultItems = new Item[100];

            if (!(items[i] == null)) {
                resultItems[resultItems.length] = this.items[i];    // правильно ли?

                System.out.println(items[i]);
            }
            return resultItems;
        }
    }

        // метод findByName

        /**
         * Метод public Item[] findByName(String key)
         * проверяет в цикле все элементы массива this.items,
         * сравнивая name (используя метод getName класса Item)
         * с аргументом метода String key.
         * Элементы, у которых совпадает name,
         * копирует в результирующий массив и возвращает его;
         * @param key
         * @return items
         */
        public Item[] findByName (String key){

            //инициализируем результирующий массив;
            Item[] itemsResult = new Item[100];

            for (int i = 0; i < this.items.length; i++) {
                if (Item.getName().equals(key)) {
                    itemsResult[itemsResult.length] = this.items[i]; // Правильно ли?
                }
            }

            return itemsResult;  //вывод массива надо.
        }


        //метод findById
        public Item findById (String id){

            return items;
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
