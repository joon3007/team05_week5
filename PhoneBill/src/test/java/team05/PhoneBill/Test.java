package team05.PhoneBill;

import junit.framework.TestCase;

public class Test extends TestCase {
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

	public void normalSilver(){
		assertEquals(29.95,cal1.calculation());
	}
	
	public void normalGold(){
		assertEquals(49.95, cal2.calculation());
	}
	
	public void exceedUsageSilver(){
		double fee = 29.95+0.54;
		assertEquals(fee, cal3.calculation());
	}
	
	public void exccedUsageGold(){
		double fee = 49.95+0.45;
		assertEquals(fee, cal4.calculation());
	}
	
	public void manylineSilver(){
		double fee = 29.95+14.5*3;
		assertEquals(fee, cal5.calculation());
	}
	
	public void manylineGold(){
		double fee = 49.95+21.5*2;
		assertEquals(fee, cal6.calculation());
	}
	
	public void exceedThreeLineSilver(){
		double fee = 29.95+14.5*3+5;
		assertEquals(fee, cal7.calculation());
	}
	
	public void exceedTreeLineGold(){
		double fee = 49.95+21.5*3+5*2;
		assertEquals(fee, cal8.calculation());
	}
}
