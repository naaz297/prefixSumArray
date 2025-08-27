import java.util.Scanner;

public class prefixsum {
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0 ; i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
   static int[] makeprefixsumArray(int[]arr){
        int n = arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1 ; i< n; i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
   }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter"+n+"Element");
        for(int i=0;i<n ;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);
        System.out.println("prefix sum array");
        int[] pref=makeprefixsumArray(arr);
        printArray(pref);
}
}
