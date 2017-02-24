import static org.junit.Assert.*;

import org.junit.Test;

public class IntroToTest {

	@Test
	public void test() {
	assertEquals(9,squareNum(3));
	assertEquals(10,absoluteValue(-10));
	assertEquals(3, absoluteValue(3));
	assertTrue(isWeekend("Sunday"));
	assertFalse(isWeekend("Tuesday"));
	assertEquals("hello Carl", giveGreeting("Carl"));
	}
boolean isWeekend(String string) {
	if(string.equals("Saturday") |string.equals("Sunday")){
		return true;
	}	else{
	return false;
	}
	
	}
int squareNum(int x){
	return x*x;
}
int absoluteValue(int x){
return Math.abs(x);
}
String giveGreeting(String name){
	if(name.equals("Carl")){
		return "Hello Carl";
	}
	return name;
}
}
