package com.class11;

public class Task8 {

	public static void main(String[] args) {
		
		/* Create an array of countries: North America, South America,
		 * Europe, Asia, Africa. Then print all valued from that array.
		 */

		String[][]countries= {
				
		
				{"North America:","Mexico,","Canada,","Belize,","Guatemala"},
				{"South America:","Peru,","Ecuador,","Colombia,","Chile,","Uruguay"},
				{"Europe:","France,","Gibraltar,","Spain,","Cyprus"},
				{"Africa:","South Africa,","Tanzania,","Kenya,","Chad"},
				{"Asia:","Thailand,","Cambodia,","Japan,","Indonesia"}
	};
		
		for (int i=0; i<countries.length; i++) {
			
			for (int c=0; c<countries[i].length; c++) {
				System.out.print(countries[i][c]+" ");
			}
			System.out.println();
		}

}
}
