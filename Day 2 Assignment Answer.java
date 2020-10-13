package employee;

public class employee {
    
    String name, city;
    int age;
    
    public void display() {
        
        System.out.println("The Name is : " +name);
        System.out.println("The Age is : " +age);
        System.out.println("The City is : " +city);
        
    }
    
    public static void main(String[] args) {
        
        employee emp1 = new employee();
        emp1.name = "Kevin";
        emp1.age = 21;
        emp1.city = "Vadodara";
        
        employee emp2 = new employee();
        emp2.name = "Rakesh";
        emp2.age = 22;
        emp2.city = "Surat";
        
        employee emp3 = new employee();
        emp2.name = "Brijesh";
        emp2.age = 20;
        emp2.city = "Bharuch";
        
        System.out.println("--- Employee Details ---");
        emp1.display();
        emp2.display();
        
    }
    
}
