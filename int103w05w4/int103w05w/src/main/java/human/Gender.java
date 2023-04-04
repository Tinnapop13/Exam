package human;

public enum Gender { MALE, FEMALE, OTHER }
/*
public class Gender {
    public static final Gender MALE = new Gender(0);
    public static final Gender FEMALE = new Gender(1);
    public static final Gender OTHER = new Gender(2);
    
    private final int v;
    private Gender(int v) { this.v = v; }
    @Override
    public String toString() {
        return switch(v) {
            case 0 -> "MALE";
            case 1 -> "FEMALE";
            default -> "OTHER";
        };
    }
}
*/