
/**
 * This class module a BNU module.This class module represents code, title and credit value
 * of a given module. 
 *
 * @author Narinder Kaur
 * @version 12/11/2021
 */
public class Module
{
    // Variables 
    private String code;
    private String title; 
    private int credit; 
    
    /**
     * Module constructor assigns the code and title for a module
     * It also initialises the credit value to 0 
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        this.credit = 0; 
    }
    /**
     * This method returns the code for the module 
     * 
     * @return code represent the module code 
     */
    public String getcode()
    {
      return code;  
    }
    public String getTitle()
    {
        return title; 
    }
     public int getcredit()
    {
        return credit; 
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Print the details of the module which include the code, 
     * title and credits 
     */
    public void print()
    {
        System.out.println(" module Code: " + code + ": " + title);
        System.out.println(" Credit:" + credit );
        System.out.println();
    
    }
}