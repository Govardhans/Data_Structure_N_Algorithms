package practice.StringsProblems;

public class InterviewQuestions {
    String name;

    public static void main(String[] args) {
        String abc = "abc";
        String newAbc = "abc";
        String xyz = new String("abc");
        String name1;
        Object obj = new Object();

        if(abc.equals(xyz)){
            System.out.println(" abc . equals xyz"+ true);
        }
        if(abc == newAbc){
            System.out.println("abc == newAbc"+ true);
        }

        if(abc == xyz){
            System.out.println(" abc == xyz"+ true);
        } else{
            System.out.println(" abc == xyz"+ false);
        }

        if(5 == 5){

        }
    }

}
