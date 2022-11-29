package src.model;

import java.util.List;
import java.util.Objects;

public class Question {
    public int question ;
    public List<Answer> answers ;
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


    public List<Answer> getAnswers() {
        return answers;
    }
    public void setAnswers(List<Answer> answers) {
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


    @Override
    public int hashCode() {
        return Objects.hash(answers, correct_ans, level, question, team);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        return Objects.equals(answers, other.answers) && Objects.equals(correct_ans, other.correct_ans)
                && Objects.equals(level, other.level) && question == other.question && Objects.equals(team, other.team);
    }

    @Override
    public String toString() {
        return "Question [question=" + question + ", answers=" + answers + ", correct_ans=" + correct_ans + ", level="
                + level + ", team=" + team + "]";
    }


}


