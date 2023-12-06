public class reversingArray {
    public static void main(String[] args){
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Before reverse array is = ");
        for ( int element : arr )
        System.out.print(element+" ");
        for (int i  = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }
        System.out.print("\nAfter reversing the array is = ");
        for (int element : arr)
        System.out.print(element +" ");
    }
    
}
