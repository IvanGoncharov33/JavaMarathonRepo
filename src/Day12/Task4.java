package Day12;

public class Task4 {
    public static void main(String[] args) {
      MusicBand anacondaz = new MusicBand("Anacondaz", 2009);
       MusicBand noizeMC = new MusicBand("Noize MC", 2003);

       anacondaz.addGroupMember("Cергей Карамушкин");
       noizeMC.addGroupMember("Иван Алексеев");
       anacondaz.mergingGroups(noizeMC);
       noizeMC.printMembers();
    }
}
