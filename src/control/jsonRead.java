import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import src.model.Answer;
import src.model.Question;


public class jsonRead {
    public static String getJSONFromFile(String filename) {
        String jsonText = "";
        try {		
            BufferedReader bufferedReader = 
                          new BufferedReader(new FileReader(filename));
        
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }
        
            bufferedReader.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return jsonText;
    }
    
    public static List importingJsonData(String filename){
        String strJson = getJSONFromFile(filename);
        List  Questions =new ArrayList<Question>();

        
        System.out.println(strJson);
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);
            JSONObject mainJsonObject = (JSONObject) object;
            /*************** questions ****************/

          JSONArray jsonArrayquestions = (JSONArray) mainJsonObject.get("questions");
           //System.out.println("questions : ");
           for (int i = 0; i < jsonArrayquestions.size(); i++) {
             Question Q= new Question(i + 1);
        	JSONObject jsonArrayquestion = (JSONObject) jsonArrayquestions.get(i);
            //  System.out.println("      question " + (i + 1));
              List<String> answers =  (List) jsonArrayquestion.get("answers");
                 for (int j = 0; j < answers.size(); j++) {
                        Answer A= new Answer(answers.get(j));
                        Q.getAnswers().add(A);
                   }            
              //System.out.println("      answers : " + answers);
              String correct_ans = (String) jsonArrayquestion.get("correct_ans");
              Q.setCorrect_ans(correct_ans);
                //System.out.println("      correct_ans : " + correct_ans);
                String team = (String) jsonArrayquestion.get("team");
                Q.setTeam(team);
              // System.out.println("      team : " + team);
               String level = (String) jsonArrayquestion.get("level");
                 Q.setLevel(level);
               //System.out.println("      level : " + level);
               Questions.add(Q);
        
        }
            
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
		return Questions ;
    }
}
