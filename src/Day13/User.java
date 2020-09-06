package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String userName;
    private List<User> subsciptions;

    public User(String userName) {
        this.userName = userName;
        subsciptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubsciptions() {
        return subsciptions;
    }

    public void subscribe(User user) {
        this.subsciptions.add(user);
    }

    public boolean isSubscribed(User user) {
        if (subsciptions.contains(user)) {
            return true;
        }return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage (User user, String text) {
        MessageDataBase.sendMessage(this,user,text);
    }

    @Override
    public String toString() {
        return this.userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userName.equals(user.userName) &&
                Objects.equals(subsciptions, user.subsciptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, subsciptions);
    }
}
