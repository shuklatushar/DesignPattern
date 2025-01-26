package IteratorDesignPattern;

public class User {

    private String name;
    private String userId;

    public User(String name,String userId){
           this.name=name;
           this.userId=userId;
    }

    @Override
    public String toString() {
        return "User Name : "+this.name+", UserId : "+this.userId;
    }
}
