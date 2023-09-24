package hm2.task3;

public enum Gender {
    Male("Male");

    private final String type;

    Gender(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "type='" + type + '\'' +
                '}';
    }
}
