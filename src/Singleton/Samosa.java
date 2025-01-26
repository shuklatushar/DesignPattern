package Singleton;

import java.io.Serializable;

public class Samosa implements Serializable,Cloneable {

    private static Samosa samosa;

    private Samosa(){
         if(samosa!=null){
             throw new RuntimeException("you are trying to break singleton behavour");
         }
    }
    public static Samosa getSamosa(){
        if(samosa==null){
            samosa=new Samosa();
        }
        return samosa;
    }
    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return samosa;
    }
}
