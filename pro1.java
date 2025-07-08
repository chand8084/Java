import java.util.Scanner;
public class pro1 {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    
    int count=0,vowel=0,con=0;
    System.out.println("Enter the sentence: ");
    String sen=obj.nextLine();
        for (int i=0;i<sen.length();i++){
    char chars=sen.charAt(i);
    count++;
        }System.out.println("Total count: "+count);
       for (int i=0;i<sen.length();i++){
        char charss=sen.charAt(i);
         if(charss=='a'||charss=='e'||charss=='i'||charss=='o'||charss=='u'||charss=='A'||charss=='E'||charss=='I'||charss=='O'||charss=='U'){
            vowel++;
        }else{
            con++;
        }
        }
         System.out.println("vowel count: "+vowel);
        System.out.println("Consonent count: "+con);

        String[] words = sen.split(" ");
        String result = "";

        for (int i=0;i<words.length;i++) {
            String reversedWord = "";
        for (int j=words[i].length()-1;j>=0;j--) {
            reversedWord += words[i].charAt(j);
            }

            result += reversedWord + " ";
        }
        System.out.println("Reverse: "+result);
       }
}



