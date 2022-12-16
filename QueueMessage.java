
package queuemessage;
import java.util.InputMismatchException;
import java.util.Scanner;
public class QueueMessage {
    static Scanner sc = new Scanner(System.in);
    static Queue MQ = new Queue(10);
    public static int Option(){
    boolean check = true;
    int txt = 0;
    do{
        System.out.print("Select a function: ");
        try{
            txt = sc.nextInt();
            check = false;
        }catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("Input the correct number of function, please try again!");
            sc.next();
        }
    }while(check);
    return txt;
    }
    public static void main(String[] args) throws Exception {
        int choice = 0;
            do{
                menu();
                choice = Option();
                sc.nextLine();
                switch(choice){
                    case 1:
                        System.out.print("Enter the name of the company sending the message: ");
                            String company = sc.nextLine();
                        System.out.print("Enter the content of the message: ");
                            String message = sc.nextLine();
                                if(message.toCharArray().length > 250){
                                    System.out.println("The system is limited to no more than 250 characters");
                                    break;
                                }
                                Message mess = new Message(company, message);
                                MQ.enqueue(mess);
                    break;
                    case 2:
                        MQ.display();
                        break;
                    case 3:
                        MQ.dequeue();
                        break;
                    case 4:
                        System.out.println("Thank for using this system!");
                        return;
                    default:
                        System.out.println("Input the correct number of function,please!");
                        break;
                }
            }while(choice != 4);
        }
    private static void menu() {
        System.out.println("---------------o0o---------------");
        System.out.println("    1. Input Message");
        System.out.println("    2. Display Message");
        System.out.println("    3. Dequeue Message");
        System.out.println("    4. Exit");
        System.out.println("---------------------------------");
    }
}

    
    

