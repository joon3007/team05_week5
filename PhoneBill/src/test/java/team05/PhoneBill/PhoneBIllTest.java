package team05.PhoneBill;

import static org.junit.Assert.*;

import org.junit.*;

public class PhoneBIllTest {
	
	Calculator cal1 = new Calculator(289, 1, "sliver");
	Calculator cal2 = new Calculator(589, 1, "gold");
	Calculator cal3 = new Calculator(501, 1, "sliver");
	Calculator cal4 = new Calculator(1001, 1, "gold");
	Calculator cal5 = new Calculator(489, 3, "sliver");
	Calculator cal6 = new Calculator(980, 2, "gold");
	Calculator cal7 = new Calculator(289, 4, "silver");;
	Calculator cal8 = new Calculator(899, 5, "gold");
	Calculator cal9 = new Calculator(289, 1, "sliver");
	Calculator cal10 = new Calculator(289, 1, "sliver");
	
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
		Plan g = new GoldPlan();
		Plan s = new SilverPlan();
		
		System.out.println(g.toString());
		System.out.println(s.toString());
	}
	@Test
	public void normalSilver(){
		double fee = 29.95;
		assertEquals(fee, cal1.calculation(),fee);
		System.out.println("normalSilver Pass");
	}
	@Test
	public void normalGold(){
		double fee = 49.95;
		assertEquals(fee, cal2.calculation(),fee);
		System.out.println("normalGold Pass");
	}
	@Test
	public void exceedUsageSilver(){
		double fee = 29.95+0.54;
		assertEquals(fee, cal3.calculation(),fee);
		System.out.println("exceedUsageSilver Pass");
	}
	@Test
	public void exceedUsageGold(){
		double fee = 49.95+0.45;
		assertEquals(fee, cal4.calculation(),fee);
		System.out.println("exceedUsageGold Pass");
	}
	@Test
	public void manylineSilver(){
		double fee = 29.95+14.5*3;
		assertEquals(fee, cal5.calculation(),fee);
		System.out.println("manylineSilver Pass");
	}
	@Test
	public void manylineGold(){
		double fee = 49.95+21.5*2;
		assertEquals(fee, cal6.calculation(),fee);
		System.out.println("manylineGold pass");
	}
	@Test
	public void exceedThreeLineSilver(){
		double fee = 29.95+14.5*3+5;
		assertEquals(fee, cal7.calculation(),fee);
		System.out.println("exceedTreeLineSilver pass");
	}
	@Test
	public void exceedTreeLineGold(){
		double fee = 49.95+21.5*3+5*2;
		assertEquals(fee, cal8.calculation(),fee);
		System.out.println("exceedTreeLineGold pass");
	}

}
