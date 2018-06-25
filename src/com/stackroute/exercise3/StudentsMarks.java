package com.stackroute.exercise3;

public class StudentsMarks {
	

	public char[] studentGrades(int marks[]) {
		char[] grades = new char[marks.length];
		for(int i =0;i<marks.length;i++) {
		if (marks[i]>80)
			grades[i]='A';
		else if(marks[i]>70)
			grades[i]='B';
		else if(marks[i]>60)
			grades[i]='C';
		else if(marks[i]>50)
			grades[i]='D';
		else
			grades[i]='F';
		}
	return grades;
	}
}
//		return ";
//		else {
//			
//			int Min_Marks=0;	
//			int Max_Marks=500;
//			if(avgMarks/Max_Marks>=0.8)
//				return A;
//			
//			
//		}
////			double sum=0;
//		for (int i=0;i<=n;i++) {
//		 sum=grades[i] ++;
//		 average=sum/n;
//		}
//		return "average";
//		}
//	}



			
			
		
		
			
		
		
			
		
		
	


