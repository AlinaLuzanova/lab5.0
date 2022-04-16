package Commands;

import Collection.CollectionManager;

public class Save extends AbstractCommand {
    private final CollectionManager cm;

    public Save(CollectionManager cm) {
        this.cm = cm;
    }

    public boolean execute() {
        cm.save();
        return true;
    }
}
