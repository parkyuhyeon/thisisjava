package sec07;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
//			switch (problemLocation) {
//				case 1:
//					System.out.println("�տ��� HankookTire�� ��ü");
//					car.frontLeftTire = new HankookTire("�տ���", 15);
//					break;
//				case 2:
//					System.out.println("�տ����� KumhoTire�� ��ü");
//					car.frontRightTire = new KumhoTire("�տ�����", 13);
//					break;
//				case 3:
//					System.out.println("�ڿ��� HankookTire�� ��ü");
//					car.backLeftTire = new HankookTire("�ڿ���", 14);
//					break;
//				case 4:
//					System.out.println("�ڿ����� KumhoTire�� ��ü");
//					car.backRightTire = new KumhoTire("�ڿ�����", 17);
//					break;
//			}
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation - 1].location + 
						" HankookTire�� ��ü");
				car.tires[problemLocation - 1] =
						new HankookTire(car.tires[problemLocation - 1].location, 15);
			}
			
			System.out.println("--------------------------");
		}
	}

}
