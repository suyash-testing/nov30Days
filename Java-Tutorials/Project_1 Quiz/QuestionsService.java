import java.util.Scanner;

public class QuestionsService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    // ! Constructor
    public QuestionsService(){
        questions[0] = new Question(1,"What is size of byte ?","1","2","4","8" ,"1");
        questions[1] = new Question(2,"What is size of short ?","1","2","4","8" ,"2");
        questions[2] = new Question(3,"What is size of int ?","1","2","4","8" ,"4");
        questions[3] = new Question(4,"What is size of long ?","1","2","4","8" ,"8");
        questions[4] = new Question(5,"What is size of boolean in bits ?","1","2","4","8" ,"1");
    }
    
    // Playing Quiz
    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            
            System.out.println("Question No : "  + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }

        for(String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0 ;
        for(int i = 0 ; i < questions.length; i++){
            Question currQue = questions[i];
            String ans = currQue.getAnswer();
            String userEntered = selection[i];

            if(ans.equals(userEntered)) score++;
        }

        System.out.println("Score is : " +  score);

    }


}


