enum Status {
    NOT_STARTED("Not Started"),
    IN_PROGRESS("In Progress"),
    DONE("Done"),
    PAUSED("Paused");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Status status = Status.NOT_STARTED;
        System.out.println(status);
        System.out.println(status.ordinal());
        System.out.println(status.getValue());

        Status[] statuses = Status.values();
        for (Status s: statuses) {
            System.out.println(s + " : " + s.ordinal());
        }

        // enums are extends from enum class
        System.out.println(status.getClass());
        System.out.println(status.getClass().getSuperclass());
    }    
}
