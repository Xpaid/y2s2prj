package data;

import java.awt.Image;
import java.util.Date;

import com.toedter.components.UTF8ResourceBundle;

import tools.Utilities;

public class Employee {
	private Image employeeAvatar;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private String employeeId;
    private String employeeAddress;
    private Date employeeBirthDate;
    private String employeeGender;
    private String employeeEmail;
    private String employeeContact;
    private String employeeJobTitle;
    private String employeeStartDate;
    private String employeeWorkLocation;
    private String employeeBankAcc;
    private String employeeContractEnd;
    private String employeeMonthlySalary;
    private String employeeHourlyWage;

    public Image getEmployeeAvatar() {
    	return employeeAvatar;
	}

	public void setEmployeeAvatar(Image employeeAvatar) {
		if (employeeAvatar == null) {
			employeeAvatar = Utilities.defaultAvatar.getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING);
		}
		this.employeeAvatar = employeeAvatar;
	}

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Date getEmployeeBirthDate() {
        return employeeBirthDate;
    }

    public void setEmployeeBirthDate(Date employeeBirthDate) {
        this.employeeBirthDate = employeeBirthDate;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(String employeeContact) {
        this.employeeContact = employeeContact;
    }

    public String getEmployeeJobTitle() {
        return employeeJobTitle;
    }

    public void setEmployeeJobTitle(String employeeJobTitle) {
        this.employeeJobTitle = employeeJobTitle;
    }

    public String getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(String employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    public String getEmployeeWorkLocation() {
        return employeeWorkLocation;
    }

    public void setEmployeeWorkLocation(String employeeWorkLocation) {
        this.employeeWorkLocation = employeeWorkLocation;
    }

    public String getEmployeeBankAcc() {
        return employeeBankAcc;
    }

    public void setEmployeeBankAcc(String employeeBankAcc) {
        this.employeeBankAcc = employeeBankAcc;
    }

    public String getEmployeeContractEnd() {
        return employeeContractEnd;
    }

    public void setEmployeeContractEnd(String employeeContractEnd) {
        this.employeeContractEnd = employeeContractEnd;
    }

    public String getEmployeeMonthlySalary() {
        return employeeMonthlySalary;
    }

    public void setEmployeeMonthlySalary(String employeeMonthlySalary) {
        this.employeeMonthlySalary = employeeMonthlySalary;
    }

    public String getEmployeeHourlyWage() {
        return employeeHourlyWage;
    }

    public void setEmployeeHourlyWage(String employeeHourlyWage) {
        this.employeeHourlyWage = employeeHourlyWage;
    }


}