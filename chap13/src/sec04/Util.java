package sec04;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}

class Box<T> {
	T t;
	
	void set(T t) {
		this.t = t;
	}
	
	T get() {
		return this.t;
	}
}
