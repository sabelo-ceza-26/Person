package za.ac.cput.domain;

public class Person {
    //Just to be safe, make your attributes protected
    protected String name;
    protected String phoneNumber;
    protected String email;

    //Always make constructor private
    public Person() {
    }

    public Person(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(Builder builder){
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person: " +
                "\nName: " + name +
                "\nPhone Number: " + phoneNumber +
                "\nEmail: " + email;
    }
    public static class Builder {
        protected String name;
        protected String phoneNumber;
        protected String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Person person) {
            this.name = person.name;
            this.phoneNumber = person.phoneNumber;
            this.email = person.email;
            return this;

        }

        public Person build() {
            return new Person(this);
        }

    }
}

