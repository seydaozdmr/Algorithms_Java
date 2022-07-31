package src.algo;

public class FindLongestCommonSuffixString {
    public static String findSuffix(String [] strs){
        if(strs==null || strs.length==0)
            return "";
        String lcp = reverse(strs[0]);
        for (int i=1;i<strs.length;i++){
            String current=reverse(strs[i]);
            int j=0;
            while(j<current.length() && j<lcp.length() && current.charAt(j)==lcp.charAt(j))
                j++;

            if(j==0)
                return "";

            lcp=current.substring(0,j);

        }
        return reverse(lcp);
    }

    public static String reverse(String e){
        return e.chars()
                .mapToObj(c->(char)c)
                .reduce("",(s,c)->c+s,(s1,s2)->s2+s1);
    }

    public static void main(String[] args) {
        String[]liste= {"catasata","cataeringsata","catbluesata"};
        System.out.println(findSuffix(liste));
    }
}
