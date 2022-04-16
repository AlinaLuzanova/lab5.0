package Collection;

import Data.Organization;
import Data.OrganizationType;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;
/*
в этом классе прописаны методы классов интерактивных методов  и методы
необходимые для их работы
Одина объект CM содержит одну коллекцию
создали файл тут
 */

public class CollectionManager {

    private final LocalDateTime creationDate = LocalDateTime.now();
    /*
    неизменяемый класс, который представляет объекты Date
    в формате по умолчанию yyyy-MM-dd.
     Мы можем использовать метод now(), чтобы получить текущую дату.
     */
    private Stack<Organization> organizations;

    public CollectionManager(Stack<Organization> organization) {
        this.organizations = organizations;

    }

    public void show() {
        System.out.println(collection);
    }

        public void add() {
            organizations.add(o);
        }


    public boolean remove_by_id(Long id){

        for(Iterator <Organization> iterator = organizations.iterator();
            iterator.hasNext();){
            Organization organization = iterator.next();
            if(organization.getId() == id){

                iterator.remove();
            }
        }
        return true;
    }

        public void clear() {
            organizations.clear();
        }

//execute_script

        public void exit() {
            System.exit(2);
        }

        public void remove_first() {

        }

    public LocalDateTime getCreationDate() {
        return this.creationDate;


    }

    public CollectionManager(TreeSet<Organization> organization) {
    }


    public void save() {
        FileM fileM = new FileM();
        fileM.writeCSV(organizations);
    }
}