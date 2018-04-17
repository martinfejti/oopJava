package bwe;

import java.util.Scanner;

import bwe.BookWithEnum.style;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookWithEnum[] bweArray;
		
		System.out.println("Kérem az adatok számát!");
		int length = sc.nextInt();
		
		bweArray = new BookWithEnum[length];
		for(int i = 0; i<bweArray.length; i++){
			System.out.println("Kérem a címet: ");
			String title = sc.next();
			
			System.out.println("Kérem a szerzõt: ");
			String author = sc.next();
			
			System.out.println("Kérem a kiadás évét: ");
			int dateofIssue = sc.nextInt();
			
			System.out.println("Kérem az árat: ");
			int price = sc.nextInt();
			
			System.out.println("Kérem a stílust: ");
			String styleString = sc.next();
			style bookStyle = style.COOK;
			
			if(styleString.contains("cook"))
				bookStyle = style.COOK;
			
			if(styleString.contains("romance"))
				bookStyle = style.ROMANCE;
			
			if(styleString.contains("scifi"))
				bookStyle = style.SCIFI;
			
			if(styleString.contains("other"))
				bookStyle = style.OTHER;
			
			bweArray[i] = new BookWithEnum(title, author, dateofIssue, price, bookStyle);
		}
		
		bookDataWrite(bweArray);
		//BookWithEnum[] bweArray2 = new getBWEStyle(bweArray, style.SCIFI);
		
		

	}
	public static void  bookDataWrite(BookWithEnum[] bookArray){
		System.out.println("");
		for(BookWithEnum b : bookArray){
			System.out.println(b.toString());
		}
	}
	public static BookWithEnum[] getBWEStyle(BookWithEnum[] bweArray, style bookStyle){
		BookWithEnum[] bweTemp = new BookWithEnum[bweArray.length];
		
		for(int i = 0; i<bweArray.length; i++){
			if(bweArray[i].getBookStyle() == bookStyle){
				bweTemp[i] = bweArray[i];
			}
		}
		
		return bweTemp;
	}

}
