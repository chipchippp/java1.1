package slot14;

import java.util.Objects;

public class Student implements Comparable<Student>{

     private String id, name, adress, dateOfBirth;

    private float gpa;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String adress, String dateOfBirth, float gpa) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return Float.compare(student.getGpa(), getGpa()) == 0 && Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAdress(), getDateOfBirth(), getGpa());
    }
}
