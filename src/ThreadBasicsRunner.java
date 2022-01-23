
class Task1 extends Thread {

	@Override
	public void run() {
		System.out.println("\n Task 1 Started");

		for (int i = 101; i <= 199; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\n Task 1 Done");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("\n Task 2 Started");

		for (int i = 201; i <= 299; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\n Task 2 Done");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task 1
		System.out.println("\n Task 1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(2);
		task1.start();

		// Task 2
		System.out.println("\n Task 2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// Communicating b/w threads
		// Wait for Task1 to complete
		task1.join();
		task2Thread.join();

		// Task 3
		System.out.println("\n Task 3 Kicked Off");

		for (int i = 301; i <= 399; i++) {
			System.out.println(i + " ");
		}


		System.out.println("\n Task 3 Done");

		System.out.println("\n Main method completed execution");

	}

}
