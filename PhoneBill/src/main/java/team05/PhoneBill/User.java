package team05.PhoneBill;

public class User {
	private String plan;
	private int numsub;
	private double usage;

	public User(String plans, int subnums, double usages) {
		this.plan = plans;
		this.numsub  = subnums;
		this.usage = usages;
	}

	public void printBill() {
		Bill b = new Bill(plan, numsub, usage);
		b.print();
	}
	

}
