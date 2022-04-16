package Collection;
import Commands.Commands;
/*
Здесь прописаны классы команд, выполнение которых программа поддерживает
в интерактивном режиме

Используем для этого конструктор для класса Commandmanager, куда
поместим классы, в которых необходимые методы реализуются
 */

// TODO: переделать на хэшмеп
public class CommandManager {
    public final HashMap<String, Command> commands = new HashMap<>();

public CommandsList(CollectionManager collectionManager) {
        commands.put("add", new Add(collectionManager));
        commands.put("info", new Info(collectionManager));
        commands.put("show", new Show(collectionManager));
        commands.put("update_id", new Update(collectionManager));
        commands.put("remove_by_id", new RemoveById(collectionManager));
        commands.put("clear", new Clear(collectionManager));
        commands.put("remove_first", new RemoveFirst(collectionManager));
       // commands.put("print_ascending", new PrintAscending(collectionManager));
        commands.put("filter_by_employees_count", new FilterByEmployessCount(collectionManager));
        commands.put("count_less_than_weapon_type", new CountLessThanWeaponType(collectionManager));
        commands.put("remove_greater", new RemoveGreater(collectionManager));
        commands.put("add_if_min", new AddIfMin(collectionManager));
        commands.put("execute_script", new ExecuteScript(this));
        commands.put("save", new Save(collectionManager));
        commands.put("help", new Help(commands));
        commands.put("exit", new Exit());

    /*
    Создаём методы, возвращающие выполнение интерактивных методов
     */

    public void info() {

    }

    // Поменять
    public static boolean show() {
        return show.execute();
    }

    public static boolean add() {
        return add.execute();
    }

    public static boolean update_id(String s) {
        return update_id.execute(s);
    }

    public static boolean remove_by_id(String s) {
        return remove_by_id.execute(s);
    }

    public void clear() {
        return clear.execute();
    }

    public static boolean save() {
        return save.execute();
    }


    public static boolean execute_script() {
        return save.execute();
    }

    public static boolean exit() {
        return exit.execute();
    }


    public static boolean remove_first(String s) {
        return remove_first.execute(s);
    }

    public static boolean shuffle() {
        return shuffle.execute();
    }

    public static boolean history() {
        return history.execute();
    }


    public static boolean sum_of_annual_turnover() {
        return sum_of_annual_turnover.execute();
    }


}
