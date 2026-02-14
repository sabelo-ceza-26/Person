package za.ac.cput.Factory;
import za.ac.cput.domain.Person;

public class PersonFactory {
    public static void main(String[] args) {

        Person person = new Person.Builder()
                .setName("Alice")
                .setPhoneNumber("0780264848")
                .setEmail("22648921@mycput.ac.za")
                .build();

        System.out.println(person.toString());
    }

}
