import java.util.Locale;

public class RecommendNewID {
    public static void main(String[] args){
        String new_id = "........................";
        String[] arr = {"!","@","#","\\$","%","\\^","&","\\*","\\(","\\)","\\+","=","/","~","\\[","]","\\{","}",":","\\?","<",">",","};
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        for(int i=0; i<arr.length; i++){
            new_id = new_id.replaceAll(arr[i],"");
        }
        //3단계
        for(int i=0; i<new_id.length(); i++){
            new_id = new_id.replace("..",".");
        }
        //4단계
        for(int i=0; i<new_id.length(); i++){
            if(new_id.substring(0,1).equals(".")){
                new_id = new_id.substring(1,new_id.length());
            }
            if(new_id.length()==0){
                continue;
            }
            if(new_id.substring(new_id.length()-1,new_id.length()).equals(".")){
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }
        if(new_id.equals(".")){
            new_id = "";
        }
        //5단계
        if(new_id.length() == 0){
            new_id = "a";
        }
        //6단계
        if(new_id.length() >=16){
            new_id = new_id.substring(0,15);
            if(new_id.substring(new_id.length()-1,new_id.length()).equals(".")){
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }
        //7단계
        if(new_id.length() <=2){
            while (new_id.length() <=2){
                new_id += new_id.substring(new_id.length()-1,new_id.length());
            }
        }
        System.out.println(new_id);
    }
}
