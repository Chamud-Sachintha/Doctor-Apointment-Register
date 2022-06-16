package patientappoinmentregister.dao;

public class PatientDetails {
    private int patientId;
    private String firstName;
    private String lastName;
    private int age;
    private int mobileNumber;
    private String gender;
    private String doctorName;
    private String paymentStatus;
    
    public void setId(int id){
        this.patientId = id;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setMobileNumber(int mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setDoctorName(String doctorName){
        this.doctorName = doctorName;
    }
    
    public void setPaymentStatus(String paymentStatus){
        this.paymentStatus = paymentStatus;
    }
    
    public int getPatientId(){
        return this.patientId;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public int getMobileNumber(){
        return this.mobileNumber;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public String getDoctorName(){
        return this.doctorName;
    }
    
    public String getPaymentStatus(){
        return this.paymentStatus;
    }
}
