package exercise;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		// ���1 (split() �޼ҵ� �̿�)
		String[] arr1 = str.split(",");
		for (String token : arr1) {
			System.out.println(token);
		}
		
		System.out.println();
		
		// ���2 (StringTokenizer �̿�)
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
