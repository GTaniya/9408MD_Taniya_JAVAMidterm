package design;

public abstract class AbstractEmployeeData implements Employee {

    int id;
    String name;
    String department;
    int hours;
    int daysOfWeek;
    int salary = hours * daysOfWeek;
    String benefits;
    int dob;
    int ssn;
    String PtoOrFt;
    boolean workLocation;
    int employeeYearsOfExperience;
    String jobLevel;
    String nationality;
    int startDate;
    boolean isActive;

    //private



    public AbstractEmployeeData(int id, String name, String department, int hours, int daysOfWeek, int salary, String benefits, int dob, int ssn, String ptoOrFt, boolean workLocation, int employeeYearsOfExperience, String jobLevel, String nationality, int startDate, boolean isActive) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.hours = hours;
        this.daysOfWeek = daysOfWeek;
        this.salary = salary;
        this.benefits = benefits;
        this.dob = dob;
        this.ssn = ssn;
        PtoOrFt = ptoOrFt;
        this.workLocation = workLocation;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
        this.jobLevel = jobLevel;
        this.nationality = nationality;
        this.startDate = startDate;
        this.isActive = isActive;
    }

    public AbstractEmployeeData() {

    }



    public int employeeId(int id) {
        return id;
    }


    public String employeeName(String name) {
        return name;
    }


    public void assignDepartment(String department) {

    }


    public int calculateSalary(int salary) {
        return salary = hours * daysOfWeek;
    }


    public void benefitLayout(String benefits) {


    }


    public int employeeDOB(int dob) {
        return dob;
    }


    public int employeeSSN(int ssn) {
        return ssn;
    }


    public void employeePTOorFT(String PtoOrFt) {

    }


    public boolean employeeIsWorkingFromHome(boolean workLocation) {
        return workLocation;
    }


    public int employeeExperience(int employeeYearsOfExperience) {
        return employeeYearsOfExperience;
    }


    public String employeeJobLevel(String jobLevel) {
        return jobLevel;
    }

    public abstract void employeeNationality(String nationality);

    public int employeeStartDate(int startDate) {
        return startDate;
    }

    public boolean employeeIsActive(boolean isActive){
        return isActive;
    }



}
