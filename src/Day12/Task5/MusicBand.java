package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMember = new ArrayList<>();

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

    public void addGroupMember(MusicArtist member){
        groupMember.add(member);
    }
    public void leaveMember(MusicArtist member){
      groupMember.remove(member);
    }

    public void mergingGroups(MusicBand band) {
       band.groupMember.addAll(this.groupMember);
       this.groupMember.removeAll(band.groupMember);
    }
    public void printMembers(){
        System.out.println(groupMember);
    }
}
