import java.util.*;
public class PalinLarge{
    public static void main(String[] args){
         String str;
         Scanner s = new Scanner(System.in);
         str=s.next();
         String palin=FindLarg(str);
         System.out.println(palin);
                                   
    }
    public static String FindLarg(String str){	
         int mi=0,mj=0; 
	 int len=str.length();
         for(int i=0;i<len;i++){
 		for(int j=len;j>i;j--){
			// System.out.println(str.substring(i,j));
		        boolean b=isPalin(str.substring(i,j));
                         if(b){
                             if(j-i>mj-mi){
                                  mj=j;
 			          mi=i;
			      }
                         }
		}
	}
        return str.substring(mi,mj);
   }
    
    public static boolean isPalin(String st){
        int len=st.length();
        int i=0;
        int j=len-1;
        while(i<j){
           if(st.charAt(i++)!=st.charAt(j--))
                return false;
        }
     return true;
    }
}
