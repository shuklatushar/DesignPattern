package Singleton;

public class SynchronizedExample {

    private static SynchronizedExample synchronizedExample;
    private SynchronizedExample(){

    }
    public static SynchronizedExample getObject(){
        if(synchronizedExample==null){
            synchronized (SynchronizedExample.class){
                if(synchronizedExample==null){
                    synchronizedExample = new SynchronizedExample();
                }
            }
        }
        return synchronizedExample;
    }
}
