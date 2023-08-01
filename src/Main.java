import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,i=1,ebob=1,ekok=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("n1 Sayisini Giriniz :");
        n1=scanner.nextInt();
        System.out.print("n2 Sayisini Giriniz :");
        n2=scanner.nextInt();

        while (i<=n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        ekok=(n1*n2)/ebob;

        System.out.println("Ebob Degeri: "+ebob);
        System.out.print("Ekok Degeri: "+ekok);
    }
}