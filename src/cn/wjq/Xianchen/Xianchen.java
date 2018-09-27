package cn.wjq.Xianchen;

public class Xianchen {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.isDaemon());
		Thread thread02 = new Thread();
		System.out.println(thread02.isDaemon());
		thread02.setDaemon(true);
		System.out.println(thread02.isDaemon());
	}

}
