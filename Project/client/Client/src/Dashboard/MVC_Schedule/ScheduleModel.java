/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard.MVC_Schedule;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Carlos Guisao
 */
public class ScheduleModel {
    
    public ScheduleModel(){
        calendar = Calendar.getInstance();
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public int getLabId() {
        return labId;
    }
    
    public void setLabId(int labId){
        this.labId = labId;
    }
    
    public Date getReservationStart() {
        return reservationStart;
    }

    public void setReservationStart(Date reservationStart) {
        this.reservationStart = reservationStart;
    }

    public Date getReservationEnd() {
        return reservationEnd;
    }

    public void setReservationEnd(Date reservationEnd) {
        this.reservationEnd = reservationEnd;
    }
    
    private int id;
    private String userId;
    private int labId;
    private Date reservationStart;
    private Date reservationEnd;
    private final Calendar calendar;
}
