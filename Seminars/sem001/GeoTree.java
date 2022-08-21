package tree;

import java.util.ArrayList;
import java.util.List;

public class GeoTree {

    private List<Person> family = new ArrayList<>();
    private static int countFamily = 0;

    public GeoTree() {
        countFamily++;
    }

    public boolean addToFamily(Person person){
        if (!family.contains(person)){
            family.add(person);
            return true;
        }
        return false;
    }

    public boolean isParent(Person parent, Person child){
        return parent.getChildren().contains(child);
    }

    public boolean isBrother(Person current, Person brother, Person parent){
        return isParent(parent, current) && isParent(parent, brother);
    }

    public static int getCountFamily() {
        return countFamily;
    }
}
