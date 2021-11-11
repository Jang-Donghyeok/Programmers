import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        int[] numA;
        int[] numB;
        String a;
        String[] A;
        String b;
        String[] B;
        int answer=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        b = sc.nextLine();
        A = a.split(",");
        B = b.split(",");
        numA =new int[A.length];
        numB = new int[B.length];
        for (int x=0; x<A.length; x++) {
            numA[x] = Integer.parseInt(A[x]);
        }
        for(int i=0; i<B.length; i++) {
            numB[i] = Integer.parseInt(B[i]);
        }
        for(int i=0; i<A.length; i++) {
            answer += numA[i]*numB[i];
        }
        System.out.print(answer);
    }
}
