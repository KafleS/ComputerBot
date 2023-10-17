/**
 * Name = Suman Kafle
 * CS 261 Project 1 ( Computer Bot)
 * At first the str array is made to save the data. human array is made to save the human input, similarly computer
 * arrays is made to save the answers which is to be given to the user. Then do while loop is created to continue the converstion
 * until the user give command to exit. If the user give input math, the computer will go into the math mode and take integers to
 * do the simple calculations like addition, subtraction, multiplication and division. Only these four calculation can be operate
 * if other than this operator is given be the user it cannot operate. If the user give command to exit while they are
 * in math mode, they will get back to the normal conversation but the conversation will not end. There is also
 *  for loop to check if the input matches with the human input or not. If match the bot will reply to the corresponding
 *  answer, if does not match the computer will display try again.The converstion will npt end until and unless the
 *  user give command to exit.
 */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // str array is made that contain all the information
        String[] str = {"Hello", "Hello how are you?",
                "Hey!", "What's sup?",
                "Howdy.", "Howdy partner.",
                "How are you?", "I am well how are you?",
                "How are you feeling?", "I am a computer I do not have feelings...",
                "I am doing well it is nice of you to ask.", "You're welcome.",
                "What time is it?", "It's miller time!",
                "No really what time is it?", "Why do you not like my jokes?",
                "Tell me a joke.", "When life gives you melons you might be dyslexic.",
                "What kind of car do you drive?", "KITT.",
                "What is your favorite type of pizza?", "Sausage.",
                "What is your favorite food?", "Chips.",
                "What is your favorite type of flower?", "Tulip.",
                "What is your favorite type of tree?", "Binary.",
                "Who is your favorite singer?", "A Dell!",
                "What is your favorite type of music?", "Disc-o!",
                "Why are you so good at PowerPoint?", "Because I Excel at it!",
                "What is the best way to learn about computers?", "Bit by bit!",
                "How many programmers does it take to change a light bulb?", "That's a hardware problem call IT!",
                "What is a hackers favorite sport?", "Phishing!"};

        // human array is made to store the human data
        String[] human = new String[str.length / 2];
        int a = 0;
        for (int i = 0; i < str.length; i += 2) {
            human[a] = str[i];
            a++;
        }

        // computer array is made to store the computer output
        String[] computer = new String[str.length / 2];
        int b = 0;
        for (int i = 1; i < str.length; i += 2) {
            computer[b] = str[i];
            b++;
        }

        // scanner is created to save the input from the user
        Scanner sc = new Scanner(System.in);
        String humanInput = sc.nextLine();
        boolean found = false;

        // do while loop is created to go over the input from the user
        do {
            // if statement is made if the user input math and the computer will be able to do the math calculations
            if (humanInput.equals("MATH")) {
                String humanMath = sc.next();
                while (true) {
                    // to go back to the normal conversation from the math mode
                    if(humanMath.equals("EXIT")){
                        sc.nextLine();
                        break;
                    }
                    else {
                        // to add the integers if user give command to add
                        if (humanMath.equals("ADD")) {
                            int add1 = sc.nextInt();
                            int add2 = sc.nextInt();
                            System.out.println(add1 + add2);
                        }
                        // to subtract the integer if the user give command to subtract
                        else if (humanMath.equals("SUB")) {
                            int sub1 = sc.nextInt();
                            int sub2 = sc.nextInt();
                            System.out.println(sub1 - sub2);
                        }
                        //to multiply the integer if the user give command to multiply
                        else if (humanMath.equals("MUL")) {
                            int mul1 = sc.nextInt();
                            int mul2 = sc.nextInt();
                            System.out.println(mul1 * mul2);
                        }
                        // to divide the integer if the user give command to divide
                        else if (humanMath.equals("DIV")) {
                            int div1 = sc.nextInt();
                            int div2= sc.nextInt();
                            System.out.println(div1 / div2);
                        }
                        // if user give other command the computer will not recognize it
                        else {
                            System.out.println(" I do not recognize that, please try again.");
                        }
                        // to take the new input from the user
                        humanMath = sc.next();
                    }
                }
            }
            else{
                found = false;
                // to check if the input from the user is present in the human input and to reply the corresponding answer
                for (int k = 0; k < human.length; k++) {
                    if (humanInput.equals(human[k])){
                        System.out.println(computer[k]);
                        found = true;
                    }
                }
                // if the input form the user  does not match with human input
                if (!found) System.out.println("I do not recognize that, please try again.");
            }
            humanInput = sc.nextLine();
        }
        // if the user give the input to exit the conversation will end
        while (!humanInput.equals("EXIT"));
    }
}
