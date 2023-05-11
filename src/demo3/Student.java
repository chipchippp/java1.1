package demo3;

public class Student {
    int id;
    String name;
    int age;


    public Student (int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public void learn(){
        System.out.println(name + " learning...");
    }

    public static class Person {
        int name;
        int age;
        String telephone;
        String address;

        public Person(int name, int age, String telephone, String address) {
            this.name = name;
            this.age = age;
            this.telephone = telephone;
            this.address = address;
        }

        public int getName() {
            return name;
        }

        public void setName(int name) {
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

    public static class Room {
        String name;
        int  position;
        int listPerson;

        public Room(String name, int position, int listPerson) {
            this.name = name;
            this.position = position;
            this.listPerson = listPerson;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getListPerson() {
            return listPerson;
        }

        public void setListPerson(int listPerson) {
            this.listPerson = listPerson;
        }




    }
}
