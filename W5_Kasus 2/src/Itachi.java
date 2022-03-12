
public class Itachi extends Rikudo {
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}

	private void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}
	
	void printDojutsu() {
		System.out.println(this.Dojutsu);
		setDojutsu();	// Modifikasi1
		System.out.println(this.Dojutsu);
	}
}

