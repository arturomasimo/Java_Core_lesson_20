package lession20;
/**
 * The Main class to work with Threads 
 * 
 * @author ARTUR
 * @since JDK 13.0.2
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		System.out.print("ВВедіть число: ");
		int num = new Scanner(System.in).nextInt();

		MyThread a = new MyThread(num);
		System.out.print("Потік Thread  : ");
		a.start();
		a.join();
		System.out.print("Потік Runnable: ");
		RunnableThread b = new RunnableThread(num);
		new Thread(b).start();
		
		
	}
}
