package slot8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person {
        private String name;
        private int age;
        private String telephone;
        private String address;

        public Person(String name, int age, String telephone, String address) {
            this.name = name;
            this.age = age;
            this.telephone = telephone;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

     class Room {
        private String name;
        private String position;
        private ArrayList<Person> listPerson;

        public Room(String name, String position) {
            this.name = name;
            this.position = position;
            this.listPerson = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public void addPerson(Person person) {
            listPerson.add(person);
        }

        public void removePerson(Person person) {
            listPerson.remove(person);
        }

        public void printInfo() {
            System.out.println("Room " + name + " is located at " + position);
            System.out.println("List of people:");
            for (Person person : listPerson) {
                System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Telephone: " + person.getTelephone() + ", Address: " + person.getAddress());
            }
        }

        public void sortByName() {
            Collections.sort(listPerson, Comparator.comparing(Person::getName));
        }
    }

