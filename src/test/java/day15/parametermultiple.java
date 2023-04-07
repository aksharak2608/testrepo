package day15;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametermultiple {
	@Parameters({"url", "browser"})
@Test
public void test(String input, String bro)
{
	System.out.println(input);
	System.out.println(bro);
}
}
