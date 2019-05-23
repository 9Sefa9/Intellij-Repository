package Stist;

import java.util.ArrayList;

public class Stist<T> extends ArrayList<T> {

    T item;
    public Stist(T item){
        this.item = item;
    }
    public Stist(){

    }
    private void push(T item){
        try{
            Stist stist = new Stist(item);
            ArrayList<Stist> newList = new ArrayList<>();
            newList.add(item);
            add(new Stist(newList));
        }catch (NullPointerException n){
            n.printStackTrace();
        }
    }
    private T pull(){
        return get(0);
    }
}
