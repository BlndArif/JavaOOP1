package absentsproject;
class Lectures {
    String projectname; //*******The Method Which is Overriden in some subclasses********
    protected int s_id;
    protected String s_name;
    protected String l_name;
    protected int h_perweek;
    protected int total_h_per_semester;
    protected int h_absent;
   
    
   
    public int get_s_id(){
        return s_id;
    }
    public String get_s_name(){
        return s_name;
    }
    public String get_l_name(){
        return l_name;
    }
    public int get_h_perweek(){
        return h_perweek;
    }
    public int get_ab_persem() {
        return h_absent;
    }
    public int get_tot_h_persem(){
        return total_h_per_semester;
    }
    
    
    
    
    public void set_pro_name(){//***********The Overriden Method**************
    System.out.println("METHOD OVERRIDEN << * This * is * Absent * List * For * Second * Semester * Lectures * >> ");
    }
    public void set_s_id(String s_id){
        s_id=s_id;
    }
    
    public void set_s_name(String s_n){
        s_name=s_n;
    }
    public void set_l_name(String l_n){
        l_name=l_n;
    }
    public void set_h_perweek(int h_p_week){
        h_perweek=h_p_week;
    }
    public void set_ab_persem(int ab_ph){
        h_absent=ab_ph;
    }
    public void set_total_h_persem(int th_p_s){
        total_h_per_semester=th_p_s;
    }
    
    
}   






