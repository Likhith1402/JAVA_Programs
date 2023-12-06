 class evenOdd {
    public static void main(String[] args) {
         int  firstNum = 11 , secondNum = 33;

        if (firstNum%2 == 0 && secondNum%2 == 0)
                    System.out.println("Both are even numbers");
        else if (secondNum%2 == 0)
                    System.out.println(secondNum +" is even");
        else if (firstNum%2 == 0)
                    System.out.println(firstNum + " is even");
        else 
                    System.out.println("Both are odd  numbers");
    }
    
}
