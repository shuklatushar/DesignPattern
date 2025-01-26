package Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonMain {
    public static void main(String args[]) throws Exception{

        System.out.println("welcome to Singleton Example");

        Samosa samosa1=Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Samosa samosa2=Samosa.getSamosa();
        System.out.println(samosa2.hashCode());


        SynchronizedExample synchronizedExample1=SynchronizedExample.getObject();
        System.out.println(synchronizedExample1.hashCode());

        SynchronizedExample synchronizedExample2=SynchronizedExample.getObject();
        System.out.println(synchronizedExample2.hashCode());

//      Securing our class singleton behaviour from reflection api
//        System.out.println("Protection from Reflection API");
//        Constructor<Samosa> constructor= Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s3=(Samosa) constructor.newInstance();
//        System.out.println(s3.hashCode());

//        serializing and deserializing also creates different object
        System.out.println("Protection from serialization/deserialization");
        System.out.println(samosa1.hashCode());
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.txt"));
        oos.writeObject(samosa1);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
        Samosa samosa3=(Samosa) ois.readObject();
        System.out.println(samosa3.hashCode());

        System.out.println("Protection from cloning");
        System.out.println(samosa3.hashCode());
        Samosa samosa4 =(Samosa) samosa3.clone();
        System.out.println(samosa4.hashCode());


    }
}
