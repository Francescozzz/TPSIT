package thread;

public class Thread1 {
	public static void main(String args[]) {
		
		Thread1 t1 = new Conta(0);
		t1.start();
	}
	public void run() {
		if (typeThread==0) {
			for(int i=0; i<=10; i++) {
				System.out.println(i);
				this.stopThread(i); 
			}
		}
	
}
