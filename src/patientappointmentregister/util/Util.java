package patientappointmentregister.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection CONNECTION = null;
    private static final String DB_URL = "jdbc:ucanaccess://E:\\Project Works\\Bsc Software Engineering\\1st Year\\2 Semester\\Object Oriented Programing\\PatientAppointmentregister\\PatientAppointments.accdb";

    public static Connection getConnection() {
        try {
                CONNECTION = DriverManager.getConnection(DB_URL);
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        return CONNECTION;
    }
}
