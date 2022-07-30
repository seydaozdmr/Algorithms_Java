package src.unionfind;

public class QuickUnion {
    private int [] elems;

    public QuickUnion(){
        elems=new int[10];
        for(int i=0;i<10;i++){
            elems[i]=i;
        }
    }

    public int find(int id){
        while(id!=elems[id]){
             id=elems[id];
        }
        return id;
    }

    public boolean connected(int p,int q){
        return find(p)==find(q);
    }

    public void union(int p,int q){
        if(!connected(p,q)){
            int rootP=find(p);
            int rootQ=find(q);

            elems[rootP]=rootQ;
        }
    }

    public void print(){
        for(int i=0;i<elems.length;i++){
            System.out.println(elems[i]);
        }
    }
}
