package chap06;

public class Car {
	// ������
	Car() {
	}

	Car(String model) {
		this(model, "����", 250);
	}
	
	Car(String model, String color) {
		this(model, color, 250);
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
