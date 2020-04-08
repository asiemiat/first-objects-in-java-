class GoodMovie {
	
	String title;
	String type;
	int rate;
	
	void play(){
		
		System.out.println("We play the film ! " + title);
		
	}
	
}

class MovieTester {
	
	public static void main (String[] args){
		
		
		GoodMovie No1 = new GoodMovie();
		No1.title = "God of War";
		No1.type = "Action";
		No1.rate = 4;
		
		GoodMovie No2 = new GoodMovie();
		No2.title = "Sain Gral";
		No2.type = "Comedy";
		No2.rate = 5;
		
		GoodMovie No3 = new GoodMovie();
		No3.title = "Rec 2";
		No3.type = "Horror";
		No3.rate = 1;
		
		
		System.out.println("Title : " + No1.title);
		System.out.println("Type : " + No1.type);
		System.out.println("Rate : " + No1.rate);
		System.out.println();
		
		System.out.println("Title : " + No2.title);
		System.out.println("Type : " + No2.type);
		System.out.println("Rate : " + No2.rate);
		System.out.println();
		
		System.out.println("Title : " + No3.title);
		System.out.println("Type : " + No3.type);
		System.out.println("Rate : " + No3.rate);
		System.out.println();
		
		
		No3.play();
		
	}
	
	
}