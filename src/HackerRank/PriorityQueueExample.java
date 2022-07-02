package src.HackerRank;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Student2> tasks=new PriorityQueue<>();

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String queue=sc.nextLine();
            String[] arr=queue.split(" ");
            if(arr[0].equals("ENTER")){
                tasks.offer(new Student2(Integer.parseInt(arr[3]),arr[1],Double.parseDouble(arr[2])));

            }else if(arr[0].equals("SERVED")){
                if(!tasks.isEmpty())
                    tasks.remove();
            }
        }

        if(tasks.isEmpty())
            System.out.println("EMPTY");
        else{
            while(tasks.size()>0){
                System.out.println(tasks.remove());
            }
        }



    }

}
class Student2 implements Comparable<Student2> {
    private int id;
    private String name;
    private double cgpa;

    public Student2(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public int compareTo(Student2 o) {
        if(this.cgpa>o.getCgpa())
            return -1;
        else if(this.cgpa<o.getCgpa())
            return 1;
        else{
            if(this.name.compareTo(o.getName())>0){
                return 1;
            }else if(this.name.compareTo(o.getName())<0){
                return -1;
            }else{
                if(this.id>o.getId())
                    return 1;
                else if(this.id<o.getId())
                    return -1;
                else
                    return 0;
            }
        }
    }
}
