package Core_Java_Projects;
import java.util.Scanner;
public class Parking_System {
    int vehicle;
    int price;
    int bic,bik,scoo,carr,vann,truc;
    void heading(){
        System.out.println("Welcome to Rubaab Parking");
        System.out.println("-----------------------");
    }
    void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the button which one you park here");
        System.out.println("-------------------");
        System.out.println("1 Bicycle                       2 Bike");
        System.out.println("3 Scooty                        4 Car");
        System.out.println("5 Van                           6 Truck");
        System.out.println("--------------------");
        System.out.println("7 Show the records");
        System.out.println("8 Delete the records");
        System.out.println("---------------------");
        System.out.println("Enter the vehicle you park:");
        vehicle = input.nextInt();

        switch(vehicle){
            case 1:
                bicycle();
                break;
            case 2:
                bike();
                break;
            case 3:
                scooty();
                break;
            case 4:
                car();
                break;
            case 5:
                van();
                break;
            case 6:
                truck();
                break;
            case 7:
                show_records();
                break;
            case 8:
                delete_records();
                break;
            default:
                System.out.println("Please choose Available vehicle");
                break;
        }
    }
    void bicycle(){
        bic = 25;
        System.out.println("Your process is successfully");
        price = bic + price;
        System.out.println("Your total charge is : "+ price);
        menu_exit();
    }
    void bike(){
        bik = 40;
        System.out.println("Your process is successfully");
        price = bik + price;
        System.out.println("Your total charge is : "+ price);
        menu_exit();
    }
    void scooty(){
        scoo = 35;
        System.out.println("Your process is successfully");
        price = scoo + price;
        System.out.println("Your total charge is : "+ price);
        menu_exit();
    }
    void car(){
        carr = 60;
        System.out.println("Your process is successfully");
        price = carr + price;
        System.out.println("Your total charge is : "+ price);
        menu_exit();
    }
    void van(){
        vann = 105;
        System.out.println("Your process is successfully");
        price = vann + price;
        System.out.println("Your total charge is : "+ price);
        menu_exit();
    }
    void truck(){
        truc = 150;
        System.out.println("Your process is successfully");
        price = truc + price;
        System.out.println("Your total charge is : "+ price);
        menu_exit();
    }
    void menu_exit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Continues Using [Y/N]");
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y'){
            menu();
        }else if(ch == 'N' || ch == 'n'){
            exits();
        }
    }
    void exits(){
        System.out.println("-------------* * *-------------");
        System.out.println("        Thank you       ");
    }
    void show_records(){
        System.out.println("Your records");
        System.out.println("---------------");
        System.out.println("The Bicycle price : " + bic+ "/-");
        System.out.println("The Bike price : " + bik+ "/-");
        System.out.println("The Car price : " + scoo+ "/-");
        System.out.println("The Van price : " + vann+ "/-");
        System.out.println("The Truck price : " + truc+ "/-");
        System.out.println("------------------");
        int final_price = (bic + bik + scoo + vann + truc);
        int gst = (final_price * 18)/100;
        int MRF = final_price + gst;
        System.out.println("(Total price with 18% gst charges included)");
        System.out.println("Total MRF : " + MRF);
        System.out.println("-------------------");
        menu_exit();
    }
    void delete_records(){
        bic = 0;
        bik = 0;
        scoo = 0;
        carr = 0;
        vann = 0;
        truc = 0;
        System.out.println("Your records delete successfully");
        menu_exit();
    }

    public static void main(String[] args) {
        Parking_System ps = new Parking_System();
        ps.heading();
        ps.menu();
    }

}
