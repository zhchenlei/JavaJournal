package IsEqualCat;
class Cat{
	int color;
	int height, weight;

	public Cat(int color, int height, int weight){
		this.color = color;
		this.height = height;
		this.weight = weight;
	}

	//rewrite equals
	public boolean equals(Object obj){
		if(obj == null) return false;	//none
		else{							// no-none
			if(obj instanceof Cat){
				Cat c = (Cat) obj;
				if(c.color == this.color && c.height == this.height && c.weight == this.weight)
				return true; 
			}
		}
		return false;
	}	
    
    //rewrite compare
    public Cat compare(Cat c){
		if(this.height > c.height && this.weight > c.weight){
			return this;
		}
		else{ 
			return c;
		 }
    }
 }
public class IsEqualCat{
	public static void main(String[] args){
		Cat c1 = new Cat(1,2,5);
		Cat c2 = new Cat(1,2,3);

		System.out.println(c1.equals(c2)); //false
		System.out.println(c1 == c2);	//false
		Cat c3 = c1.compare(c2);
		if(c3 == c1)
		{
		System.out.println("c1>c2");
		}
		else{
			System.out.println("c2>c1");
		}
	}
}