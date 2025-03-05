import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(currentTime.format(formatter));
    }
}