package Day12.Task5;



public class Task5 {
    public static void main(String[] args) {
        MusicBand anacondaz = new MusicBand("Anacondaz", 2009);
        MusicBand noizeMC = new MusicBand("Noize MC", 2003);

        anacondaz.addGroupMember(new MusicArtist("Сергей Карамушкин", 28));
        noizeMC.addGroupMember(new MusicArtist("Иван Алексеев", 34));

        anacondaz.mergingGroups(noizeMC);

        noizeMC.printMembers();
    }
}
