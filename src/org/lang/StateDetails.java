package org.lang;

public class StateDetails {
	
	private void southIndia() {
		
System.out.println("south india");
	}
	private void northIndia() {
		
		System.out.println("North India");

	}
	public static void main(String[] args) {
		
		
		 Languageinfo India= new  Languageinfo ();
		 StateDetails Tamilnadu=new  StateDetails();
		 
		 India.englishLanguage();
		 India.hindiLanguage();
		 India.tamillanguage();
		 Tamilnadu.northIndia();
		 Tamilnadu.southIndia();
	}

}
