package cn.wjq.Xianchen;

public class Chuanjian {

	public static void main(String[] args) {
		Huanjin huanjin = new Huanjin();
		System.out.println("�����߳��ǣ�"+huanjin.isDaemon());
		huanjin.setDaemon(true);
		huanjin.start();

	}

}
