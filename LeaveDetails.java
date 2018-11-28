package com.hexaware.ftp86.model;

import com.hexaware.ftp86.persistence.DbConnection;
import com.hexaware.ftp86.persistence.LeaveDetailsDAO;
import com.hexaware.ftp86.persistence.EmployeeDAO;
import java.util.Date;
import java.util.Objects;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * leavedetails class to store employee personal details.
 * @author hexware
 */
public class LeaveDetails {

  /**
   * leaveid to store leave id.
   */
  private int leaveid;
  /**
   * empid to store employee id.
   */
  private int empid;
  /**
   * leavesdate to store leave Start date.
   */
  private Date leavesdate;
  /**
   * LEAVE_EDATE to store leave End date.
   */
  private Date leaveedate;
  /**
   * leavendays to store leave no of days.
   */
  private int leavendays;
  /**
   * leavetype to store  leave type.
   */
  private LeaveType leavetype;
  /**
   * leavestatus to store  leave status.
   */
  private LeaveStatus leavestatus;
  /**
   * leavereason to store leave reason.
   */
  private String leavereason;
  /**
   * leaveappliedon to store leave appliedon.
   */
  private Date leaveappliedon;
  /**
   * leavemanagercomm to store  manager comments.
   */
  private String leavemanagercomm;

  /**
   * empty constructor initialized.
   */
  public LeaveDetails() {

  }

  /**
   * Default constructor.
   */
  public LeaveDetails() {

  }

  @Override
  public final int hashCode() {
    return Objects.hash(leaveid, empid, leavesdate, leaveedate, leavendays, leavetype, leavestatus,
    leavereason, leaveappliedon, leavemanagercomm);
  }

  /**
   * @param argleaveid to initialize Leavedetails id.
   * @param argempid to initialize employee id.
   * @param argleavesdate to initialize Leavedetails start date.
   * @param argleaveedate to initialize Leavedetails end date.
   * @param argleavendays to initialize Leavedetails no of days.
   * @param argleavetype to initialize Leavedetails type.
   * @param argleavestatus to initialize Leave status.
   * @param argleavereason to initialize Leave reason.
   * @param argleaveappliedon to initialize leave applied on.
   * @param argleavemanagercomm to initialize leave manager comments.
   */

  public LeaveDetails(final int argleaveid, final int argempid, final Date argleavesdate, final Date argleaveedate,
      final int argleavendays, final LeaveType argleavetype, final LeaveStatus argleavestatus,
      final String argleavereason, final Date argleaveappliedon, final String argleavemanagercomm) {
    this.leaveid = argleaveid;
    this.empid = argempid;
    this.leavesdate = argleavesdate;
    this.leaveedate = argleaveedate;
    this.leavendays = argleavendays;
    this.leavetype = argleavetype;
    this.leavestatus = argleavestatus;
    this.leavereason = argleavereason;
    this.leaveappliedon = argleaveappliedon;
    this.leavemanagercomm = argleavemanagercomm;
  }

  /**
   * Gets the leave id.
   * @return this Employee's leave ID.
   */
  public final int getleaveid() {
    return leaveid;
  }

  /**
   *
   * @param argleaveid to set leave id.
   */
  public final void setleaveid(final int argleaveid) {
    this.leaveid = argleaveid;
  }
  /**
   * Gets the EmployeeName.
   * @return this Employee's Name.
   */
  public final int getempid() {
    return empid;
  }
  /**
   *
   * @param argEmpid to set employee Name.
   */
  public final void setEmpid(final int argEmpid) {
    this.empid = argEmpid;
  }
  /**
   * Gets the Leave start date.
   * @return this Leave start date.
   */
  public final Date getleavesdate() {
    return leavesdate;
  }

  /**
   *
   * @param argleavesdate to set Leave start date.
   */
  public final void setleavesdate(final Date argleavesdate) {
    this.leavesdate = argleavesdate;
  }
   /**
   * Gets the EmployeeEmail.
   * @return this Employee's email.
   */
  public final Date getleaveedate() {
    return leaveedate;
  }

  /**
   *
   * @param argleaveedate to set employee id.
   */
  public final void setleaveedate(final Date argleaveedate) {
    this.leaveedate = argleaveedate;
  }
   /**
   * Gets the EmployeeMob.
   * @return this Employee's Mob.
   */
  public final int getleavendays() {
    return leavendays;
  }

  /**
   *
   * @param argleavendays to set employee Mob.
   */
  public final void setleavendays(final int argleavendays) {
    this.leavendays = argleavendays;
  }
   /**
   * Gets the EmployeeDoj.
   * @return this Employee's Doj.
   */
  public final LeaveType getleavetype() {
    return leavetype;
  }

  /**
   *
   * @param argleavetype to set employee Doj.
   */
  public final void setleavetype(final LeaveType argleavetype) {
    this.leavetype = argleavetype;
  }
   /**
   * Gets the EmployeeLeavbal.
   * @return this Employee's Leavbal.
   */
  public final LeaveStatus leavestatus() {
    return leavestatus;
  }

  /**
   *
   * @param argleavestatus to set employee Leavbal.
   */
  public final void setleavestatus(final LeaveStatus argleavestatus) {
    this.leavestatus = argleavestatus;
  }
   /**
   * Gets the EmployeeMgrid.
   * @return this Employee's Mgrid.
   */
  public final String getleavereason() {
    return leavereason;
  }

  /**
   *
   * @param argleavereason to set employee Mgrid.
   */
  public final void setleavereason(final String argleavereason) {
    this.leavereason = argleavereason;
  }
    /**
   * Gets the EmployeeMgrid.
   * @return this Employee's Mgrid.
   */
  public final Date getleaveappliedon() {
    return leaveappliedon;
  }

  /**
   *
   * @param argleaveappliedon to set employee Mgrid.
   */
  public final void setleaveappliedon(final Date argleaveappliedon) {
    this.leaveappliedon = argleaveappliedon;
  }
    /**
   * Gets the EmployeeMgrid.
   * @return this Employee's Mgrid.
   */
  public final String getleavemanagercomm() {
    return leavemanagercomm;
  }

  /**
   *
   * @param argleavemanagercomm to set employee Mgrid.
   */
  public final void setleavemanagercomm(final String argleavemanagercomm) {
    this.leavemanagercomm = argleavemanagercomm;
  }
  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    LeaveDetails ld = (LeaveDetails) obj;
    if (Objects.equals(leaveid, ld.leaveid)
        && Objects.equals(empid, ld.empid)
        && Objects.equals(leavesdate, ld.leavesdate)
        && Objects.equals(leaveedate, ld.leaveedate)
        && Objects.equals(leavendays, ld.leavendays)
        && Objects.equals(leavetype, ld.leavetype)
        && Objects.equals(leavestatus, ld.leavestatus)
        && Objects.equals(leavereason, ld.leavereason)
        && Objects.equals(leaveappliedon, ld.leaveappliedon)
        && Objects.equals(leavemanagercomm, ld.leavemanagercomm)) {
      return true;
    }
    return false;
  }

  /**
   * The dao for LeaveDetails.
   */
  private static LeaveDetailsDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(LeaveDetailsDAO.class);
  }

  /**
   * The dao for EmployeeDetails.
   */
  private static EmployeeDAO edao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }
  /**
   * list all employee details.
   * @return all employees' details
   */
  public static LeaveDetails[] listAll() {

    List<LeaveDetails> es = dao().list();
    return es.toArray(new LeaveDetails[es.size()]);
  }

/**
   * list all employee leave details.
   * @param mgrId id to get employee leave Details.
   * @return all employee leave details
   */
  public static LeaveDetails[] listPending(final int mgrId) {

    List<LeaveDetails> e = dao().pending(mgrId);
    return e.toArray(new LeaveDetails[e.size()]);
  }

  /**
   * list employee details by id.
   * @param leaveid id to get employee details.
   * @return Employee
   */
  public static LeaveDetails listById(final int leaveid) {
    return dao().find(leaveid);
  }

 /**
   * list employee details by id.
   * @param empID id to get employee details.
   * @return Employee
   */
  public static LeaveDetails[] leaveHis(final int empID) {
    List<LeaveDetails> es = dao().empHistory(empID);
    return es.toArray(new LeaveDetails[es.size()]);
  }
  /**
  * returns ManagerId for. LeaveId value
  * @param leaveId id to get employee manager details.
  * @return int.
  */
  public static int showManager(final int leaveId) {
    return dao().showManager(leaveId);
  }

  /**
   * NO of overlapping Leaves.
   * @param empId id to get employee details.
   * @param startDate id to get employee details.
   * @param endDate id to get employee details.
   * @return count of no of employee.
   */
  public static int countNo(final int empId, final String startDate, final String endDate) {
    int count = dao().count(empId, startDate, endDate);
    return count;
  }

// /**
//    * Method for Approve or Deny the Leave.
//    * @param leaveId to enter LeaveId to approve/deny.
//    * @param empId to enter empId to approve/deny.
//    * @param lstatus to enter status to approve/deny.
//    * @param mgrcomments to get manager comments.
//    * @throws NullPointerException This will throw the Exception.
//    * @return String.
//    */

  // public static String approveDeny(final int leaveId, final int empId,
  //final String lstatus, final String mgrcomments)
  //                                 throws NullPointerException {
  //   LeaveDetails ld = LeaveDetails.listById(leaveId);
  //   int noOfDays = ld.getleavendays();
  //   int emplId = ld.getempid();
  //   int empdId = LeaveDetails.showManager(leaveId);
  //   String res = null;
  //   String dbStatus = null;
  //   if (empId != empdId) {
  //     res = "You are not authorised to access this employee.";
  //     return res;
  //   }
  //   if (lstatus.equals("YES") || lstatus.equals("yes")) {
  //     dbStatus = "APPROVED";
  //     res = "Leave Approved Successfully";
  //   } else {
  //     dbStatus = "REJECTED";
  //     edao().increment(emplId, noOfDays);
  //     res = "Leave Rejected";
  //   }
  //   dao().comment(mgrcomments, dbStatus, leaveId);
  //   return res;
  // }


/**
   * Method for Approve or Deny the Leave.
   * @param leaveId to enter LeaveId to approve/deny.
   * @param empId to enter empId to approve/deny.
   * @param lstatus to enter status to approve/deny.
   * @param mgrcomments to get manager comments.
   * @throws ParseException throws Parse Exception
   * @return String.
   */

  public static String approveDeny(final int leaveId, final int empId, final String lstatus, final String mgrcomments) {
    LeaveDetails ld = LeaveDetails.listById(leaveId);
    int noOfDays = ld.getleavendays();
    int emplId = ld.getempid();
    // Employee ed = Employee.listById(emplId);
    // int empLvBal = ed.getavlLeave();
    // int lvAvl = empLvBal - noOfDays;
    int empdId = LeaveDetails.showManager(leaveId);
    String res = null;
<<<<<<< HEAD
    String dbStatus = String.valueOf(ld.leavestatus());
=======
    String dbStatus = null;
    int availbal = edao().find(ld.getempid()).getavlLeave();
    System.out.println(availbal);
    System.out.println(noOfDays);
    System.out.println(lstatus);
    System.out.println(ld.leavestatus());
>>>>>>> e63bfda869242ce364c696a47997d52ef6d8eae2
    if (empId != empdId) {
      res = "You are not authorised to access this employee.";
      return res;
    }
<<<<<<< HEAD
    if (empId == empdId) {
      if (lstatus.equals("APPROVE") || lstatus.equals("approve") && dbStatus.equals("PENDING")) {
        dbStatus = "APPROVED";
        res = "Leave Approved Successfully";
      } else if (lstatus.equals("APPROVE") || lstatus.equals("approve") && dbStatus.equals("REJECTED")) {
        dbStatus = "APPROVED";
        edao().appDenyDecrement(emplId, noOfDays);
        res = "Leave Approved Successfully";
      } else if (lstatus.equals("DENY") || lstatus.equals("deny") && dbStatus.equals("PENDING")) {
        dbStatus = "REJECTED";
        edao().increment(emplId, noOfDays);
        res = "Leave Rejected";
      } else if (lstatus.equals("DENY") || lstatus.equals("deny") && dbStatus.equals("APPROVED")) {
        dbStatus = "REJECTED";
        edao().increment(emplId, noOfDays);
        res = "Leave Rejected";
      }
=======
    if (lstatus.equals("APPROVE") && ld.leavestatus().equals(LeaveStatus.PENDING)) {
      dbStatus = "APPROVED";
      res = "Leave Approved Successfully";
    } else if (lstatus.equals("DENY") && ld.leavestatus().equals(LeaveStatus.APPROVED)) {
      dbStatus = "REJECTED";
      edao().increment(emplId, noOfDays);
      res = "Leave Rejected";
    } else if (lstatus.equals("APPROVE") && ld.leavestatus().equals(LeaveStatus.REJECTED)) {
      dbStatus = "APPROVED";
      edao().decrement(emplId, (availbal - noOfDays));
      res = "Leave Approved Successfully";
    } else {
      dbStatus = "REJECTED";
      edao().increment(emplId, noOfDays);
      res = "Leave Rejected";
>>>>>>> e63bfda869242ce364c696a47997d52ef6d8eae2
    }
    dao().comment(mgrcomments, dbStatus, leaveId);
    return res;
  }

/**
   * Applyy Leave for employee.
   * @param empId id to set employee id.
   * @param startDate id to set employee startDate.
   * @param endDate id to set employee endDate.
   * @param noOfdays id to set employee noOfdays.
   * @param leaveType id to set employee leaveType.
   * @param leaveReason id to set employee leaveReason.
   * @throws ParseException throws Parse Exception
   * @return String
   */
  public static String applyLeave(final int empId,
                                  final String startDate,
                                  final String endDate,
                                  final int noOfdays,
                                  final String leaveType,
                                  final String leaveReason
  ) throws ParseException {
    String s = null;
    Employee emplo = Employee.listById(empId);
    if (emplo != null) {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      Date stDate = sdf.parse(startDate);
      Date enDate = sdf.parse(endDate);
      Calendar start = Calendar.getInstance();
      start.setTime(stDate);
      Calendar end = Calendar.getInstance();
      end.setTime(enDate);
      int count = 0;
      for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1 || dayOfWeek == 7) {
          count++;
        }
      }
      System.out.println(count);
      long diff = enDate.getTime() - stDate.getTime();
      System.out.println(diff);
      long days = diff / (1000 * 60 * 60 * 24);
      Date today = new Date();
      String appliedOn = sdf.format(today);
      days = days + 1;
      long availBal = 0;
      long dif = 0;
      long updLeave = 0;
      String leaveStatus = null;
      int overlap = LeaveDetails.countNo(empId, startDate, endDate);
      availBal = emplo.getavlLeave();
      dif = availBal - days;
      updLeave = availBal - days;
      if (days <= 0) {
        s = "Start Date Must be Greater than EndDate...";
      } else if (dif < 0) {
        s = "insufficient leav balance";
      } else if (noOfdays != days) {
        s = "NO Of Days Should be right";
      } else if (stDate.compareTo(sdf.parse(appliedOn)) < 0) {
        s = "Start should be greater or equal to current date";
      } else if (overlap > 0) {
        s = "already applied on given date";
      } else {
        if (emplo.getMgrId() == 0) {
          leaveStatus = "APPROVED";
          dao().apply(empId, startDate, endDate, noOfdays,
              leaveType, leaveStatus, leaveReason, appliedOn);
          s = "Leave Applied Successfully...";
        } else {
          leaveStatus = "PENDING";
          dao().apply(empId, startDate, endDate, noOfdays,
              leaveType, leaveStatus, leaveReason, appliedOn);
          int bal = (int) updLeave;
          edao().decrement(empId, bal + count);
          s = "Leave Applied Successfully For "  + (days - count) + " Days.";
        }
      }
    } else {
      s = "invalid employee";
    }
    return s;
  }
}
