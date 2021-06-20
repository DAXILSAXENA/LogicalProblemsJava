package logicalPrograms;

import java.util.Scanner;

public class StopWatch {

	public long startTime = 0;
	public long stopTime = 0;

	public void start(int number) {
		this.startTime = System.currentTimeMillis();

	}

	public void stop(int number) {
		this.stopTime = System.currentTimeMillis();
	}

	public void getElapsedTime() {
		double elapsed = (stopTime - startTime) * .001;

		System.out.println("elapsed time: " + elapsed + " seconds");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StopWatch object = new StopWatch();

		System.out.println("Enter 0 and press Enter key to start stopwatch:");
		int start = scan.nextInt();
		object.start(start);
		System.out.println("Stop watch started");
		System.out.println("Enter 0 and press Enter key to stop stopwatch:");
		int stop = scan.nextInt();
		object.stop(stop);
		object.getElapsedTime();
		scan.close();

	}
}