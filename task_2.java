import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task_2{

    public static LinkedList<Integer> enqueue(LinkedList<Integer> myList){
        Scanner input = new Scanner(System.in);
        System.out.print("Ведите число для вставки ----> ");
        Integer newInteger = input.nextInt();
        myList.add(myList.size(), newInteger);
        input.close();
        return myList;
    }

    public static int dequeue(LinkedList<Integer> myList){

        int first = myList.peekFirst();
        myList.remove(myList.peekFirst());
        return first;
    }

    public static int first(LinkedList<Integer> myList){

        int first = myList.peekFirst();
        return first;
    }

    public static void main(String[] args) {
        
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) myLinkedList.add(rnd.nextInt(10));
        System.out.println("Исходный список ----> " + myLinkedList + "\n");
        System.out.println("Список после вставки нового элемента ----> " + enqueue(myLinkedList) + "\n");
        System.out.println("Возвращаем первый элемент и удаляем его из списка ---->  " + dequeue(myLinkedList) + "\n");
        System.out.println("Список после удаления первого элемента ----> " + myLinkedList + "\n");
        System.out.println("Возвращаем первый элемент и не удаляем его из списка ----> " + first(myLinkedList) + "\n");
        System.out.println("Список после возарщения первого элемента без удаления ----> " + myLinkedList + "\n");


    }
    
}
