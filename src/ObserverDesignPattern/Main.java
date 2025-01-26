package ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String args[]) throws IOException {

        Subject channel = new Channel();

        Observer aman=new Subscriber("Aman");
        Observer raman=new Subscriber("Raman");
        channel.subscribe(aman);
        channel.subscribe(raman);

        channel.notifyChanges("DSA Array");
        channel.notifyChanges("Design Pattern");
        channel.unsubscribe(aman);
        channel.notifyChanges("Api Integration");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create subscriber");
            System.out.println("Press 3 to exit");

            int c=Integer.parseInt(br.readLine());
            if(c==1){
                System.out.println("Please provide title for new video");
                String title=br.readLine();
                channel.notifyChanges(title);
            }
            else if(c==2){
                System.out.println("Please provide name of new subscriber");
                String name= br.readLine();
                Observer subscriber=new Subscriber(name);
                channel.subscribe(subscriber);
            }
            else if(c==3){
                System.out.println("Thanks for using visit Again");
                break;
            }
            else{
                System.out.println("Wrong Input");
                break;
            }
        }
    }

}
