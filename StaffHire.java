
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire
{
    private int Vacancy_number;
    private String Designation;
    private String JobType;
    public StaffHire(int Vacancynumber, String Designation, String JobType){
        this.Vacancy_number=Vacancy_number;
        this.Designation=Designation;
        this.JobType=JobType;
}
public void setVacancy_number(int Vacancy_number){
    this.Vacancy_number=Vacancy_number;
}
public int getVacancy_number(){
    return Vacancy_number;
}
public void setDesignation(String Designation){
    this.Designation=Designation;
}
public String getDesignation(){
    return Designation;
}
public void setJobType(String JobType){
    this.JobType=JobType;
}
public String getJobType(){
    return JobType;
}
public void display(){
    System.out.println("Vacancy_number is ="+this.getVacancy_number());
    System.out.println("Designation is ="+this.getDesignation());
    System.out.println("JobType is ="+this.getJobType());
}
}
