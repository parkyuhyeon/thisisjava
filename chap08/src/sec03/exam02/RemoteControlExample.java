package sec03.exam02;

import sec02.exam01_interface_declaration.*;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /* ���๮ */ }

			public void turnOff() { /* ���๮ */ }

			public void setVolume(int volume) { /* ���๮ */ }
		};
	}

}
