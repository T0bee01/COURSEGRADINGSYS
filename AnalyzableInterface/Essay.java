package AnalyzableInterface;


public class Essay extends GradedActivity{
// class fields
	private double grammar;
	private double spelling;
	private double length;
	private double content;
//4-arg constructor for scores
	public Essay(double grammar, double spelling, double length, double content){
		setGrammar(grammar);
		setSpelling(spelling);
		setLength(length);
        setContent(content);
		}
	//no-arg constructor
	public Essay(){
		this(0.0, 0.0, 0.0, 0.0);
		}
//isValidMethod to see if the score is valid or not for each category
	private boolean isValidScore(double score, double max) {
		boolean valid = true;
	     if (score < 0 || score > max) {
	            System.out.println("Invalid score: " + score + " (max " + max + ")");
	            valid = false;
	        }
	        return valid;
    }

   //setter for grammar score
	public void setGrammar(double grammar){
		if(isValidScore(grammar, 30)){
			this.grammar = grammar;
			setTotal();
		}
		}
	//getter for grammar score
	public double getGrammar(){
		return grammar;
		}
//setter for spelling score
	public void setSpelling(double spelling){
		if(isValidScore(spelling, 20)){
			this.spelling = spelling;
			setTotal();
		}
		}

	//getter for spelling score
	public double getSpelling(){
		return spelling;
		}
//setter for length score
	public void setLength(double length){
		if(isValidScore(length, 20)){
			this.length = length;
			setTotal();
		}
	}
//getter for length score
	public double getLength(){
		return length;
		}
//setter for content score
	public void setContent(double content){
		if(isValidScore(content, 30)){
			this.content = content;
			setTotal();
			}
		}
	//getter for content score
	public double getContent(){
		return content;
		}

	//setter for total score of all categories
	public void setTotal(){
		setScore(grammar + spelling + length + content);
		}
	}