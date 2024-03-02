import java.util.Scanner;
import java.util.*;

public class arr2 {
    public static void main(String[] args) {
        int n, pos, i, m, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n + 1];
        System.out.println("Enter all the elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the operation no.");
        int op = s.nextInt();
        switch (op) {
            case 1:
                System.out.print("Enter the position where you want to insert element:");
                pos = s.nextInt();
                System.out.print("Enter the element you want to insert:");
                x = s.nextInt();
                for (i = (n - 1); i >= (pos - 1); i--) {
                    a[i + 1] = a[i];
                }
                a[pos - 1] = x;
                System.out.print("After inserting:");
                for (i = 0; i < n; i++) {
                    System.out.print(a[i] + ",");
                }
                System.out.print(a[n]);
                break;
            case 2:
                System.out.print("Insert the element in the begening ");
                m = s.nextInt();
                a[i + 1] = a[i];
                a[0] = m;
                break;
            case 3:
                System.out.print("Insert the element in the ending ");
                m = s.nextInt();
                a[i + 1] = a[i];
                a[n + 1] = m;
                break;
            default:
                System.out.print("invalide number");
                break;
        }
    }
}
