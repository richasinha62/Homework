package com.hexaware.ftp86.util;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import com.hexaware.ftp86.model.LeaveDetails;

/**
 * This class provides a REST interface for the leavedetails entity.
 */
@Path("/leavedetails")
public class LeaveDetailsRest {

/**
   * Returns a list of all the employees' leaves.
   * @return a list of all the employees' leaves
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final LeaveDetails[] employeesList() {
    System.out.println("Leaves List");
    final LeaveDetails[] leave = LeaveDetails.listAll();
    return leave;
  }

/**
   * Returns a specific employee's details.
   * @param id the id of the employee
   * @return the employee details
   */
  @GET
  @Path("/leaveId/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public final LeaveDetails leaveListById(@PathParam("id") final int id) {
    final LeaveDetails ld = LeaveDetails.listById(id);
    if (ld == null) {
      throw new NotFoundException("No such Employee ID: " + id);
    }
    return ld;
  }

  /**
   * list employee details by id.
   * @param id id to get employee details.
   * @return Employee
   */
  @GET
  @Path("/leaveHis/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public static LeaveDetails[] leaveHisRest(@PathParam("id") final int id) {
    LeaveDetails[] leavehis = LeaveDetails.leaveHis(id);
    if (leavehis == null) {
      throw new NotFoundException("No such Employee ID: " + id);
    }
    return leavehis;
  }

  /**
   * list employee details by id.
   * @param empid id to get employee details.
   * @param lv to fetch leaveDetails table object.
   * @throws ParseException where suitable
   * @return Employee
  */
  @POST
   @Path("/applyLeave/{empid}")
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   public final String applyLeaveRest(@PathParam("empid") final int empid, final LeaveDetails lv)
                            throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String leaveType = lv.getleavetype().toString();
    String result = LeaveDetails.applyLeave(empid, sdf.format(lv.getleavesdate()),
                                  sdf.format(lv.getleaveedate()), lv.getleavendays(),
                                  leaveType, lv.getleavereason());
    return result;
  }
  /**
   * list employee details by id.
   * @param empid id to get employee details.
   * @param lv to fetch leaveDetails table object.
   * @return Employee
  */
  @POST
   @Path("/approveDeny/{empid}")
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   public final String approveDenyRest(@PathParam("empid") final int empid, final LeaveDetails lv) {
    String lvStatus = lv.leavestatus().toString();
    String status = null;
    if (lvStatus.equals("APPROVED")) {
      status = "APPROVE";
    } else {
      status = "DENY";
    }
    String result = LeaveDetails.approveDeny(lv.getleaveid(), empid, status, lv.getleavemanagercomm());
    return result;
  }
}
