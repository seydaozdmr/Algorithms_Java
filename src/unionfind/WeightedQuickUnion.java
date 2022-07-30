package src.unionfind;

public class WeightedQuickUnion {
    private int [] elems;
    private int [] size;

    public boolean connected(int p,int q){
        return find(p)==find(q);
    }

    public int find(int id){
        while(id!=elems[id]){
            id=elems[id];
        }
        return id;
    }

    public void union(int p,int q){
        if(!connected(p,q)){
            int rootP=find(p);
            int rootQ=find(q);

            if(size[rootP]>size[rootQ]){
                elems[rootP] = rootQ;
                size[rootQ]+=size[rootQ];
            }else{
                elems[rootQ]=rootP;
                size[rootP]+=rootQ;
            }
        }
    }

    public void print(){
        for(int i=0;i<elems.length;i++){
            System.out.println(elems[i]);
        }
    }
}
