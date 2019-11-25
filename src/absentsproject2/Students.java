/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentsproject2;

public class Students {
Lectures lecture;
int ID;
String Name;
String Department;
String Group;
int Abs;
Students(String dep,int id,String nam,String grp,Lectures lec){
this.Department=dep;
this.lecture=lec;
this.ID=id; 
this.Name=nam; 
this.Group=grp;
}

}
