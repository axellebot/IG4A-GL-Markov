import java.util.Objects;

public class Couple {
    String first;
    String second;

    public Couple(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getString() {
        return first + ' ' + second;
    }

    @Override
    public String toString() {
        return "Couple{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Couple couple = (Couple) o;
        return Objects.equals(first, couple.first) &&
                Objects.equals(second, couple.second);
    }

    @Override
    public int hashCode() {

        return Objects.hash(first, second);
    }
}
