
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of your Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of your array");
        int a[] = new int[10],i,j,temp;
        for (i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(a[3]);
        for(i=0;i<n-1;i++){
            for (j=0;j<n-1;j++){
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Your array after sorting is");
        for (i=0;i<n;i++)
            System.out.println(a[i]);
    }
}