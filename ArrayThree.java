import java.util.Scanner;
public class ArrayThree{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    char[] b = new char[5];
    float[] c = new float[5];
System.out.println("Interger array:-");
    for(int i = 0; i<3; i++) a[i] = sc.nextInt();
System.out.println("Charactor array:-");
    for(int i = 0; i<3; i++) b[i] = sc.next().charAt(0);;
System.out.println("Float array:-");
    for(int i = 0; i<3; i++) c[i] = sc.nextFloat();

    for(int i: a) System.out.print(i+" ");
    for(char i: b) System.out.print(i+" ");
    for(float i: c) System.out.print(i+" ");
    sc.close();
}
}