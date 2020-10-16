package avenger;

public class Questions_1_main_Answe {
    
    public static void main(String args[]){
        
        avenger[] a = new avenger[5];
        
        for(int i=0; i<5; i++){
            
            a[i]=new avenger();
            a[i].getDetails();
            
        }
        
        for(int i=0;i<5;i++){
            
            a[i].displayDetails();
            
        }
        
    }
    
}
