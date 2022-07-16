package Model;
import java.util.Arrays;

public class Tamagotchi {
    private int hungriness;
    private int happiness;
    private int cleanliness;
    private int tiredness;
    private String[] mood;
    private String[][] image;
    private int imageChoice;
    private int matchUpMoodAndImage;


    public Tamagotchi() {
        this.hungriness = 0;
        this.happiness = 5;
        this.cleanliness = 10;
        this.tiredness = 0;
        this.image = new String[][] 
        {{"[*·v·*]","[*·-·*]","[*x_x*]"},
        {"(`v`)","(`-`)","(X_X)"}} ;
        setupMood();
        updateMood();
    }

    private void setupMood(){
        mood = new String[4];
    }

    public void updateMood(){
        if (tiredness == 10){
            mood[0] = "asleep";
        } else if (tiredness >=8){
            mood[0] = "tired";
        } else {
            mood[0] = "energetic";
        }
    
        if (hungriness >= 7){
            mood[1] = "hungry";
        } else {
            mood[1] = "well fed";
        }
        
        if (cleanliness <= 4){
            mood[2] = "dirty";
        } else {
            mood[2] = "clean";
        }

        if (happiness >= 6){
            mood[3] = "happy";
            matchUpMoodAndImage = 0;
        } else if (happiness >=4){
            mood[3] = "okay";
            matchUpMoodAndImage = 1;
        } else {
            mood[3] = "sad";
            matchUpMoodAndImage = 2;
        }
    }

    public int getHungriness() {
        return this.hungriness;
    }

    public void setHungriness(int hungriness) {
        this.hungriness = hungriness;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getCleanliness() {
        return this.cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getTiredness() {
        return this.tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }


    public Tamagotchi hungriness(int hungriness) {
        setHungriness(hungriness);
        return this;
    }

    public Tamagotchi happiness(int happiness) {
        setHappiness(happiness);
        return this;
    }

    public void valueCheck(){
        if (happiness <=0) {
            happiness = 0;
        } else if (happiness >=10){
            happiness = 10;
        }

        if (tiredness <=0) {
            tiredness = 0;
        } else if (tiredness >=10){
            tiredness = 10;
        }

        if (hungriness <=0) {
            hungriness = 0;
        } else if (hungriness >=10){
            hungriness = 10;
        }

        if (cleanliness <=0) {
            cleanliness = 0;
        } else if (cleanliness >=10){
            cleanliness = 10;
        }
    }

    public void feed(){
        hungriness -= 5;
        this.valueCheck();
    }

    public void walk(){
        happiness +=3;
        tiredness -=2;
        this.valueCheck();
    }

    public void clean(){
        this.cleanliness = 10;
    }

    public void pet(){
        happiness +=5;
    }

    public void passTime(){
        hungriness++;
        cleanliness--;
        tiredness--;
        if (hungriness>=7){
            happiness--;
        }
        if (cleanliness <=3){
            happiness--;
        }
    }

    public void setImageChoice(int imageChoice){
        this.imageChoice = imageChoice;
    }


    @Override
    public String toString() {
        // return "{" +
        //     " hungriness='" + getHungriness() + "'" +
        //     ", happiness='" + getHappiness() + "'" +
        //     ", cleanliness='" + getCleanliness() + "'" +
        //     ", tiredness='" + getTiredness() + "'" +
        //     Arrays.toString(mood) +
        //     "}";
        return image[imageChoice][matchUpMoodAndImage] + "\tYour tamagotchi is " + mood[0] + " ," + mood[1] + " ," + mood[2] +" ," + mood[3];

        



    }
    
}
