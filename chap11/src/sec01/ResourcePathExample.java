package sec01;

public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String Photo1Path = clazz.getResource("Photo1.jpg").getPath();
		String Photo2Path = clazz.getResource("images/Photo2.jpg").getPath();
		
		System.out.println(Photo1Path);
		System.out.println(Photo2Path);

	}

}
