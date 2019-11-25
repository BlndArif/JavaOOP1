/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentsproject;

/**
 *
 * @author Blnd
 */
class ICT extends Lectures {
ICT(){    

super.set_l_name("                                                        * ICT :");
super.set_h_perweek(2);
super.set_total_h_persem(16);
}
@Override
public void set_pro_name(){//*********The Overriding Method************
    System.out.println(">> METHOD OVERRIDDING << These * informations * Is * For  ");
}}