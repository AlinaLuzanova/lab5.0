import Collection.*;
import Commands.*;
import Data.Organization;


import java.io.*;
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        FileM fileM = new FileM();

        Stack<Organization> organization = fileM.read();

        CollectionManager collectionManager = new CollectionManager(organization);
        System.out.println("Добро пожаловать!");
        System.out.println("Напечатайте  help, чтобы начать");
        InputChecker inputChecker = new InputChecker();
        OrganizationAsker organizationAsker = new OrganizationAsker();
        CommandManager commandManager = new CommandManager(
                new Help(),
                new Info(),
                new Show(),
                new Add(),
                new update_id(),
                new remove_by_id(),
                new Clear(collectionManager),
                new execute_script(),
                new Exit(),
                new remove_first(),
                new Shuffle(),
                new History(),
                new Sum_of_annual_turnover(),
                new count_less_than_postal_address (),
                new filter_by_employees_count () );
        Commander commander = new Commander(commandManager, new Scanner(System.in), fileM);
        commander.interactiveMode();

    }
}
