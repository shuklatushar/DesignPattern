package IteratorDesignPattern;

public class Main {

    public static void main(String args[]){

        User user1=new User("Tushar","123");
        User user2=new User("Rishita","890");
        User user3=new User("Mansi","891");

        UserManagement userManagement=new UserManagement();
        userManagement.addUser(user1);
        userManagement.addUser(user2);
        userManagement.addUser(user3);

        MyIterator myIterator=userManagement.getIterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
