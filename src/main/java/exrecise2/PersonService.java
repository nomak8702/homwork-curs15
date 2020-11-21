package exrecise2;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) throws NoNameException, NoAgeException {
        List<Person> result = new ArrayList<>();
        result.add(person);
        for (Person per : result) {
            if (per.getName() != null || !per.getName().isEmpty()) {
                for (char c : per.getName().toCharArray()) {
                    if (Character.isDigit(c)) {
                        throw new NoNameException("Name contain Digit!! " + per.getName());
                    } else if (per.getAge() <= 0) {
                        throw new NoAgeException("Age is incorrect!! " + per.getAge());
                    }
                }
            }
        }
        for (Person per : result) {
            int count = persons.size();
            count++;
            per.setId(count);
            persons.add(per);
        }
    }

    public void removePerson(int id) throws NoOldException {

        List<Person> toRemove = new ArrayList<>();
        int count = persons.size() + 1;
        int numId = 0;
        for (Person per : persons) {
            count--;
            numId = (persons.size() - count) + 1;
            if (per.setId(numId) == id) {
                toRemove.add(per);
            }
        }
        if (toRemove.isEmpty()) {
            throw new NoOldException("Person Id " + id + " doesn't exist! ");
        } else {
            persons.removeAll(toRemove);
        }
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public List<Person> getPersonsOlderThan(int age) throws NoAgeException {
        List<Person> result = new ArrayList<>();
        if (age <= 0 || age > 120) {
            throw new NoAgeException("Age " + age + " is incorrect!! ");
        } else {
            for (Person per : persons) {
                if (per.getAge() > age) {
                    result.add(per);
                }
            }
        }
        return result;
    }

    public List<String> getAllPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person per : persons) {
            result.add(per.getName());
        }
        return result;
    }

    public Person getPerson(String name) throws NoOldException {
        boolean check = false;
        for (Person per : persons) {
            if (per.getName().equalsIgnoreCase(name)) {
                check = true;
                return per;
            }
        }
        if (!check) {
            throw new NoOldException("Person name " + name + " not exist! ");
        }
        return new Person("", 0);

    }

    public Person getPersonById(int id) throws NoOldException {
        boolean check = false;
        int count = persons.size() + 1;
        int num = 0;
        for (Person per : persons) {
            count--;
            num = (persons.size() - count) + 1;
            if (per.setId(num) == id) {
                check = true;
                return per;
            }
        }
        if (!check) {
            throw new NoOldException("Person Id " + id + " doesn't exist! ");
        }
        return new Person("", 0);
    }
}
