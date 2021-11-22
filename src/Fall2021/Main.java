package Fall2021;

public class Main {

    public static void main(String[] args) {

        System.out.println(digits("ade1r4d3"));

    }   public static int digits(String str){
        int sum=0;
        String newString="";
        for (int i = 0; i < str.length(); i++) {

        if(Character.isDigit(str.charAt(i))){
            newString= newString+str.charAt(i);}}

            int fromString=Integer.parseInt(newString);
            for(int k=fromString; k>0; k=k/10){

                sum=sum+k%10;
            }
            return sum;
        }
    }

