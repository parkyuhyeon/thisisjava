package sec02.exam01_interface_declaration;

public interface RemoteControl {
	// ���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
