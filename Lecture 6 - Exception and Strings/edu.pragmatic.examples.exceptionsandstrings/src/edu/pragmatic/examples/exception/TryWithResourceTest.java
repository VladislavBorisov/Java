package edu.pragmatic.examples.exception;

public class TryWithResourceTest {
	
	private static class InnerResource implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("Autoclosing this resource");
		}
	}

	
	public static void main(String[] args) {
		try (InnerResource resource = new InnerResource()){
			System.out.println("Going through the try - with -resource ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
