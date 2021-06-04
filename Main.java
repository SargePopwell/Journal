package Journal;

public class Main {

	public static void main(String[] args) {
		
		Journal onDiraTout = Journal.getInstance("On dira tout!");
		Redacteur jerome = new Redacteur("Girard", "Jérome", onDiraTout);
		Redacteur bibou = new Redacteur("Jean", "Bibou", onDiraTout);
		Abonne emilie = new Abonne("Pelletier", "Emilie", onDiraTout, 1);
		Abonne jessica = new Abonne("Champion", "Jessica", onDiraTout, 2);
		
		System.out.println("-");
		System.out.println(bibou.toString());
		System.out.println(jerome.toString());
		System.out.println("-");
		System.out.println(emilie.toString());
		System.out.println(jessica.toString());
		

		System.out.println("-");
		System.out.println(onDiraTout.toString());
		
		System.out.println("-");
		Thread t1 = new Thread(jerome);

		t1.start();

		try {
			t1.join();

			System.out.println("Les threads se sont déroulés avec succès!");
		} catch (Exception e) {

		}
		
		System.out.println("-");
		System.out.println(onDiraTout.toString());
	}
}
