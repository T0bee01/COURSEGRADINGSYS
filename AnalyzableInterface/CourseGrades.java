package AnalyzableInterface;


public class CourseGrades{
//grade array field for class
	private GradedActivity[] grades;

//constructor for class to accept 4 categories
	public CourseGrades(){
		grades = new GradedActivity[4];

		}
//setter method for lab activity
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
//toStringMethod
	public String toString(){
		String[] categories = {"Lab Activity", "Pass/Fail Exam", "Essay", "Final Exam"};
		String result = "";

		for(int i = 0; i < grades.length; i++){
			result+=String.format("%-15s: Score = %-5.1f, Grade = %c%n", categories[i], grades[i].getScore(), grades[i].getGrade());
			}
		return result;

		}
	}