package slot8;

public class Main {
    public static void main(String[] args) {
        // Create some Person objects
        Person person1 = new Person("John Smith", 30, "555-1234", "123 Main St");
        Person person2 = new Person("Jane Doe", 25, "555-5678", "456 Oak Ave");
        Person person3 = new Person("Bob Johnson", 45, "555-9012", "789 Elm St");
//        Person person4 = new Person("anv", 21, "555-90122", "7289 Elm St");
//        Person person5 = new Person("aaa", 24, "555-56785", "4556 Oak Ave");

        // Create a Room object
        Room room1 = new Room("101", "First Floor");

        // Add people to the room
        room1.addPerson(person1);
        room1.addPerson(person2);
        room1.addPerson(person3);
//        room1.addPerson(person4);
//        room1.addPerson(person5);


        // Print the room information
        room1.printInfo();

        // Remove a person from the room
        room1.removePerson(person2);

        // Sort people in the room by name
        room1.sortByName();

        // Print the updated room information
        room1.printInfo();
    }
}
