import java.util.Objects;

public class User {
    String name;
    int old;
    String phone;

    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old, phone);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return Objects.equals(name, other.name) &&
                old == other.old &&
                Objects.equals(phone, other.phone);
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', old=" + old + ", phone='" + phone + "'}";
    }
}
