package Tests;

public class LinkedListX {

    gescheit18888@gmail.com
    public void turnOver(){
        Waggon head = this.head;
        Waggon size = this.head.size;
        Waggon next = this.head.next();
        Train newTrain = new Train();

        while(size>0 && head != null) {
            while (next != null) {
                head = head.next();
                next = head.next();
            }
            newTrain.appendWaggon(head);
            size-=1;


            head = this.head;
        }
    }
}
