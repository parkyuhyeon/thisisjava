package chap06;

public class Car {
	// ������
	Car() {
	}

	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
}
