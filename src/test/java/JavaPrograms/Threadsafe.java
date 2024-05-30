package JavaPrograms;

public class Threadsafe {

	static int count;
	
	public static synchronized void counter() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10000; i++) {
					counter();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10000; i++) {
					counter();
				}

			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);

	}

}
