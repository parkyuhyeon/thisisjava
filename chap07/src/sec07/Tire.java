package sec07;

public class Tire {
	// 필드
	public int maxRotation;			// 최대 회전수(타이어 수명)
	public int accumlatedRotation;	// 누적 회전수
	public String location;			// 타이어의 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumlatedRotation;	// 누적 회전수 1증가
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " +
					(maxRotation - accumlatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
