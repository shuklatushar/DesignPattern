package BuilderDesignPattern;

public class main {
    public static void main(String args[]){

        User user=new User.UserBuilder()
                .setName("Tushar")
                .setEmail("shuklatushar@gmail.com")
                .setAge(23)
                .build();
        System.out.println(user);

    }
}
