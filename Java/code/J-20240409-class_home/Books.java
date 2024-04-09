package Books;
import java.util.Scanner;

class Book{
	String bookName;
	int price;
	String writer;

	void display(){
		System.out.println("bookName:"+bookName+"\tprice:"+price+"\twriter:"+writer);
	}
}

public class Books{

	static void BSort(Book[] book){
		for(int j = 0; j < book.length; j++){
			for(int i = 0; i < book.length - 1; i++){
				if(book[i].price > book[i+1].price){
					Book tmp = book[i];
					book[i] = book[i + 1];
					book[i + 1] = tmp;
				}
			}
		}
	}
	public static void main(String[] args){
		int number = 3;
		Scanner input1 = new Scanner(System.in);
		Book[] book = new Book[number];

		for(int i = 0; i < number; i++){
			book[i] = new Book();
			System.out.print("Enter No,\t"+(i+1)+"  writer  ");
			book[i].writer = input1.next();
			System.out.print("Enter No,\t"+(i+1)+"  name  ");
			book[i].bookName = input1.next();
			System.out.print("Enter No,\t"+(i+1)+"  price  ");
			book[i].price = input1.nextInt();
			//System.out.print();	
		}
		input1.close();
			System.out.println("Before Sort:");
		for(int i = 0; i < book.length; i++){
			book[i].display();
		}
		BSort(book);
		System.out.println("After Sort:");
		for(int i = 0; i < book.length; i++){
			book[i].display();
		}
	}
}
