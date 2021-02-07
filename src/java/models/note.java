
package models;

import java.io.Serializable;

/**
 *
 * @author 829364
 */

public class note implements Serializable {
    
     String title;
     String con;
    

    public note() {
        con = "";
        
        title = "";
        
    }

    public note( String con, String title) {
        this.con = con;
        
        this.title = title;
       
    }
    
        public void setCont(String content) {
        this.con = content;
    }
        
     public String getCon() {
        return con;
    }

    public void setTitle(String title) {
        this.title = title;
    }

      public String getTitle() {
        return title;
    }
   
 
    
}