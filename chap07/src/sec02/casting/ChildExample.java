package sec02.casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();	//자동형변환
		parent.filed1 = "data1";
		parent.method1();
		parent.method2();
		
		// 강제형변환(casting)
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		
		Parent parent2 = new Parent();
		Child child2 = (Child) parent2;
		child2.field2 = "yyy";
		child2.method3();

	}

}
