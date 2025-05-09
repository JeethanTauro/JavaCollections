package HashMaps_tutorial;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps_04 {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, String> data_base = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
                    System.out.println("Sign in(1) or Login(2) or exit(3): ");
                    int chances = 3;
                    int choice = sc.nextInt();
                    sc.nextLine(); // ✅ Clear the leftover newline just once here

                    if (choice == 1) {
                        while (true) {
                            System.out.println("Enter the username: ");
                            String username = sc.nextLine(); // now this works correctly

                            System.out.println("Enter the password: ");
                            String password = sc.nextLine();

                            if (data_base.containsKey(username)) {
                                System.out.println("Username already exists.");
                                continue;
                            }

                            data_base.put(username, password);
                            break;
                        }
                        System.out.println("Registered successfully!");
                    }
                    else if (choice == 2) {
                        while (chances > 0) {
                            System.out.println("Enter the username: ");
                            String username = sc.nextLine();

                            System.out.println("Enter the password: ");
                            String password = sc.nextLine();

                            if (data_base.containsKey(username) && data_base.get(username).equals(password)) {
                                System.out.println("Login successful!");
                                break;
                            } else {
                                chances--;
                                System.out.println("Login failed.");
                                if (chances == 0) {
                                    System.out.println("You have been banned for 30 seconds");
                                    Thread.sleep(30000);
                                } else {
                                    System.out.println("You have " + chances + " chances left.");
                                }
                            }
                        }
                    } else if (choice == 3) {
                        break;
                    }
                    else {
                        System.out.println("enter proper choice");
                    }


                }
            }
}


