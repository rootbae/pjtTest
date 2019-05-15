package pjtTest;

public class InterfaceClass implements InterfaceA, InterfaceB{

	public InterfaceClass() {
		System.out.println("--constructor--");
	}
	
	@Override
	public void funB() {
		System.out.println("--funB--");
	}

	@Override
	public void funA() {
		System.out.println("--funA--");
	}
	
}
