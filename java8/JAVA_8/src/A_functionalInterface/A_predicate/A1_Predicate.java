package A_functionalInterface.A_predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class A1_Predicate {
    public static void main(String[] args) {
        // Initialize a list of Person objects
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 35));
        persons.add(new Person("Charlie", 28));
        persons.add(new Person("David", 40));
        persons.add(new Person("Eva", 22));

        int ageThreshold = 30;

        Predicate<Person> aboveAgeThreshold = person -> person.getAge() > ageThreshold;

        // Remove persons above the age threshold from the list, we have use removeIf(predicate) of collection Interface :)
        persons.removeIf(aboveAgeThreshold);

        // Now 'persons' list contains only persons below or equal to the age threshold.
        System.out.println("Persons below or equal to the age threshold:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

