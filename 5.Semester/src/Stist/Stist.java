package Stist;

import java.util.ArrayList;
import java.util.Arrays;

class Node<T>{
    protected ArrayList<T> nodeList = new ArrayList<>();
}
public class Stist<T> extends ArrayList<Node<T>> {

    private void push(T item){
        try{
            Node<T> node = new Node<T>();
            node.nodeList.add(item);
            add(node);
        }catch (NullPointerException n){
            n.printStackTrace();
        }
    }
    private void push(T[] items){
        try{
            Node<T> node = new Node<T>();
            node.nodeList.addAll(Arrays.asList(items));
            add(node);
        }catch (NullPointerException n){
            n.printStackTrace();
        }

    }
    private Node<T> pull(){
        Node<T> tmp = get(size()-1);
        remove(get(size()-1));
        return tmp;
    }

    @Override
    public String toString() {

        for(int i = 0; i<size(); i++){
            if(!get(i).nodeList.isEmpty()){
                for(int j = 0; j<get(i).nodeList.size();j++){
                    System.out.println(get(i).nodeList.get(j));
                }
            }
        }


        return "";
    }

    public static void main(String[] args){
        Stist<Integer> s = new Stist<Integer>();
        s.push(new Integer[]{3,2,1,0});
        s.push(new Integer[]{3,2,1,0});
        s.push(new Integer[]{3,2,1,0});
        System.out.println(s);
    }
}
