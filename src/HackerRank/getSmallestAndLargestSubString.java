package src.HackerRank;

public class getSmallestAndLargestSubString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        int j=k;
        for(int i=0;i<s.length()-k+1;i++){
            String temp=s.substring(i,j);
            if(temp.compareTo(smallest)<0)
                smallest=temp;
            if(temp.compareTo(largest)>0)
                largest=temp;
            j++;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));
    }
}
