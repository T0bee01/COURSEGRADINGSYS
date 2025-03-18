package AnalyzableInterface;

/** Wasnt sure  if we were supposed to edit the old class for courseGrades
or not so I made this one and named it B, just incase same as the demo class*/

public class CourseGradesB implements Analyzable{
//grade array field for class
	private GradedActivity[] grades;
//constructor to accept the four categories
	public CourseGradesB(){
		grades = new GradedActivity[4];

		}
//setter for lab activity
	public void setLab(GradedActivity lab){
		grades[0] = lab;
		}
//setter for passfailexam category
	public void setPassFailExam(PassFailExam exam){
		grades[1] = exam;
		}
//setter for essay
	public void setEssay(Essay essay){
			grades[2] = essay;
		}
//setter for the finalExam
	public void setFinalExam(FinalExam finExam){
			grades[3] = finExam;
		}
		//toString method for class
	public String toString(){
		String[] categories = {"Lab Activity", "Pass/Fail Exam", "Essay", "Final Exam"};
		String result = "";

		for(int i = 0; i < grades.length; i++){//loop to print the string or categories
			result+=String.format("%-15s: Score = %-5.1f, Grade = %c%n", categories[i], grades[i].getScore(), grades[i].getGrade());
			}
		return result;

		}
	//getAverage method from interface
	public double getAverage() {
        double sum = 0;
     	 int count = 0;

		   for (int i = 0; i < grades.length; i++) {
		       if (grades[i] != null) {
		            sum += grades[i].getScore();
		            count++;
		         }
		       }
		 return count > 0 ? sum / count : 0; // to avoid division by zero
        }
//getHighest method
    public GradedActivity getHighest() {
        if (grades[0] == null) return new GradedActivity(); // to prevent null issues

        int highestIndex = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] != null && grades[i].getScore() > grades[highestIndex].getScore()) {
                highestIndex = i;
            }
        }
        return grades[highestIndex];
	}
//getLowest method
	 public GradedActivity getLowest() {
	        if (grades[0] == null) return new GradedActivity(); // to prevent null issues

	        int lowestIndex = 0;

	        for (int i = 1; i < grades.length; i++) {
	            if (grades[i] != null && grades[i].getScore() < grades[lowestIndex].getScore()) {
	                lowestIndex = i;
	            }
	        }
	        return grades[lowestIndex];
    }
	}