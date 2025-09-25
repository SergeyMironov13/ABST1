import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    int сount = 0;


    @Override
    public void log(String msg) {
        String timestamp = LocalDateTime.now().toString();
        сount++;

        // Определяем тип сообщения (INFO или ERROR)
        String messageType = "INFO";

        if (msg.toLowerCase().contains("error")) {
            messageType = "ERROR";
        }


        System.out.println(messageType + "#" + сount + " [" + timestamp + "] " + msg);
    }
}
