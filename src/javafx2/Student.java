package javafx2;

public class Student {

        private String name, email, telePhone;

        public Student(String name, String email, String telePhone) {
            this.name = name;
            this.email = email;
            this.telePhone = telePhone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelePhone() {
            return telePhone;
        }

        public void setTelePhone(String telePhone) {
            this.telePhone = telePhone;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", telePhone='" + telePhone;
        }
    }

