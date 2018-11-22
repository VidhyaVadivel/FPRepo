package Ass4;

public class THBS {
	Cricket cref;// = new Cricket();
	
	public void setCref(Cricket cref) {
		this.cref = cref;
	}

	
}

class Cricket{
	
	void disp() {
		System.out.println("Cricket");
	}
	MenTeam mref;
	
	public void setMref(MenTeam mref) {
		this.mref=mref;
	//	mref.getBatm();
	}
	WomenTeam wref;
	
}

class MenTeam{
	Batsman batm;
	Bowler bowm;
	WicketKeeper wkm;
	AllRounder arm;
	public String getArm() {
		return arm.print();
	}
	public String getBatm() {
		return batm.print();
	}
	public void setBatm(Batsman batm) {
		this.batm = batm;
	}
	
	public Bowler getBowm() {
		return bowm;
	}
	public void setBowm(Bowler bowm) {
		this.bowm = bowm;
	}
	public String getWkm() {
		return wkm.print();
	}
	public void setWkm(WicketKeeper wkm) {
		this.wkm = wkm;
	}
/*	public String getArm() {
		return arm.print();
	}*/
	public void setArm(AllRounder arm) {
		this.arm = arm;
	}
	
}

class WomenTeam{
	Batsman batw;
	Bowler boww;
	WicketKeeper wkw;
	AllRounder arw;
}

class Batsman{
	String print()
	{
		return "Inside Batsman class";
	}
}

class Bowler{
	String print()
	{
		return "Inside Bowler class";
	}
}

class WicketKeeper{
	String print()
	{
		return "Inside Wicket Keeper class";
	}
	
}

class AllRounder{
	String print()
	{
		return "Inside All Rounder class";
	}
}