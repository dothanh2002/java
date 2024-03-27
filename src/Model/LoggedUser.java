package Model;

public class LoggedUser {
    public User user;
    public int indexInDB;

    public LoggedUser(User user, int indexInDB) {
        this.user = user;
        this.indexInDB = indexInDB;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getIndexInDB() {
        return indexInDB;
    }

    public void setIndexInDB(int indexInDB) {
        this.indexInDB = indexInDB;
    }
}
