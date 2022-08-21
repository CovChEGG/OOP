package tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class Person {

    private String fullName;
    private LocalDate birthdate;
    private List<Person> children = new ArrayList<>();

    public Person(String fullName, LocalDate birthdate) {
        this.fullName = fullName;
        this.birthdate = birthdate;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void appendToFamily(Person p) {
        if (nonNull(p) && !p.equals(this) && birthdate.isBefore(p.getBirthdate()))
            children.add(p);
    }

}
