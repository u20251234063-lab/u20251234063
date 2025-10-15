
package clases;

public class student {
    int score;

    public student(int score) {
        this.score = score;
    }
    public void reviewScore(){
        if(score>60){
            System.out.println("aprobo");
        }else{
            System.out.println("no aprobo");
        }
    }
    
} 