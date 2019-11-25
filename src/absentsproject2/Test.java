/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentsproject2;

/**
 *
 * @author Blnd
 */
public class Test {

    
    
public static void main(String[] args) {
Lectures Lec=new Lectures();
Students StInfo=new Students("IT",1,"Blnd Arif Abdullah","A",Lec);
System.out.println("Student ID    :"+StInfo.ID+"\nStudent Name  :"+StInfo.Name+"\nSt Department :"+StInfo.Department+"\nStudent Group :"+StInfo.Group);
Lec.MathAb(5);
Lec.AlgAb(2);
Lec.NetAb(10);
Lec.ProgAb(0);
Lec.WebAb(10);
Lec.JavAb(8);
Lec.ItAb(7);

    
System.out.println("***********************************************************************************");
Lectures Lec2=new Lectures();
Students StInfo2=new Students("IT",2,"rawand Kamaran Ahmad","A",Lec2);
System.out.println("Student ID    :"+StInfo2.ID+"\nStudent Name  :"+StInfo2.Name+"\nSt Department :"+StInfo2.Department+"\nStudent Group :"+StInfo2.Group);
Lec2.MathAb(0);
Lec2.AlgAb(8);
Lec2.NetAb(15);
Lec2.ProgAb(2);
Lec2.WebAb(4);
Lec2.JavAb(2);
Lec2.ItAb(0);

System.out.println("***********************************************************************************");

Lectures Lec3=new Lectures();
Students StInfo3=new Students("IT",3,"Bashdar Mhammad Karim","A",Lec3);
System.out.println("Student ID    :"+StInfo3.ID+"\nStudent Name  :"+StInfo3.Name+"\nSt Department :"+StInfo3.Department+"\nStudent Group :"+StInfo3.Group);
Lec3.MathAb(0);
Lec3.AlgAb(14);
Lec3.NetAb(10);
Lec3.ProgAb(5);
Lec3.WebAb(4);
Lec3.JavAb(0);
Lec3.ItAb(0);

System.out.println("***********************************************************************************");
Lectures Lec4=new Lectures();
Students StInfo4=new Students("IT",1,"Bawar Hiwa Yasin","B",Lec4);
System.out.println("Student ID    :"+StInfo4.ID+"\nStudent Name  :"+StInfo4.Name+"\nSt Department :"+StInfo4.Department+"\nStudent Group :"+StInfo4.Group);
Lec4.MathAb(0);
Lec4.AlgAb(10);
Lec4.NetAb(1);
Lec4.ProgAb(0);
Lec4.WebAb(5);
Lec4.JavAb(2);
Lec4.ItAb(0);

System.out.println("***********************************************************************************");

Lectures Lec5=new Lectures();
Students StInfo5=new Students("IT",2,"Akam Abubakr Ahmad","B",Lec5);
System.out.println("Student ID    :"+StInfo5.ID+"\nStudent Name  :"+StInfo5.Name+"\nSt Department :"+StInfo5.Department+"\nStudent Group :"+StInfo5.Group);
Lec5.MathAb(0);
Lec5.AlgAb(2);
Lec5.NetAb(15);
Lec5.ProgAb(15);
Lec5.WebAb(0);
Lec5.JavAb(2);
Lec5.ItAb(0);

System.out.println("***********************************************************************************");
Lectures Lec6=new Lectures();
Students StInfo6=new Students("IT",2,"Arkan Hasan Hama Amin","B",Lec6);
System.out.println("Student ID    :"+StInfo6.ID+"\nStudent Name  :"+StInfo6.Name+"\nSt Department :"+StInfo6.Department+"\nStudent Group :"+StInfo6.Group);
Lec6.MathAb(0);
Lec6.AlgAb(0);
Lec6.NetAb(8);
Lec6.ProgAb(5);
Lec6.WebAb(0);
Lec6.JavAb(12);
Lec6.ItAb(2);
}
}
