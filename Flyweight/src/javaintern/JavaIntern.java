package javaintern;

import org.junit.Assert;
import org.junit.Test;

public class JavaIntern {

	@Test
	public void notInterned() {
		Assert.assertEquals(new String("abc"), new String("abc"));
		Assert.assertNotSame(new String("abc"), new String("abc"));
		Assert.assertSame("abc", "abc");
	}
	
	@Test
	public void firstInterned() {
		Assert.assertNotSame(new String("abc").intern(), new String("abc"));
		Assert.assertSame(new String("abc").intern(), "abc");
	}
	
	public void bothInterned() {
		Assert.assertSame(new String("abc").intern(), new String("abc").intern());
	}

}
