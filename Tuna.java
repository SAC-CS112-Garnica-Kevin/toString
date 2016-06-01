/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twostring;

/**
 *
 * @author owner
 */
public class Tuna {
    
    private String name; 
    private Pie birthday; 
    
    public Tuna(String theName, Pie theBirthDate)
    {
        name = theName; 
        birthday = theBirthDate;
    }
    
    public String toString()
    {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
