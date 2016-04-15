package team05.PhoneBill;

public class Bill {
	
	private String plan;
	private int numsub;
	private double usage;
	
	public Bill(String plans, int numsubs, double usages) {
		this.plan = plans;
		this.numsub = numsubs;
		this.usage = usages;
	}

	public void print() {
		System.out.println("plan : "+ plan+ " subAccount : "+ numsub+ "개 "+" usage : "+ usage);
		Calculator calculator = new Calculator(usage, numsub, plan);
		System.out.println("총 금액 : "+calculator.calculation());
	}
	

}
