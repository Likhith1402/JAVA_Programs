import java.util.*;
class minicalci {
    int choice,firstNum,secondNum;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1 for Addition");
        System.out.println("enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for checking even or odd numbers");
        
        System.out.print("Enter your choice [1,2,3,4,5] = ");
        int choice = sc.nextInt();
        System.out.print("Enter your first digit = ");
        int firstNum = sc.nextInt();
        System.out.print("Enter your seconds digit = ");
        int secondNum = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum of the digits = "+(firstNum+secondNum));
                break;
            case 2:
                System.out.println("Substraction of the digits = "+(firstNum-secondNum));
                break;
            case 3:
                System.out.println("Multiplication of the digits = "+(firstNum*secondNum));
                break;
            case 4:
                System.out.println("Division of the digits = "+(firstNum/secondNum));
                break;
            case 5:
             if (firstNum%2 == 0 && secondNum%2 == 0)
                System.out.println("Both are even numbers");
             else if (secondNum%2 == 0)
                System.out.println(secondNum +" is even");
             else if (firstNum%2 == 0)
                System.out.println(firstNum + " is even");
             else 
                System.out.println("Both are odd  numbers");
                break;
                  
            default:
            System.out.println("Invalid choice");
                break;
        }
        

        sc.close(); 
    }
    
}
