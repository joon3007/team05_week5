package team05.PhoneBill;

public class GoldPlan implements Plan {
	private double basicmin = 1000;
	private double excessfarerate = 0.45;
	private double basicfee = 49.95;
	
	@Override
	public String toString(){
		return "기본기간 : "+basicmin+" 초과요금(분) : "+excessfarerate+" 기본요금 : "+basicfee;
	}
}
