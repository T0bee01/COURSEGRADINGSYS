package AnalyzableInterface;

//interface to be implemented in courseGrades
public interface Analyzable{
	double getAverage();

	default GradedActivity getHighest(){//default method for getHighest returns null
		return null;
		}
	default GradedActivity getLowest(){//default method for getLowest returns null
		return null;
		}
}