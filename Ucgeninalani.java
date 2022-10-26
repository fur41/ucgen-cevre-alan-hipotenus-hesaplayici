import java.util.Scanner;
public class Ucgeninalani {
public static void main(String[] args) {
int   a , b , c , u ; double üçgeninÇevresi , alan , hipotenüs;
Scanner inp = new Scanner(System.in);
System.out.print("Taban Kenarı yazınız :");
a= inp.nextInt();
System.out.print("İkinci kenarı giriniz :");
b= inp.nextInt();
System.out.print("Dik kenarı giriniz:");
c = inp.nextInt();
üçgeninÇevresi=a+b+c;
System.out.println("Üçgenin çevresi :"+üçgeninÇevresi);
u=c;
alan = a*u/2;
System.out.println("Üçgenin alanı :"+alan);
hipotenüs = a + c;
System.out.println("Hipotenüs :"+hipotenüs);

}
}