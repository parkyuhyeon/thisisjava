package sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					// ������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor =
						(ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize +
						"] �۾� ������ �̸�: " + threadName);
					
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
				
			};
			
//			executorService.execute(runnable);
			executorService.submit(runnable);
			
			Thread.sleep(10);	// �ֿܼ� ��� �ð��� �ֱ� ���� 0.01�� �Ͻ� ������Ŵ
		}
		
		executorService.shutdown();
	}

}
