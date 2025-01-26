package PrototypeDesignPattern;

public class Main {

    public static void main(String args[]){

        NetworkConnection networkConnection=new NetworkConnection("196.168.4.2");
        try {
            networkConnection.loadImportantData();


            System.out.println(networkConnection);
            NetworkConnection networkConnection1=(NetworkConnection) networkConnection.clone();
            networkConnection.getDomain().remove(0);

            System.out.println(networkConnection);
            System.out.println(networkConnection1);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
