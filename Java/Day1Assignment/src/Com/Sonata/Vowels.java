package Com.Sonata;

public class Vowels {
public static void main(String[] args) {
        
		String ary = "Bhavya pidikiti";
		
        char ch[]=ary.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
                ch[i]='$';
               }   
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
