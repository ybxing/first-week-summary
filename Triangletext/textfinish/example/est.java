package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class est {

	@Test
	public void validTriangleshowid(){
		assertTrue(new Triangle(2,4,5).isvalid());
		assertFlase(new Triangle(-1,-1,-1).isvalid());
		assertFlase(new Triangle(1,1,0).isvalid());
		assertFlase(new Triangle(1,1,0).isvalid());
	}
	@Test
	public void validTriangleshouldHaveSTGOS(){
	fail("Not yet implemented")

}
