/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientCaseRecords;
/**
 *
 * @author derek keogh
 */
public class Task {
    
//------------------------------------------------------------------------------    
    public Task(){
        //default constructor
        strTaskID = null;
        strTaskDate = null;
        strTaskDuration = null;
        strTaskDescription = null;
    }
//------------------------------------------------------------------------------    
    public Task(String strID, String strDate, String strDuration, String strDescription, String strOwnerID){
        //Values must be set on creation
        strTaskID = strID;
        strTaskDate = strDate;
        strTaskDuration = strDuration;
        strTaskDescription = strDescription;
    }
    
//------------------------------------------------------------------------------    
    private String strTaskID;
    private String strTaskDate;
    private String strTaskDuration;
    private String strTaskDescription;
//------------------------------------------------------------------------------    
    public String getTaskID(){
        return strTaskID;
    }
//------------------------------------------------------------------------------    
    public void setTaskID(String strID){
        strTaskID = strID;
    }    
//------------------------------------------------------------------------------
    public String getTaskDate(){
        return strTaskDate;
    }
//------------------------------------------------------------------------------    
    public void setTaskDate(String strDate){
        strTaskDate = strDate;
    }    
//------------------------------------------------------------------------------
    public String getTaskDuration(){
        return strTaskDuration;
    }
//------------------------------------------------------------------------------    
    public void setTaskDuration(String strDuration){
        strTaskDuration = strDuration;
    }    
//------------------------------------------------------------------------------
    public String getTaskDescription(){
        return strTaskDescription;
    }
//------------------------------------------------------------------------------    
    public void setTaskDescription(String strDescription){
        strTaskDescription = strDescription;
    }    
//------------------------------------------------------------------------------    
}
