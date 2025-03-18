package AnalyzableInterface;


public class PassFailExam extends PassFailActivity{

	private int numQuestions;
	private double pointsEach;
	private int numMissed;

/**
*/
//4-arg constructor
	public PassFailExam(int questions, int missed, double minPassing){
		super(minPassing);
		double numericScore;

		numQuestions = questions;
		numMissed = missed;

		pointsEach = 100.0/questions;
		numericScore = 100.0-(missed * pointsEach);

		setScore(numericScore);
		}
//getter to get each point
	public double getPointsEach(){
		return pointsEach;
		}
//method for number of missed questions
	public int getNumMissed(){
		return numMissed;
		}


	}