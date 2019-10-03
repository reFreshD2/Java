import java.util.Scanner;

public class SelfDivisor {
public static int number;

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	number =  in.nextInt();
	if(isSelfDivisor(number)) {
		System.out.println("Is Self-Divisor");
	}
	else {
		System.out.println("Is NOT Self-Divisor");
	}
	int start = in.nextInt();
	int num = in.nextInt();
	int[] selfDiv = firstNumSelfDivisor(start,num);
	for (int self:selfDiv) {
		System.out.println(self);
	}
	in.close();
}

public static boolean isSelfDivisor(int number) {
	boolean self = true;
	int x = number;
	while ((x>0) && (self == true)) {
		int dec = x%10;
		if ((dec == 0) || (x%dec!= 0)) {
			self = false;
		}
		x = x/10;
	}
	return self;
}

public static int[] firstNumSelfDivisor(int start, int num) {
	int[] mas = new int[num];
	int n = 0;
	int s = start;
	while (n != num) {
		if (isSelfDivisor(s)) {
			mas[n] = s;
			n++;
		}
		s++;
	}
	return mas;
}
}
