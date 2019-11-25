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

public class Absents {
    public static void main(String[] args) {
PersentInterfaceAbs objim=new PersentAbs();
objim.MaxAbs(7);
objim.MinAbs(25);
objim.NoAbs(68);
objim.print();                
Lectures obj=new Lectures();        
obj.set_s_name("Blnd Arif Abdullah");
//*************//


Lectures obj1=new Mathematics();

Lectures overriding=new Lectures();
overriding.set_pro_name();

System.out.println("************ "+obj.get_s_name()+" ************");

Lectures overriden=new Mathematics();
overriden.set_pro_name();



System.out.println(obj1.get_l_name());
System.out.println("Lectures of Second Semester per week for Mathematics : ("+obj1.get_h_perweek()+")");
        System.out.println("Total of lectures for 2.nd semester for  Mathematics : ("+obj1.get_tot_h_persem()+")");
        
        if (obj.get_ab_persem()>0 && obj.get_ab_persem()<=4)
        {
        System.out.println("Number of Absent Lectures For Second Semester        : ("+obj1.get_ab_persem()+")");
       }
        else if(obj.get_ab_persem()>=5 && obj.get_ab_persem()<=9)
        {System.out.println("Number of absents for 2.nd Semester is ("+obj.get_ab_persem()+") Lectures and must pay 100 dollar for attending");}
        else if(obj.get_ab_persem()>=10){
        System.out.println("Number of absents for 2.nd Semester is ("+obj.get_ab_persem()+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("For Second Semester Has no absenties !");
    }
        
System.out.println();
System.out.println();

//*************************//

Lectures obj2=new Programing();
obj2.set_ab_persem(15);

Lectures overriden1=new Programing();
overriden1.set_pro_name();

System.out.println(obj2.get_l_name());

System.out.println("Lectures of Second Semester per week for Mathematics : ("+obj2.get_h_perweek()+")");
        System.out.println("Total of lectures for 2.nd semester for  Mathematics : ("+obj2.get_tot_h_persem()+")");
        
        if (obj2.get_ab_persem()>0 && obj2.get_ab_persem()<=4)
        {
        System.out.println("Number of Absent Lectures For Second Semester        : ("+obj2.get_ab_persem()+")");
       }
        else if(obj2.get_ab_persem()>=5 && obj2.get_ab_persem()<=9)
        {System.out.println("Number of absents for 2.nd Semester is ("+obj2.get_ab_persem()+") Lectures and must pay 100 dollar for attending");}
        else if(obj2.get_ab_persem()>=10){
        System.out.println("Number of absents for 2.nd Semester is ("+obj2.get_ab_persem()+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("For Second Semester Has no absenties !");
    }
System.out.println();
System.out.println();

Lectures obj3=new Networking();
obj3.set_ab_persem(3);

Lectures overriden2=new Networking();
overriden1.set_pro_name();

System.out.println(obj3.get_l_name());

System.out.println("Lectures of Second Semester per week for Mathematics : ("+obj3.get_h_perweek()+")");
        System.out.println("Total of lectures for 2.nd semester for  Mathematics : ("+obj3.get_tot_h_persem()+")");
        
        if (obj3.get_ab_persem()>0 && obj3.get_ab_persem()<=4)
        {
        System.out.println("Number of Absent Lectures For Second Semester        : ("+obj3.get_ab_persem()+")");
       }
        else if(obj3.get_ab_persem()>=5 && obj3.get_ab_persem()<=9)
        {System.out.println("Number of absents for 2.nd Semester is ("+obj3.get_ab_persem()+") Lectures and must pay 100 dollar for attending");}
        else if(obj3.get_ab_persem()>=10){
        System.out.println("Number of absents for 2.nd Semester is ("+obj3.get_ab_persem()+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("For Second Semester Has no absenties !");
    }

System.out.println();
System.out.println();

Lectures obj4=new Javaoop();
obj4.set_ab_persem(5);

Lectures overriden3=new Javaoop();
overriden1.set_pro_name();

System.out.println(obj4.get_l_name());

System.out.println("Lectures of Second Semester per week for Mathematics : ("+obj4.get_h_perweek()+")");
        System.out.println("Total of lectures for 2.nd semester for  Mathematics : ("+obj4.get_tot_h_persem()+")");
        
        if (obj3.get_ab_persem()>0 && obj4.get_ab_persem()<=4)
        {
        System.out.println("Number of Absent Lectures For Second Semester        : ("+obj4.get_ab_persem()+")");
       }
        else if(obj4.get_ab_persem()>=5 && obj4.get_ab_persem()<=9)
        {System.out.println("Number of absents for 2.nd Semester is ("+obj4.get_ab_persem()+") Lectures and must pay 100 dollar for attending");}
        else if(obj4.get_ab_persem()>=10){
        System.out.println("Number of absents for 2.nd Semester is ("+obj4.get_ab_persem()+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("For Second Semester Has no absenties !");


    }
    System.out.println();
    System.out.println();
    
    Lectures obj5=new ICT();
obj5.set_ab_persem(2);

Lectures overriden4=new ICT();
overriden4.set_pro_name();

System.out.println(obj5.get_l_name());

System.out.println("Lectures of Second Semester per week for Mathematics : ("+obj5.get_h_perweek()+")");
        System.out.println("Total of lectures for 2.nd semester for  Mathematics : ("+obj5.get_tot_h_persem()+")");
        
        if (obj5.get_ab_persem()>0 && obj5.get_ab_persem()<=4)
        {
        System.out.println("Number of Absent Lectures For Second Semester        : ("+obj5.get_ab_persem()+")");
       }
        else if(obj5.get_ab_persem()>=5 && obj5.get_ab_persem()<=9)
        {System.out.println("Number of absents for 2.nd Semester is ("+obj5.get_ab_persem()+") Lectures and must pay 100 dollar for attending");}
        else if(obj5.get_ab_persem()>=10){
        System.out.println("Number of absents for 2.nd Semester is ("+obj5.get_ab_persem()+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("For Second Semester Has no absenties !");
        }
    
    
    System.out.println();
    System.out.println();
    
    Lectures obj6=new Algorithm();
obj6.set_ab_persem(0);

Lectures overriden5=new Algorithm();
overriden5.set_pro_name();

System.out.println(obj6.get_l_name());

System.out.println("Lectures of Second Semester per week for Mathematics : ("+obj6.get_h_perweek()+")");
        System.out.println("Total of lectures for 2.nd semester for  Mathematics : ("+obj6.get_tot_h_persem()+")");
        
        if (obj6.get_ab_persem()>0 && obj6.get_ab_persem()<=4)
        {
        System.out.println("Number of Absent Lectures For Second Semester        : ("+obj6.get_ab_persem()+")");
       }
        else if(obj6.get_ab_persem()>=5 && obj6.get_ab_persem()<=9)
        {System.out.println("Number of absents for 2.nd Semester is ("+obj6.get_ab_persem()+") Lectures and must pay 100 dollar for attending");}
        else if(obj6.get_ab_persem()>=10){
        System.out.println("Number of absents for 2.nd Semester is ("+obj6.get_ab_persem()+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("For Second Semester Has no absenties !");
        }}}
