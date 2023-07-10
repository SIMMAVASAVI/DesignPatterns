package builder;

public class Client {
    public static void main(String[] args) {
        Student st= Student.builder()
                .setName("vasavi")
                .setMobileNo(1233456)
                .setRollNo(123)
                .build();
    }
}
