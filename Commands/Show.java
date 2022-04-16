package Commands;

import Collection.CollectionManager;
public class Show extends AbstractCommand {
    private final CollectionManager cm;

    public Show(CollectionManager c) {
        this.cm = c;
    }

    public boolean execute_script() {
        cm.show();
        return true;
    }
}