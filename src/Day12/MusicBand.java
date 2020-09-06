package Day12;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> groupMember = new ArrayList<>();

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return name + " " + year;
    }

    public void addGroupMember(String member){
        groupMember.add(member);
    }
    public void leaveMember(String member){
      groupMember.remove(member);
    }

    public void mergingGroups(MusicBand band) {
       band.groupMember.addAll(this.groupMember);
       this.groupMember.clear();
    }
    public void printMembers(){
        System.out.println(groupMember);
    }
}
