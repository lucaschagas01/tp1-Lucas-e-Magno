import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int c, p = 10, e = 1;
		System.out.println("Digite um numero que deseja saber em notação científica:");
		c = STDIN_SCANNER.nextInt();
		if(c < 0) {
			c = c * -1;
		}
		while(c > p) {
			p = p * 10;
			e++;
		}
		System.out.println((p / c) + "x10 elevado a " + e);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
