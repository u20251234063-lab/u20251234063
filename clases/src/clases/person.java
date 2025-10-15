
package clases;

public class person {
    private int id= 1234;
    private String name="cami";
    private int age=17;
    private String email="cami62@gmail.com";

    public person() {
    }

    public person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
  
    public void SayHello(){
        System.out.println("mi nombre es "+name+" mi edad es "+age+" mi id es: "+id+ " mi email es: "+email);
        
    }
    
}
