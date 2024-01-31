package ch09.iskindof06;

public class NursePolice extends Police {
	
	private int thermomenters;
	
	public NursePolice(int bullet, int handCuffs, int thermomenters) {
		super(bullet, handCuffs);
		this.thermomenters = thermomenters;
	}
	public void calcThermomenter() {
		if(thermomenters>0) {
			System.out.println("Check 36.5 Temp");
		}else {
			System.out.println("No Check Temp");
		}
	}

}
