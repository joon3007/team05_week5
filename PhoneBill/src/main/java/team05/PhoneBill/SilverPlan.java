package team05.PhoneBill;

public class SilverPlan implements plan {
	private double basicmin = 500;
	private double excessfarerate = 0.54;
	private double basicfee = 29.95;
	
	@Override
	public String toString(){
		return "기본기간 : "+basicmin+" 초과요금(분) : "+excessfarerate+" 기본요금 : "+basicfee;
	}
}
