package cn.wjq.Xianchen;

public class Biaodi extends Thread {
	public void run() {
		for(int i = 0;i <50;i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("±íµÜ³Ô×ÅÐ¡ÁúÏº");
		}
	}
}
