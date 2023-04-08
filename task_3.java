import java.util.LinkedList;
import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task_3{
        public static void main(String[] args) {
            
        Scanner symbol = new Scanner(System.in);
        LinkedList<Double> resultLinkedList = new LinkedList<>();
        boolean counter = true;

        System.out.print("Enter num1 --> ");
        double num1 = symbol.nextInt();
        double resultDouble = 0;
        try{

            while(counter == true){

                System.out.print("Enter action --> ");
                String action = symbol.next();
                
                if (action.equals("cancel")){

                    resultLinkedList.remove(resultLinkedList.size()-1);
                    num1 = resultLinkedList.peekLast();
                    System.out.println("Отмена: последний результат ---->  " + num1);
                    
                }

                else{

                    System.out.print("Enter num2 -->  ");
                    int num2 = symbol.nextInt();

                    String a = "+";
                    String b = "-";
                    String c = "*";
                    String d = "/";
            
                    if (action.equals(a))
                        resultDouble = num1 + num2;
    
                    if (action.equals(b))
                        resultDouble = num1 - num2;

                    if (action.equals(c))
                        resultDouble = num1*num2;

                    if (action.equals(d))
                        resultDouble = num1/num2;

                    resultLinkedList.add(resultDouble);
                    num1 = resultDouble;
                    System.out.println("Результат ----> " + resultDouble);

                }
            }
            symbol.close();

        }

        catch(NullPointerException e){
            System.out.println("Чисел больше не осталось ");
            
        }
                    
    } 
}

