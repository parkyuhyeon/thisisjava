package exercise03;

public interface Soundable {
	String sound();
}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "¾ß¿ë";
	}
	
}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "¸Û¸Û";
	}
	
}