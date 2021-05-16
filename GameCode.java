package com.aarav;
import java.util.Scanner;
public class GameCode {
    int sleep_time = 2000;
    int max_number = 20;
    boolean won = false;
    int rand = (int) (Math.random() * (max_number + 1));
    int max_tries = 10;
    Scanner scanner;
    public void OnStart() throws Exception {
        scanner = new Scanner(System.in);
        System.out.println("Welcome to my Number Guessing Game by Aarav Sharma!");
        Wait();
        System.out.println("Do you wish to set preferences? If yes, 1, is no, 2");
        System.out.print("Answer: ");
        int p = scanner.nextInt();
        if (p == 1)
        {SetPreference();}
        StartGame();
    }
    private void Wait() throws Exception {
        Thread.sleep(sleep_time);
    }
    private void StartGame() throws Exception {
        System.out.println("Guess a number between 0 and "+max_number+".");
        Wait();
        System.out.println("Let's Play!");
        Wait();
        System.out.println("-------------------");
        for (int tries=0; tries<max_tries; tries++){
            System.out.print("Your Guess: ");
            int g = scanner.nextInt();
            if (g == rand){
                System.out.println("You Guessed it! The number was " + rand + "!");
                won = true;
                break;
            } else{
                if (g < rand){
                    System.out.println("No, that's not it. The number is bigger.");
                } else{
                    System.out.println("No, that's not it. The number is less.");
                }
                System.out.println("-------------------");
                Wait();
            }
        }
        if (!won){
            System.out.println("Sorry, you lost. The number was " + rand);
        }
    }
    private void SetPreference() {
        System.out.println("1 to set the waiting time. 2 to set the max guess number. 3 to set the number or tries. 4 to set all.");
        System.out.print("Answer: ");
        int q = scanner.nextInt();
        if (q == 1){
            System.out.println("The default wait time is 2 second");
            System.out.print("New wait time (In Seconds): ");
            sleep_time = scanner.nextInt()*1000;
        }
        if (q == 2){
            System.out.println("The default max number is 20");
            System.out.print("Max Number: ");
            max_number = scanner.nextInt();
            rand = (int) (Math.random() * (max_number + 1));
        }
        if (q == 3){
            System.out.println("The default number of tries is 10");
            System.out.print("Number of tries: ");
            max_tries = scanner.nextInt();
        }
        if (q == 4){
            System.out.println("The default wait time is 2 second");
            System.out.println("The default max number is 20");
            System.out.println("The default number of tries is 10");
            System.out.print("New wait time (In Seconds): ");
            sleep_time = scanner.nextInt()*1000;
            System.out.print("Max Number: ");
            max_number = scanner.nextInt();
            int rand = (int) (Math.random() * (max_number + 1));
            System.out.print("Number of tries: ");
            max_tries = scanner.nextInt();
        }
        System.out.println("-------------------");
    }
}