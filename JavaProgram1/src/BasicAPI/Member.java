package BasicAPI;

import java.util.Arrays;

public class Member implements Comparable<Member>{
    public String id;
    public int[] Scores;

    //Constructor
    public Member(String id, int[] Scores){this.id = id; this.Scores = Scores;}

    //Deconstructor
    @Override
    public void finalize() throws Throwable{
        System.out.println("Member Constructor finalized!");
    }

    //Compare method
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Object){
            Member member = (Member) obj;
            if(id.equals(member.id)) return true;
        }
        return false;
    }
    @Override  //-> Used to sorting
    public int compareTo(Member o){
        return id.compareTo(o.id);
    }
    @Override
    public int hashCode(){return id.hashCode();}
    

    //Deep Clone
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Member Cloned = new Member(this.id, null);
        Cloned.Scores = Arrays.copyOf(this.Scores, this.Scores.length);
        return Cloned;
    }

    public Member getMember(){
        Member Cloned = null;
        try{
            Cloned = (Member)clone();
        }
        catch(CloneNotSupportedException e){e.printStackTrace();}
        return Cloned;
    }
}
