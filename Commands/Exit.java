package Commands;

public class Exit implements Commands {
    public void execute(String[] args, boolean filename) {
        System.exit(0); //Завершает работу запущенной в данный момент виртуальной машины Java.;
    }
}