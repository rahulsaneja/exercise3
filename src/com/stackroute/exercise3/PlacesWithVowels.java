package com.stackroute.exercise3;

public class PlacesWithVowels {
	public String[] placesInput(String places[]) {
		String x[]=new String[places.length];
		for (int i=0;i<places.length;i++) {
			for(int j=0;j< places[i].length() ;j++) {
				char ch= places[i].charAt(j);
				if(ch!='A' ||ch!='a' ||ch!='E'||ch!='e' ||ch!='I'||ch!='i'||ch!='O'||ch!='o'||ch!='U'||ch!='u');
				x[i]= x[i]+ ch;
				}
			}
		return x;
	}

}
