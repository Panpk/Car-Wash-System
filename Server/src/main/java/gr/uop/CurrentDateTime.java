package gr.uop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    
    public String GetCurrentDateTime(){
        //**Get the current date and time**
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Define a custom date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Format the current date and time as a string
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }
}
