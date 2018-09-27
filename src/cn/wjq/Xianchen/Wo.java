package cn.wjq.Xianchen;

public class Wo extends Thread{
	public void run() {
		for(int b = 0;b < 50;b++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("我要抢表弟的小龙虾");
		}
	}
}
