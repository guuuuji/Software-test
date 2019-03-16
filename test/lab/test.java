package lab;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {
	@Test
	
	public void test() {
		lab1 l = new lab1();
		assertEquals(1, l.yuan(55));
		assertEquals(1, l.yuan(20));
		assertEquals(1, l.yuan(60));
		assertEquals(0, l.yuan(100));
	}
}
