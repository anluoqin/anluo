package cn.wjq.Xianchen;

public class Huanjin extends Thread{
	public void run() {
		
		Thread thread = new Thread();
		System.out.println("�������߳�Ϊ��"+thread.isDaemon());
	}
}
