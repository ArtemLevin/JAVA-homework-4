import java.util.LinkedList;
import java.util.Random;

public class task_1{

    public static LinkedList<Integer> reverse(LinkedList<Integer> myLinkedList){

        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        while (myLinkedList.size() != 0) {

            reversedLinkedList.add(myLinkedList.pollLast());
        }
        return reversedLinkedList;
    }
    public static void main(String[] args) {
        
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            myLinkedList.add(rnd.nextInt(10));
        }

        System.out.println(myLinkedList);
        System.out.println(reverse(myLinkedList));
    }   
}