
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire
{
    //declaring private instance variable
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    //declaring parametarized constructor
    public PartTimeStaffHire(int Vacancy_number, String Designation, String JobType, int workingHour, int wagesPerHour, String shifts)
    { 
        super(Vacancy_number, Designation, JobType);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.shifts=shifts;
        this.joined=false;
        this.terminated=false;
    }
    //declaring setter and getter method to all the attribute
    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour=wagesPerHour;
    }
    public int getWagesPerHour(){
        return wagesPerHour;
    }
    public void setStaffName(String staffName){
        this.staffName=staffName;
    }
    public String getStaffName(){
        return staffName;
    }
    public void setJoiningDate(String joiningDate){
        this.joiningDate=joiningDate;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public String getQualification(){
        return qualification;
    }
    public void setAppointed(String appointedBy){
        this.appointedBy=appointedBy;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public void setShifts(String Shifts){
        this.shifts=shifts;
    }
    public String getShifts(){
        return shifts;
    }
    public void setJoined(boolean joined){
        this.joined=joined;
    }
    public boolean getJoined()
    {
        return joined;
    }
    public void setTermninated(boolean terminated){
        this.terminated=terminated;
    }
    public boolean getTerminated(){
        return terminated;
    }
    public void setWorkingShifts(String shifts){
        if(joined)
        {
        }
        else
        {
            this.shifts=shifts;
        }
    }
    public void hirestaff(String staffName,String joiningDate,String qualification,String appointedBy)
    {
        if(joined)
        { 
            System.out.println("The name of Staff is "+getStaffName());
            System.out.println("The joining date of staff is "+getJoiningDate());
        }
        else
        {
            this.joiningDate=joiningDate;
            this.staffName=staffName;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
            this.terminated=false;
        }
    }
    public void terminateStaff(String staffName,String joiningDate,String qualification,boolean joined,boolean terminated)
    {
        if(terminated)
        {
            System.out.println("You are terminated");
        }
        else
        {
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.joined=false;
            this.terminated=true;
        }
    }
    public void dispaly()
    {
        super.display();
        if(joined)
        {
            System.out.println("The name of staff is "+getStaffName());
            System.out.println("The wages per hour of staff is "+getWagesPerHour());
            System.out.println("The working hour of staff is "+getWorkingHour());
            System.out.println("The joining date of staff is "+getJoiningDate());
            System.out.println("The qualification of staff is "+getQualification());
            System.out.println("The staff is appointedBy "+getAppointedBy());
            System.out.println("income is not fixed");
        }
    }
}
            
    
       
        
    
        
    
    
 

