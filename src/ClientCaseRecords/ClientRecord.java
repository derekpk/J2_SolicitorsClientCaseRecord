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
public class ClientRecord {
    
//------------------------------------------------------------------------------    
    public ClientRecord(){
        //default constructor
        strClientID = null;
        strClientName = null;
        strPhoneNumber = null;
        intComboBoxIndex = -1;
    }
//------------------------------------------------------------------------------    
    public ClientRecord(String strID, String strName, String strPhone){
        //default constructor
        //Values must be declared on creation
        strClientID = strID;
        strClientName = strName;
        strPhoneNumber = strPhone;
        intComboBoxIndex = -1;
    }
//------------------------------------------------------------------------------    
    public ClientRecord(String strID, String strName, String strPhone, int intIndex){
        //default constructor
        //Values must be declared on creation
        strClientID = strID;
        strClientName = strName;
        strPhoneNumber = strPhone;
        intComboBoxIndex = intIndex;
        
    }
    
//------------------------------------------------------------------------------    
    public static final int SEARCH_BY_ID = 0;
    //public static final int SEARCH_BY_NAME = 1;
    //public static final int SEARCH_BY_PHONE = 2;
    
    private String strClientID;
    private String strClientName;
    private String strPhoneNumber;
    private int intComboBoxIndex;

    // Adds a Tasks to the Tasks array list.
    public ArrayList<ClientCaseRecord> arrayListClientCaseRecord = new ArrayList<ClientCaseRecord>();
//------------------------------------------------------------------------------    
    public int getComboBoxIndex(){
        return intComboBoxIndex;
    }
//------------------------------------------------------------------------------    
    public void setComboBoxIndex(int intIndex){
        intComboBoxIndex = intIndex;
    }   
//------------------------------------------------------------------------------    
    public String getClientID(){
        return strClientID;
    }
//------------------------------------------------------------------------------    
    public void setClientID(String strID){
        strClientID = strID;
    }
//------------------------------------------------------------------------------    
    public String getClientName(){
        return strClientName;
    }
//------------------------------------------------------------------------------    
    public void setClientName(String strName){
        strClientName = strName;
    }
//------------------------------------------------------------------------------    
    public String getClientPhone(){
        return strPhoneNumber;
    }
//------------------------------------------------------------------------------    
    public void setClientPhone(String strPhone){
        strPhoneNumber = strPhone;
    }
//------------------------------------------------------------------------------    
    public void addClientCaseRecord(ClientCaseRecord objClientCaseRecord){
        arrayListClientCaseRecord.add(objClientCaseRecord);    
    }
//------------------------------------------------------------------------------    
    public void addClientCaseRecord(String strCaseID, boolean booCaseOpen){
        arrayListClientCaseRecord.add(new ClientCaseRecord(strCaseID, booCaseOpen));    
    }
//------------------------------------------------------------------------------    
    public void addClientCaseRecord(String strCaseID, String strIsOpen){
        arrayListClientCaseRecord.add(new ClientCaseRecord(strCaseID, strIsOpen));    
    }
//------------------------------------------------------------------------------    
    public int getClientCaseRecordLength()
    {
        return arrayListClientCaseRecord.size();
    }
//------------------------------------------------------------------------------    
    public ClientCaseRecord getClientCaseRecord(String strSearchString, int intSearchBy)
    {
        String strLocal = "";
            
        for(int intCount=0; intCount <arrayListClientCaseRecord.size(); intCount++)
        {
            switch(intSearchBy){
                case SEARCH_BY_ID:
                    strLocal = arrayListClientCaseRecord.get(intCount).getClientCaseRecordID();
                    break;
                default:
                    break;
            }
            if(strLocal.equals(strSearchString))
            {
                return arrayListClientCaseRecord.get(intCount);
            }
        }
        return null;    
    
    }
//------------------------------------------------------------------------------ 
    public ClientCaseRecord getClientCaseRecord(int intIndex)
    {
        if(intIndex <= getClientCaseRecordLength() )
        {        
            return arrayListClientCaseRecord.get(intIndex);
        }
        return null;
    }
//------------------------------------------------------------------------------     
}
