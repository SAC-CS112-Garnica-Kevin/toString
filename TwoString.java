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
public class TwoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pie Pobject = new Pie(4,5,6);
        Tuna Tobject = new Tuna("Bob", Pobject);
        
        System.out.println(Tobject);
    }
    
}
