package trainingFromOleg.trackerProject;

public class StartUI {

    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD =        "0";
    private static final String FINDALL =    "1";
    private static final String REPLACE =    "2";
    private static final String DELETE =     "3";
    private static final String FINDBYID =   "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT =       "6";

    /**
     * Получение данных от пользователя.
     */
    private final ConsoleInput consoleInput;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /*** Конструтор инициализирующий поля.
     * @param consoleInput ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(ConsoleInput consoleInput, Tracker tracker) {
        this.consoleInput = consoleInput;
        this.tracker = tracker;
    }


    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.consoleInput.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();

            } else if (FINDALL.equals(answer)) {
                this.findAllItem();

            } else if (REPLACE.equals(answer)) {
                this.replaceItem();

            } else if (DELETE.equals(answer)) {
                this.deleteItem();

            } else if (FINDBYID.equals(answer)) {
                this.findByIdItem();

            } else if (FINDBYNAME.equals(answer)) {
                this.findByNameItem();

            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }


    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.consoleInput.ask("Введите имя заявки :");
        String desc = this.consoleInput.ask("Введите описание заявки :");
        Item item = new Item(name, desc, Item.generateId());
        this.tracker.add(item);

        this.tracker.printItems(Tracker.items);

    }

    /**
     * Метод реализует получение списка всех заявок
     */

    private void findAllItem() {

        System.out.println("------------ Получение списка всех заявок  --------------");
        this.tracker.findAll();
        this.tracker.printItems(this.tracker.swapItems);
        // tracker.cleansSwapItems(); //чистка выводного массива
        System.out.println("------------конец списка заявок -----------");

    }


    /**
     * Метод реализует редактирование заявок
     */

    private void replaceItem() {

        System.out.println("------------Замена  заявки --------------");
        String name = this.consoleInput.ask("Введите новое имя заявки :");
        String desc = this.consoleInput.ask("Введите новое описание заявки :");
        Item item2Cons = new Item(name, desc);
        String id = this.consoleInput.ask("Введите ID старой заявки :");
        this.tracker.replace( id, item2Cons);
        //this.tracker.findAll();  // Для проверки!!! после проверки удалить
    }


    /**
     * Метод реализует удаление заявок
     */

    private void deleteItem() {

        System.out.println("------------Удаление  заявки --------------");
        String id = this.consoleInput.ask("Введите ID  заявки :");
        this.tracker.delete(id);

        this.tracker.printItems(this.tracker.items);
        tracker.cleansSwapItems(); //чистка
        //this.tracker.findAll();  // Для проверки!!! после проверки удалить
    }


    /**
     * Метод реализует получение списка по имени
     */
    private void findByNameItem() {
        System.out.println("------------Поиск заявки по Name --------------");
        String name = this.consoleInput.ask("Введите Name:");
        this.tracker.findByName(name);
        this.tracker.printItems(this.tracker.swapItems);

        tracker.cleansSwapItems(); //чистка
    }


    /**
     * Метод реализует получение заявки по id
     */

    private void findByIdItem() {

        System.out.println("------------Поиск заявки по ID  --------------");
        String id = this.consoleInput.ask("Введите ID  заявки (просто цифрами):");
        this.tracker.findById(id);


        }


    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item / Добавить заявку");
        System.out.println("1. Show all items / Показать все заявки");
        System.out.println("2. Edit item / Редактировать заявку");
        System.out.println("3. Delete item / Удалить заявку");
        System.out.println("4. Find item by Id / Найти заявку по Id");
        System.out.println("5. Find items by name / Найти заявку по Имени");
        System.out.println("6. Exit Program / Выход из программы");
        System.out.println("Select / Ваш выбор:");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
