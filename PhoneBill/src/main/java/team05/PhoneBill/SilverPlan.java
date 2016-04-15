package team05.PhoneBill;

public class SilverPlan implements Plan {
	private double basicmin = 500;
	private double excessfarerate = 0.54;
	private double basicfee = 29.95;
	
	@Override
	public String toString(){
		return "기본기간 : "+basicmin+" 초과요금(분) : "+excessfarerate+" 기본요금 : "+basicfee;
	}

	public double getBasicMin(){
		return basicmin;
	}
	public double getExcessFareRate(){
		return excessfarerate;
	}
	public double getBasicFee(){
		return basicfee;
	}
}
