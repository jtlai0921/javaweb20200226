/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

public class Test2
{
    private String message = "Hello from JSP!";
    
    public Test2() 
    {
    }

    /**
     * @return the message
    */
    public String getMessage() {
        return message;
    }
 
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
   public String getMsg(){
       return "Test2 msg";
   }
    
}
