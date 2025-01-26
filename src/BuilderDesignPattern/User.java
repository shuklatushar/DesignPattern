package BuilderDesignPattern;

public class User {

    private final String name;
    private final String email;
    private final int age;

    private User(UserBuilder userBuilder){
        this.name=userBuilder.name;
        this.email=userBuilder.email;
        this.age=userBuilder.age;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Name : "+name+",Email :"+email+",Age :"+age;
    }
    static class UserBuilder{
        private String name;
        private String email;
        private int age;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
