package GoldenMonkey;

interface Valuable {
	public double getMoney();
}

interface Protectable {
	public void beProtected();
}

interface A extends Protectable {
	void m();	
}

abstract class Animal {
	private String name;
	
	abstract void enjoy();
}

class GoldenMonkey extends Animal implements Valuable, Protectable {
	public double getMoney() {
		return 10000;
	}
	
	public void beProtected() {
		System.out.println("live in the room");
	}
	
	public void enjoy() {
		
	}
	
	public void test() {
		Valuable v = new GoldenMonkey();
		v.getMoney();
		Protectable p = (Protectable)v;
		p.beProtected();
	}
}

class Hen implements A  {
	public void m() {}
	public void beProtected() {}
	
}

static void main(String[] args) {
	Valuable v = new GoldenMonkey();
	System.out.println(v.getMoney());
	Protectable p = (Protectable) v;
	p.beProtected();
}