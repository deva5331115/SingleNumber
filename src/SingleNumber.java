import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        int result=0;
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
            result=result^array[i];
        }
        System.out.println(result);
    }
}
