package sec06.exam05;

public class PrintThread2 extends Thread {
	public void run() {
//		try {
			while (true) {
				System.out.println("���� ��");
				if (Thread.interrupted()) {
					break;
				}
//				Thread.sleep(1);
			}
//		} catch (InterruptedException e) {}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
