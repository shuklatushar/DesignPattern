package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator{

    private List<User> list;
    private int length;
    private int position=0;

    public MyIteratorImpl(List<User> list){
         this.list=list;
         length= list.size();
    }

    public Boolean hasNext() {
        if(position>=length)return false;
        return true;
    }

    public Object next(){
        return list.get(position++);
    }
}
