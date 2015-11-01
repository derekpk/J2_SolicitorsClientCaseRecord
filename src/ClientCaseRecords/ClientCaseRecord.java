/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientCaseRecords;

import java.util.ArrayList;

/**
 *
 * @author derek keogh
 */
public class ClientCaseRecord{

//------------------------------------------------------------------------------    
    // Adds a Task object to the Task array list.
    public ArrayList<Task> arrayListTask = new ArrayList<Task>();

        private String strClientCaseRecordID;
        private boolean booClientCaseRecordOpen;
        private String strCaseState;

        public static final String CASE_OPEN = "Open";
        public static final String CASE_CLOSED = "Closed";

//------------------------------------------------------------------------------    
    public ClientCaseRecord(String strID, boolean booOpen){
        //default constructor
        //Values must be declared on creation
        strClientCaseRecordID = strID;
        booClientCaseRecordOpen = booOpen;
    }
//------------------------------------------------------------------------------    
     public ClientCaseRecord(String strID, String strIsOpen){
        //default constructor
        //Values must be declared on creation
        strClientCaseRecordID = strID;
        booClientCaseRecordOpen = true;
        if(!strIsOpen.equals(CASE_OPEN))
        {
            booClientCaseRecordOpen = false;
        }
    }
//------------------------------------------------------------------------------    
    public String getClientCaseRecordID(){
        return strClientCaseRecordID;
    }
//------------------------------------------------------------------------------    
    public void setClientCaseRecordID(String strID){
        strClientCaseRecordID = strID;
    }
//------------------------------------------------------------------------------
    public void setClientCaseState(String strState)
    {
        strCaseState = strState;
    }
//------------------------------------------------------------------------------
    public String getClientCaseState()
    {
        if(booClientCaseRecordOpen == true)
            return CASE_OPEN;
        else
            return CASE_CLOSED;
    }
//------------------------------------------------------------------------------
    public boolean getClientCaseRecordOpen(){
        return booClientCaseRecordOpen;
    }
//------------------------------------------------------------------------------    
    public void setClientCaseRecordOpen(boolean booOpen){
        booClientCaseRecordOpen = booOpen;
    }   
//------------------------------------------------------------------------------    
    public int getClientTaskLength()
    {
        return arrayListTask.size();
    }    
//------------------------------------------------------------------------------    
    public void addTask(Task objTask){
        arrayListTask.add(objTask);    
    }
//------------------------------------------------------------------------------    
    public void addTask(String strID, String strDate, String strDuration, String strDescription, String strOwnerID){
        arrayListTask.add(new Task(strID, strDate, strDuration, strDescription, strOwnerID));    
    }
//------------------------------------------------------------------------------    
    public Task getClientTaskRecord(int intIndex)
    {
        if(intIndex <= getClientTaskLength() )
        {
          return arrayListTask.get(intIndex);
        }
        return null;
    }
//------------------------------------------------------------------------------    
}
