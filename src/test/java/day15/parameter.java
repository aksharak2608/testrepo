package day15;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	@Parameters("url")
@Test
public void test(String input)
{
	System.out.println(input);
}
}
