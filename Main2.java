package patikaOrnekler;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		double kilo,boy,sonuc;
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen kilonuzu giriniz: ");
		kilo = input.nextDouble();
		System.out.print("L�tfen metre cinsinden boyunuzu giriniz: ");
		boy = input.nextDouble();
		sonuc = kilo / boy * boy;
		System.out.println("V�cut kitle indeksiniz: " +sonuc);
		
	}

}
