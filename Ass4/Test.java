package Ass4;

public class Test {

	public static void main(String[] args) {
		THBS thbs = new THBS();
		Cricket c=new Cricket();
		MenTeam m = new MenTeam();
		thbs.setCref(c);
		thbs.cref.disp();
		c.setMref(m);
		Batsman b = new Batsman();
	//	System.out.println(.getArm());
	//	m.setBatm(b);
		System.out.println(b.print());
	}

}
