package sec13.exam03_field_method_access.package1;

public class A {
	// �ʵ�
	public int field1;
	int field2;
	private int field3;
	
	// ������
	public A() {
		field1 = 1; // (o)
		field2 = 1; // (o)
		field3 = 1; // (o)
		
		method1();	// (o)
		method2();	// (o)
		method3();	// (o)
	}
	
	// �޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3() {}
}
