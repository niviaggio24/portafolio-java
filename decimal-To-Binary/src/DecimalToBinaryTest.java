import org.junit.Assert;
import org.junit.Test;

public class DecimalToBinaryTest {

	DecimalToBinary d2b = new DecimalToBinary();
	
	@Test
	public void toBinary_1Bit() {
		Assert.assertEquals("0", d2b.toBinary(0));
		Assert.assertEquals("1", d2b.toBinary(1));
	}

	@Test
	public void toBinary_2bits() {
		Assert.assertEquals("10", d2b.toBinary(2));
		Assert.assertEquals("11", d2b.toBinary(3));
	}

	@Test
	public void toBinary_3bits() {
		Assert.assertEquals("100", d2b.toBinary(4));
		Assert.assertEquals("101", d2b.toBinary(5));
		Assert.assertEquals("110", d2b.toBinary(6));
		Assert.assertEquals("111", d2b.toBinary(7));
	}
	
	@Test
	public void toBinary_4bits() {
		Assert.assertEquals("1000", d2b.toBinary(8));
		Assert.assertEquals("1010", d2b.toBinary(10));
		Assert.assertEquals("1111", d2b.toBinary(15));
	}

	@Test
	public void toBinary_5bits() {
		Assert.assertEquals("10000", d2b.toBinary(16));
	}
	
	@Test
	public void toBinary_LotOfbits() {
		Assert.assertEquals("111111111111111", d2b.toBinary(Short.MAX_VALUE));
		Assert.assertEquals("1111111111111111111111111111111", d2b.toBinary(Integer.MAX_VALUE));
		Assert.assertEquals("1111111111111111111111111111110", d2b.toBinary(Integer.MAX_VALUE - 1));
	}
}