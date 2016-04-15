package team05.PhoneBill;

import org.junit.Test;

public class PhoneBIllTest {
	@Test
	public void userPrintTest(){
		User u = new User("gold", 1, 1200);
		u.printBill();
	}
	
	@Test
	public void billTest(){
		Bill b1 = new Bill("gold", 1, 900);
		Bill b2 = new Bill("silver", 3, 500);
		
		b1.print();
		b2.print();
	}
	@Test
	public void planTest(){
		plan g = new GoldPlan();
		plan s = new SilverPlan();
		
		System.out.println(g.toString());
		System.out.println(s.toString());
	}

}
