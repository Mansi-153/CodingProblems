import java.util.Scanner;

public class StringAnalyse{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        StringBuffer newString = new StringBuffer(second);
        int count=0,j=0,sum=first.length()+second.length();
        for(int i=0;i<first.length();i++){
            for(j=0;j<newString.length();j++){
                if(first.charAt(i)==newString.charAt(j)){
                   count++;
                   newString.setCharAt(j, '@');
                    break;
                }
            }
        }
        System.out.println(sum-2*count);
    }
}