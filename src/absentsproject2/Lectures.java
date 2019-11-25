/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentsproject2;

public class Lectures {
int Mathematics;
int Algorithm;
int JavaOOP;
int Networking;
int Programing;
int IT;
int Webdesign;

public void MathAb(int a) {
this.Mathematics=a;
if (a>0 && a<=4)
        {
            System.out.println("Absents of Mathematics  :(" +Mathematics+ ") Lectures");
       }
        else if(a>=5 && a<=9)
       {System.out.println("Absents of Mathematics  :("+Mathematics+") Lectures and must pay 150 dollars for attending");}
        else if(a>=10){
        System.out.println("Absents of Mathematics  :("+Mathematics+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("Absents of Mathematics  : Has no absenties !");  }
  }

public void AlgAb(int a) {
this.Algorithm=a;
if (a>0 && a<=4)
        {
            System.out.println("Absents of Algorithm    :(" +Algorithm+ ") Lectures");
       }
        else if(a>=5 && a<=9)
       {System.out.println("Absents of Algorithm    :("+Algorithm+") Lectures and must pay 150 dollars for attending");}
        else if(a>=10){
        System.out.println("Absents of Algorithm    :("+Algorithm+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("Absents of Algorithm    : Has no absenties !");  }
}

public void JavAb(int a) {
this.JavaOOP=a;
if (a>0 && a<=4)
        {
            System.out.println("Absents  of   JavaOOP    :(" +JavaOOP+ ") Lectures");
       }
        else if(a>=5 && a<=9)
       {System.out.println("Absents  of  JavaOOP    :("+JavaOOP+") Lectures and must pay 150 dollars for attending");}
        else if(a>=10){
        System.out.println("Absents  of  JavaOOP    :("+JavaOOP+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("Absents  of  JavaOOP    : Has no absenties !");  }}

public void NetAb(int a) {
this.Networking=a;
if (a>0 && a<=4)
        {
            System.out.println("Absents of Networking   :(" +Networking+ ") Lectures");
       }
        else if(a>=5 && a<=9)
       {System.out.println("Absents of Networking   :("+Networking+") Lectures and must pay 150 dollars for attending");}
        else if(a>=10){
        System.out.println("Absents of Networking   :("+Networking+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("Absents of Networking   : Has no absenties !");  }
}

public void ProgAb(int a) {
this.Programing=a;
if (a>0 && a<=4)
        {
            System.out.println("Absents of Programing   :(" +Programing+ ") Lectures");
       }
        else if(a>=5 && a<=9)
       {System.out.println("Absents of Programing   :("+Programing+") Lectures and must pay 150 dollars for attending");}
        else if(a>=10){
        System.out.println("Absents of Programing   :("+Programing+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("Absents of Programing   : Has no absenties !");  }

}
public void ItAb(int a) {
this.IT=a;
if (a>0 && a<=4)
        {
            System.out.println("Absents of I Technology :(" +IT+ ") Lectures");
       }
        else if(a>=5 && a<=9)
       {System.out.println("Absents of I Technology :("+IT+") Lectures and must pay 150 dollars for attending");}
        else if(a>=10){
        System.out.println("Absents of I Technology :("+IT+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("Absents of I Technology : Has no absenties !");  }}

public void WebAb(int a) {
    this.Webdesign=a;
    if (a>0 && a<=4)
        {
            System.out.println("Absents of  Webdesign   :(" +IT+ ") Lectures");
       }
        else if(a>=5 && a<=9)
       {System.out.println("Absents of  Webdesign   :("+IT+") Lectures and must pay 150 dollars for attending");}
        else if(a>=10){
        System.out.println("Absents of  Webdesign   :("+IT+") Lectures and cannot attend any more classes");}
        else{
            System.out.println("Absents of  Webdesign   : Has no absenties !");  }
  }}
