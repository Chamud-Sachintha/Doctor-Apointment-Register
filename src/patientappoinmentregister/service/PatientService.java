package patientappoinmentregister.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import patientappoinmentregister.dao.PatientDetails;
import patientappointmentregister.util.Util;

public class PatientService {
    public static Connection CONNECTION = Util.getConnection();
    
    public static boolean savePatientAppointmentDetails(PatientDetails newPatient){
        try{
            String sql = "INSERT INTO appointment_details(FIRST_NAME,LAST_NAME,AGE,MOBILE,GENDER,DOC_NAME,STATUS) VALUES ('"+newPatient.getFirstName()+"','"+newPatient.getLastName()+"','"+newPatient.getAge()+"','"+newPatient.getMobileNumber()+"','"+newPatient.getGender()+"','"+newPatient.getDoctorName()+"','"+newPatient.getPaymentStatus()+"')";
            Statement stmt = CONNECTION.createStatement();
            
            System.out.println(newPatient.getFirstName());
            stmt.execute(sql);
            
            return true;
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
