import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Model.Tamagotchi;

public class Main {
    static Tamagotchi tamagotchi = new Tamagotchi();

    public static void main(String[] args) {

        initializeYourPet();
        Scanner scan = new Scanner(System.in);
        while (true){
            tamagotchi.passTime();
            tamagotchi.passTime();
            System.out.println("---------------------------------------------------------");
            System.out.println("Do you want to interact with your tamagotchi?");
            System.out.println("a:feed" +"\nb:walk" +"\nc:clean"+"\nd:pet");
            String interaction = scan.nextLine();
            switch (interaction){
                case "a": tamagotchi.feed();break;
                case "b": tamagotchi.walk();break;
                case "c": tamagotchi.clean();break;
                case "d": tamagotchi.pet(); break;
                default: break;
            }

            tamagotchi.updateMood();
            System.out.println(tamagotchi);
        }


    }


    public static void initializeYourPet(){
        System.out.println("\n"+
        "\n ████████╗░█████╗░███╗░░░███╗░█████╗░░██████╗░░█████╗░████████╗░█████╗░██╗░░██╗██╗ " +
        "\n ╚══██╔══╝██╔══██╗████╗░████║██╔══██╗██╔════╝░██╔══██╗╚══██╔══╝██╔══██╗██║░░██║██║ " +
        "\n ░░░██║░░░███████║██╔████╔██║███████║██║░░██╗░██║░░██║░░░██║░░░██║░░╚═╝███████║██║ " +
        "\n ░░░██║░░░██╔══██║██║╚██╔╝██║██╔══██║██║░░╚██╗██║░░██║░░░██║░░░██║░░██╗██╔══██║██║ " +
        "\n ░░░██║░░░██║░░██║██║░╚═╝░██║██║░░██║╚██████╔╝╚█████╔╝░░░██║░░░╚█████╔╝██║░░██║██║ " +
        "\n ░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚═╝░░╚═╝░╚═════╝░░╚════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚═╝ "
        );
        System.out.println("\nPlease choose your tamagotchi image");
        System.out.println("a:[*·v·*]");
        System.out.println("b:(`v`)");
        Scanner scan = new Scanner(System.in);
        String image = scan.nextLine();
        if (image.equals("a")){
            tamagotchi.setImageChoice(0);
        } else {
            tamagotchi.setImageChoice(1);
        }
        // scan.close();
        System.out.println(tamagotchi);
    }
}
