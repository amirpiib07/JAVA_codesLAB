package LAB_7;

import java.util.Scanner;

public class evaluationlab07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String text=sc.nextLine();
        System.out.println(numberOfvAndc(text));
        sc.close();
    }

    private static int numberOfvAndc(String text) {
        text.toLowerCase();
        int ans=0,cv=0,cc=0;
        for(char ch: text.toCharArray()){
            if("aeiou".contains(""+ch)) cv++;
            if("bcdfghjklmnpqrstvwxyz".contains(ch+"")) cc++;
        }
        System.out.println("number of vowels in string is "+ cv);
        System.out.println("number of consonant in string is "+ cc);
        ans=cc+cv;
        return ans;
    }
}
