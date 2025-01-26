package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String importantData;
    private List<String> domain= new ArrayList<String>();

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public NetworkConnection(String ip){
         this.ip=ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportantData() throws InterruptedException{
        System.out.println("Loading very very Important Data...");
        this.importantData="IMPDATAFROMDB";
        domain.add("www.google.com");
        domain.add("www.youtube.com");
        domain.add("www.apple.com");

        Thread.sleep(5000);
    }

    @Override
    public String toString(){
        return "ip address :"+ip+",Important Data :"+domain;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        NetworkConnection networkConnection=new NetworkConnection(this.ip);
        networkConnection.importantData=this.importantData;
        for(String s:this.getDomain()){
            networkConnection.getDomain().add(s);
        }
        return networkConnection;
    }
}
