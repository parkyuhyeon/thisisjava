package sec07;

public class HankookTire extends Tire {
	// �ʵ�
	
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumlatedRotation;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " +
					(maxRotation - accumlatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
