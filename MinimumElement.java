import java.util.*;
public class MinimumElement {
   
    
    private static int readInteger(){
        try (Scanner sc = new Scanner(System.in)) {
            return sc.nextInt();
        }}

    private static int[] readElements(int n){
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Number: ");
                int num = sc.nextInt();
                sc.nextLine();
                array[i]=num;
            }
            return array;
        }
    }
    private static int findMin(int[] a){
    int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
            min=a[i];
        }
        return min;
    }
    public static void main(String[] args){
        System.out.println("Hi! please enter an amount of numbers. You will then enter those numbers one by one and I will find the minimun value!");
        System.out.println("How many numbers would you like to evaluate?");
        int length=readInteger();
        int[] array=readElements(length);
        int min=findMin(array);
        System.out.printf("Min: "+min);

    }
}  

