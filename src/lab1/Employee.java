package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document "EncapCheckList.pdf" if
 * needed.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.02
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    public Employee(String firstName, String lastName, String ssn, String cubeId, Date orientationDate) {
        firstName = this.firstName;
        lastName = this.lastName;
        ssn = this.ssn;
        cubeId = this.cubeId;
        orientationDate = this.orientationDate;

    }

    public void setMetWithHr() {
        metWithHr = true;
    }

    public void setMetDeptStaff() {
        metDeptStaff = true;
    }

    public void setMovedIn() {
        movedIn = true;
    }

    public void setOrientationDate(Date enteredDate) {
        orientationDate = enteredDate;
    }
}
