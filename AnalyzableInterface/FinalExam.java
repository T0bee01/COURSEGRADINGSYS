package AnalyzableInterface;

public class FinalExam extends GradedActivity{
//class fields
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
//class 2-arg constructor
	public FinalExam(int questions, int missed){
		double numericScore;
		numQuestions = questions;
		numMissed = missed;

		pointsEach = 100.0/questions;
		numericScore = 100.0 - (missed * pointsEach);

		setScore(numericScore);
		}
//getter for points each
	public double getPointsEach(){
		return pointsEach;
		}
//getter for numMissed
	public int getNumMissed(){
		return numMissed;
	}

	}