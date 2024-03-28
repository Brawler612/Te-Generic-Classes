import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int genericClass;
            do {
                System.out.print("(1) Arithmetic\n(2) MyMap\n(0) Terminate App\n\nEnter Generic Class: ");
                genericClass = scanner.nextInt();

                if (!(genericClass >= 0 && genericClass <= 2)) {
                    System.out.println("Invalid Option!\n");
                }
            } while (!(genericClass >= 0 && genericClass <= 2));

            if (genericClass == 1) {
                // Arithmetic Class
                System.out.print("Enter first number: ");
                Number n1 = getInputNumber(scanner);

                System.out.print("Enter second number: ");
                Number n2 = getInputNumber(scanner);

                Arithmetic arithmetic = new Arithmetic(n1, n2);

                int choice;
                do {
                    System.out.print("(1) Add\n(2) Subtract\n(3) Multiply\n(4) Divide\n(5) Get Minimum\n(6) Get Maximum\n(0) Stop Arithmetic\n\nSelect your operation: ");
                    choice = scanner.nextInt();

                    if(choice == 0) {
                        System.out.println("Terminating Arithmetic...\n");
                    }

                    if (!(choice >= 0 && choice <= 6)) {
                        System.out.println("Invalid Option!\n");
                    } else if (choice != 0) {
                        System.out.println(arithmetic.performOperation(choice) + "\n");
                    }
                } while (choice != 0);

            } else if (genericClass == 2) {
                // MyMap Class
                MyMap<Integer, Integer> myMap = new MyMap<>();

                int choice;
                do {
                    System.out.print("(1) Put Key\n(2) Get Key\n(3) Remove Key\n(0) Stop MyMap\n\nWhat would you like to do: ");
                    choice = scanner.nextInt();

                    if(choice == 0) {
                        System.out.println("Terminating Map...\n");
                    }

                    if (!(choice >= 0 && choice <= 3)) {
                        System.out.println("Invalid Option!\n");
                    } else {
                        switch (choice) {
                            case 1:
                                System.out.print("Enter key: ");
                                Integer k = scanner.nextInt();

                                System.out.print("Enter a value: ");
                                Integer v = scanner.nextInt();

                                myMap.put(k, v);
                                System.out.println(v + " has been placed at key " + k + "\n");
                                break;
                            case 2:
                                System.out.print("Enter key: ");
                                k = scanner.nextInt();

                                Integer value = myMap.get(k);
                                if (value != null) {
                                    System.out.println("The value of key " + k + " is: " + value + "\n");
                                } else {
                                    System.out.println("Key " + k + " does not exist.\n");
                                }
                                break;
                            case 3:
                                System.out.print("Enter key: ");
                                k = scanner.nextInt();

                                Integer removedValue = myMap.remove(k);
                                if (removedValue != null) {
                                    System.out.println(removedValue + " has been removed from key " + k + "\n");
                                } else {
                                    System.out.println("Key " + k + " does not exist.\n");
                                }
                                break;
                        }
                    }
                } while (choice != 0);
            } else if (genericClass == 0) {
                int input;
                do {
                    System.out.print("\n(1) Yes\n(0) No\nAre you sure? ");
                    input = scanner.nextInt();

                    if(!(input >= 0 && input <= 1)) {
                        System.out.println("Invalid Option!\n");
                    }
                } while(!(input >= 0 && input <= 1));

                if(input == 1) {
                    System.out.println("Terminating App...");
                    break;
                } else if(input == 0) {
                    System.out.println();
                }
            }
        } while (true);
    }

    private static Number getInputNumber(Scanner scanner) {
        Number number = null;
        boolean validInput = false;
        while (!validInput) {
            try {
                number = scanner.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.nextLine();
            }
        }
        return number;
    }
}




