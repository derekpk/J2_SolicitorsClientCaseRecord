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
public class ClientRecords{
    
    public static final int SEARCH_BY_ID = 0;
    public static final int SEARCH_BY_NAME = 1;
    public static final int SEARCH_BY_PHONE = 2;
//------------------------------------------------------------------------------    
    // Adds a Tasks to the Tasks array list.
    public ArrayList<ClientRecord> arrayListClientRecord = new ArrayList<ClientRecord>();
    
 //------------------------------------------------------------------------------
   public void reset()
    {
        arrayListClientRecord.clear();
    }
//------------------------------------------------------------------------------
    public void addClientRecord(ClientRecord objClientRecord)
    {
        arrayListClientRecord.add(objClientRecord);    
    }
//------------------------------------------------------------------------------    
    public void addClientRecord(String strID, String strName, String strPhone)
    {
        arrayListClientRecord.add(new ClientRecord(strID, strName, strPhone));    
    }
//------------------------------------------------------------------------------    
    public void addClientRecord(String strID, String strName, String strPhone, int intIndex)
    {
        arrayListClientRecord.add(new ClientRecord(strID, strName, strPhone, intIndex));    
    }
//------------------------------------------------------------------------------
    public int getClientRecordLength()
    {
        return arrayListClientRecord.size();
    }
//------------------------------------------------------------------------------    
    public String getNewClientID()
    {
        return Integer.toString(getClientRecordLength() + 1);
    }  //------------------------------------------------------------------------------
    public ClientRecord getClientRecord(String strSearchString, int intSearchBy)
    {
        String strLocal = "";
            
        for(int intCount=0; intCount < arrayListClientRecord.size(); intCount++)
        {
            switch(intSearchBy){
                case SEARCH_BY_ID:
                    strLocal = arrayListClientRecord.get(intCount).getClientID();
                    break;
                case SEARCH_BY_NAME:
                    strLocal = arrayListClientRecord.get(intCount).getClientName();
                    break;
                case SEARCH_BY_PHONE:
                    strLocal = arrayListClientRecord.get(intCount).getClientPhone();
                    break;
                default:
                    break;
            }
            if(strLocal.equals(strSearchString))
            {
                return arrayListClientRecord.get(intCount);
            }
        }
        return null;
    }
    
//------------------------------------------------------------------------------
    public ClientRecord getClientRecord(int intIndex)
    {
        if(intIndex <= getClientRecordLength() )
        {
            return arrayListClientRecord.get(intIndex);
        }
        return null;
    }
//------------------------------------------------------------------------------ 
}