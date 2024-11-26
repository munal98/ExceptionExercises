

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {
	//Scanner objesi class i�in static olarak tanımlanabilir ve bu class içinde bir adettir
	//istenilen yerde kullanılabilir.
	static Scanner sc = new Scanner(System.in);
	
	public static void example1() { 
		//ArithmeticException --> 0'a bölme işleminden kaynaklı
		//InputMismatchException --> girilen verinin tipi farklıysa
		try {
			System.out.print("Enter a number (x):");
			int x = sc.nextInt();
			System.out.print("Enter another number (y):");
			int y = sc.nextInt();
			System.out.println("x / y = " + (x / y));
		} catch (ArithmeticException e) {
			System.err.println("Sayı 0'a bölünemez.");
		} catch (InputMismatchException e) {
			System.out.println("Farklı tipte bir veri girişi yapıldı!");
		} catch (Exception e) {
			System.out.println("Bir yerler bir şeyler yanlış gitti.");
		}
	}
	
	public static void main(String[] args) {
		example1(); //bu metotta karşılaşılabilecek Exceptionları listeleyelim.
	}

}
