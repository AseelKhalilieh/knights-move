package sample.src.model;


import java.util.List;


public class Question {
  public int question ; 
public List<String> answers ;
public  String correct_ans; 
public  String level; 
public String team ;
public Question(int i) {
	super();
	this.question = i;
}

public int getQuestion() {
	return question;
}
public void setQuestion(int question) {
	this.question = question;
}


public List<String> getAnswers() {
	return answers;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
public String getCorrect_ans() {
	return correct_ans;
}
public void setCorrect_ans(String correct_ans) {
	this.correct_ans = correct_ans;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}

public JSONObject get(String string) {
	// TODO Auto-generated method stub
	return null;
}

}

