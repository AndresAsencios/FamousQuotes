package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        ArrayList<String> famousQuotes = new ArrayList<String>();

        // PROGRAMMING & TECHNOLOGY
        famousQuotes.add("Talk is cheap. Show me the code. - Linus Torvalds");
        famousQuotes.add("First, solve the problem. Then, write the code. - John Johnson");
        famousQuotes.add("Simplicity is the soul of efficiency. - Austin Freeman");
        famousQuotes.add("Make it work, make it right, make it fast. - Kent Beck");
        famousQuotes.add("Programs must be written for people to read. - Harold Abelson");

// MOTIVATION & SUCCESS
        famousQuotes.add("The only way to do great work is to love what you do. - Steve Jobs");
        famousQuotes.add("It always seems impossible until it's done. - Nelson Mandela");
        famousQuotes.add("The journey of a thousand miles begins with a single step. - Lao Tzu");
        famousQuotes.add("Well done is better than well said. - Benjamin Franklin");
        famousQuotes.add("The secret of getting ahead is getting started. - Mark Twain");

// PHILOSOPHY & LIFE
        famousQuotes.add("The unexamined life is not worth living. - Socrates");
        famousQuotes.add("I think, therefore I am. - Rene Descartes");
        famousQuotes.add("To live is to suffer, to survive is to find some meaning in the suffering. - Friedrich Nietzsche");
        famousQuotes.add("Life can only be understood backwards; but it must be lived forwards. - Soren Kierkegaard");
        famousQuotes.add("We suffer more often in imagination than in reality. - Seneca");

// FILM & POP CULTURE
        famousQuotes.add("May the Force be with you. - Star Wars");
        famousQuotes.add("With great power comes great responsibility. - Spider-Man");
        famousQuotes.add("Why so serious? - The Dark Knight");
        famousQuotes.add("I'll be back. - The Terminator");
        famousQuotes.add("Do, or do not. There is no try. - Yoda");

        Scanner read = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;



            System.out.println("==========================");
            System.out.println("    FAMOUS QUOTES MENU");
            System.out.println("==========================");
            System.out.println("1. Select a Quote");
            System.out.println("2. Random Quote");
            System.out.println("3. Display All Quotes");
            System.out.println("4. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");

        while (running) {
            String menuChoice = read.nextLine();


        // Display menu
            switch (menuChoice) {

                // quote selector
                case "1" -> {
                    System.out.println("Select a Quote!");

                    try {
                        System.out.print("Select a quote (1-20): ");
                        int userChoice = Integer.parseInt(read.nextLine());

                        System.out.println("Your Selected Quote: "
                                + famousQuotes.get(userChoice - 1));

                    } catch (IndexOutOfBoundsException | NumberFormatException e) {
                        System.out.println("Invalid input! Please select 1-20.");
                    }
                }

// Random quote generator random.nextInt(famousQuotes.size());
                case "2" -> {
                    int randomIndex = random.nextInt(famousQuotes.size());

                    System.out.println("Random Quote: "
                            + famousQuotes.get(randomIndex));
                }

// Get all famous quotes
                case "3" -> {
                    System.out.println("All Famous Quotes:");


                    int quoteNumber = 1;

                    for (String quote : famousQuotes) {
                        System.out.println(quoteNumber + ". " + quote);
                        quoteNumber++;
                    }
                }

                case "4" -> {
                    System.out.println("Thanks for using Famous Quotes!");
                    running = false;
                }
                default ->
                    System.out.println("Invalid option! Please select 1-4.");

            }
        }
    }
}
