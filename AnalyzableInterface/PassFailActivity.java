package AnalyzableInterface;


public class PassFailActivity extends GradedActivity{

	private double minPassingScore;  //minimum passing score

	public PassFailActivity(double mps){
		minPassingScore = mps;
	}
//getter for grades swiched from ABCDF TO P and F
	public char getGrade(){
		char letterGrade;

		if(super.getScore() >= minPassingScore)
		letterGrade = 'P';
		else
		letterGrade = 'F';

		return letterGrade;
		}
	}