package sec07;

public class KumhoTire extends Tire {
	// �ʵ�
	
	// ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ����: " +
					(maxRotation - accumlatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankooKumhoTire ��ũ ***");
			return false;
		}
	}
}
