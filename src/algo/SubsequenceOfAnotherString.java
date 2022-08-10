package src.algo;

public class SubsequenceOfAnotherString {

    public static boolean isSubsequence(String str1,String str2){
        if(str1.length()==0)
            return false;
        else{
            int i=0;
            for(int j=0;i<str1.length() &&j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j))
                    i++;
                else{
                    i=0;
                }
                if(str1.length()==i)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","asdabcacsdasd"));
    }
}
