package sec07;

public class Tire {
	// �ʵ�
	public int maxRotation;			// �ִ� ȸ����(Ÿ�̾� ����)
	public int accumlatedRotation;	// ���� ȸ����
	public String location;			// Ÿ�̾��� ��ġ
	
	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// �޼ҵ�
	public boolean roll() {
		++accumlatedRotation;	// ���� ȸ���� 1����
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " +
					(maxRotation - accumlatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}
