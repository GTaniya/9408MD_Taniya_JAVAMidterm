package design;

public interface Employee {
	
	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    int employeeYearsOfExperience = 0;

    // employeeId() will return employee id.
    int employeeId();

    //employeeName() will return employee name
    String employeeName();

    //assignDepartment() will assign employee to departments
    void assignDepartment();

    //calculate employee salary
    int calculateSalary();

    //employee benefit
    void benefitLayout();

    //employeeDDOB
    int employeeDOB();

    //employeeSSN
    int employeeSSN();

    //employeePTPorFT
    void employeePTOorFT();

    //employerWorkLocation
    boolean employeeIsWorkingFromHome();

    //employeeExperience
    int employeeExperience(int employeeYearsOfExperience);

    //employeeJobLevel
    String employeeJobLevel();






}
