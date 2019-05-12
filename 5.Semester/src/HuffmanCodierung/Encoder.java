package HuffmanCodierung;

import SortStrategies.Insertionsort;
import SortStrategies.Sortable;

import java.util.*;

public class Encoder {
    private ArrayList<Pair> huffmanAlphabet;
    private Comparable[] array;
    private ArrayList<Pair>tree;
    public static void main(String[] args){
        Encoder encoder = new Encoder();
        encoder.encode();
    }

    private void encode(){

        Scanner input = new Scanner(System.in);
        String text = input.next();

        if(!text.isEmpty()) {
            array = new Comparable[text.length()];
           huffmanAlphabet = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                array[i] = text.charAt(i);
            }
            Sortable insertionsort = (Sortable) new Insertionsort();
            insertionsort.sort(array);

            System.out.println("STARTING SPLIT OPERATION");
            split();
            traverseOperation();

        }

    }
    private void split(){
            int i = 0;
            int sum = 0;
            Comparable temp = array[0];
            while(true){
                if(array[i]!=null) {
                    if (temp.equals(array[i])) {
                        sum += 1;
                        i += 1;
                    } else {
                        huffmanAlphabet.add(new Pair(sum, temp.toString()));
                        temp = array[i];
                        sum = 0;
                    }
                }else{
                    huffmanAlphabet.add(new Pair(sum,temp.toString()));
                    break;
                }
                if(i==array.length){
                    huffmanAlphabet.add(new Pair(sum,temp.toString()));
                    break;
                }
            }

    }
    private Pair findSmallestPair() throws Exception {
        int infinity = Integer.MAX_VALUE;
        Pair result = null;
        for(Pair pair:this.huffmanAlphabet){
            if(pair.i<=infinity && !pair.visited ){
                infinity = pair.i;
                result = pair;
            }
        }

        if(result==null) return null;

        return result;
    }
    private void traverseOperation(){
        try {
            while (true) {
                Pair firstHuffmanAlphabet = findSmallestPair();
                if(firstHuffmanAlphabet != null){
                    firstHuffmanAlphabet.visited = true;
                }
                Pair secondHuffmanAlphabet = findSmallestPair();

                if(secondHuffmanAlphabet != null){
                    secondHuffmanAlphabet.visited = true;
                }

                if(firstHuffmanAlphabet == null || secondHuffmanAlphabet == null){
                    break;
                }
                firstHuffmanAlphabet.bit = 1;
                secondHuffmanAlphabet.bit = 0;

                int newI = firstHuffmanAlphabet.i + secondHuffmanAlphabet.i;

                String newC="";

                newC = firstHuffmanAlphabet.mergedString +""+ secondHuffmanAlphabet.mergedString;


                Pair newPair = new Pair(newI,newC);
                newPair.visited = false;

                firstHuffmanAlphabet.parent = newPair;
                secondHuffmanAlphabet.parent = newPair;

                this.huffmanAlphabet.add(newPair);
            }


            StringBuilder finalCode = new StringBuilder();
            for(Pair p:this.huffmanAlphabet){
                if(p.visited) {
                    while(p.parent != null) {
                        //TODO FAST FERTIG !!
                        finalCode.insert(0,p.parent.bit);

                    }
                }
            }
            System.out.println(finalCode);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
