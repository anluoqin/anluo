package cn.wjq.Xianchen;

public class Wojoin {

	public static void main(String[] args) throws InterruptedException {
		Biaodi biaodi = new Biaodi();
		Wo wo = new Wo();
		biaodi.start();
		wo.start();
		for(int a = 0;a < 10;a++) {
			if(a == 5) {
				wo.join();
			}
		}

	}

}
