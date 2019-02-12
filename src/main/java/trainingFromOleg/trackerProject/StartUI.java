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
//добавление заявки вынесено в отдельный метод.
                this.createItem();
             } else if (FINDALL.equals(answer)) {
                this.findAllItem();
            }
             else if (EXIT.equals(answer)) {
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
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }


    /**
     * Метод реализует редактирование заявок
     */

    private void replaceItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.consoleInput.ask("Введите ID для поиска :");
        String name = this.consoleInput.ask("Введите имя заявки :");
        String desc = this.consoleInput.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.replace(id,item);
        System.out.println("------------ Новая заявка с replace : " + item.getId() + "-----------");

    }


    /**
     * Метод реализует удаление заявок
     */

    private void deleteItem() {


    }


    /**
     * Метод реализует получение списка всех заявок
     */

    private void findAllItem() {

    }

    /**
     * Метод реализует получение списка по имени
     */

    private void findByNameItem() {

    }



    /**
     * Метод реализует получение заявки по id
     */

    private void findByIdItem() {

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
// добавить остальные пункты меню.
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
