import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class EditPlayers {

    public EditPlayers() {
    }

    public void askForEditing() throws IOException {
        ReadFile read = new ReadFile();
        String[] arr = new String[11];
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to edit a player. Enter 0 to start the tournament. ");
            int editInput = scan.nextInt();
            if (editInput == 1) {

                while (true) {
                    System.out.println("Which team you want to edit?");
                    System.out.println("1. Sri Lanka\n2. India\n3. Pakistan\n4. Australia\n5. England\n6. South Africa\n7. New Zealand\n8. West Indies");
                    System.out.println("Enter the team number to edit: ");
                    int teamNo = scan.nextInt();
                    if (teamNo == 1) {
                        read.sriLankanPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.SriLankanPlayers();
                    } else if (teamNo == 2) {
                        read.indianPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.IndianPlayers();
                    } else if (teamNo == 3) {
                        read.pakistanPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.PakistanPlayers();
                    } else if (teamNo == 4) {
                        read.australianPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.AustralianPlayers();
                    } else if (teamNo == 5) {
                        read.englandPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.EnglandPlayers();
                    } else if (teamNo == 6) {
                        read.southAfricanPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.SouthAfricanPlayers();
                    } else if (teamNo == 7) {
                        read.newZealandPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.NewZealandPlayers();
                    } else if (teamNo == 8) {
                        read.westIndianPlayers();
                        FileToArray ob = new FileToArray();
                        arr = ob.WestIndianPlayers();
                    } else {
                        System.out.println("Enter a valid team number");
                        continue;
                    }

                    System.out.println("Here is your current team!\nEnter the index of the player you want to edit. ");
                    int playerIndex = scan.nextInt();
                    System.out.println("Enter the new player name ");

                    if (playerIndex == 0) {
                        arr[0] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 1) {
                        arr[1] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 2) {
                        arr[2] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 3) {
                        arr[3] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 4) {
                        arr[4] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 5) {
                        arr[5] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 6) {
                        arr[6] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 7) {
                        arr[7] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 8) {
                        arr[8] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 9) {
                        arr[9] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    } else if (playerIndex == 10) {
                        arr[10] = scan.next();
                        for (String j : arr) {
                            System.out.println(j);
                        }
                    }
                    System.out.println("\nEdit player is successful.\n");
                    break;
                }
            } else if (editInput == 0) {
                System.out.println("\nLet's the tournament begin..\n");
                break;
            } else {
                System.out.println("Enter a valid input");
                continue;
            }
        }
    }
}
