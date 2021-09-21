package src.HackerRank;

public class WritingForLoopWithMethod {
    private static int sum(int result,int from,int to){
        result+=from;
        if(from>=to){
            return result;
        }
        return sum(result,++from,to);
    }

    public static void main(String[] args) {
        System.out.println(sum(0,0,10));
    }
}
