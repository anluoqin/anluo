package cn.wjq.Xianchen;

public class Huanjin extends Thread{
	public void run() {
		
		Thread thread = new Thread();
		System.out.println("创建的线程为："+thread.isDaemon());
	}
}
