package src.unionfind;

public class UF {
    private int[] id;
    //kaç adet bağ olduğunu tutan değişken
    private int count;

    public UF(int N){
        count=N;
        id=new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }

    public int count(){
        return this.count;
    }

    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    public int find(int p){
        return id[p];
    }

    public void union(int p, int q){
        int pId=find(p);
        int qId=find(q);

        if(pId==qId)
            return;
        for(int i=0;i<id.length;i++){
            if(id[i]==pId)
                id[i]=qId;
        }
        count--;
    }



}
