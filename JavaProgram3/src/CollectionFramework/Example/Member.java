package CollectionFramework.Example;

public class Member implements Comparable<Member> {
    public String id;
    public int score;

    public Member(String id, int score){
        this.id = id; this.score = score;
    }

    @Override
    public int compareTo(Member m){
        if(score < m.score) return -1;
        else if(score == m.score) return 0;
        else return 1;
    }
}
