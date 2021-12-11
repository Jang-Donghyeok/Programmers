import java.util.ArrayList;

public class SecretMap {
    public static void main(String[] args){
        int n=6;
        int[] arr1={46,33,33,22,31,50};
        int[] arr2={27,56,19,14,14,10};
        String[] answer = new String[arr1.length];
        String binary;
        ArrayList<String> Arr1 = new ArrayList<>();
        ArrayList<String> Arr2 = new ArrayList<>();
        for(int i: arr1){
            binary = Integer.toBinaryString(i);
            String make="";
            if(binary.length() <=n-1){
                for(int j=0; j<n-binary.length(); j++){
                    make += '0';
                }
                Arr1.add(make+binary);
            }else {
                Arr1.add(binary);
            }
        }
        for(int i: arr2){
            binary = Integer.toBinaryString(i);
            String make="";
            if(binary.length() <=n-1){
                for(int j=0; j<n-binary.length(); j++){
                    make += '0';
                }
                Arr2.add(make+binary);
            }else {
                Arr2.add(binary);
            }
        }
        for(int i=0; i<arr1.length; i++){
            String add = "";
            for(int j=0; j<Arr1.size(); j++){
                if(Arr1.get(i).substring(j,j+1).equals("0") && Arr2.get(i).substring(j,j+1).equals("0")){
                    add += " ";
                }else{
                    add += "#";
                }
            }
            answer[i] = add;
        }
        for(String i:answer){
            System.out.println(i);
        }
    }
}

/*
String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
 */
