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
public class PersentAbs implements PersentInterfaceAbs {
    int MaxAbs;
    int MinAbs;
    int NoAbs;
    public void MaxAbs(int a){
    MaxAbs=a;    
    }
    public void MinAbs(int a){
    MinAbs=a;    
    }
    public void NoAbs(int a){
    NoAbs=a;    
    }
    public void print(){
        System.out.println("Maximum Absent Records For This Semester is %"+MaxAbs);
        System.out.println("Minimum Absent Records For This Semester is %"+MinAbs);
        System.out.println("No   Absents   For   This  Semester    is   %"+NoAbs);
    }
    
}
