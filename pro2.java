import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        String[] product=new String[100];
        int[] quantity=new int[100];
        int choice,count=0;
        
        do { 
            System.out.println("Operations: ");
        System.out.println("1. Add products and its quantity");
        System.out.println("2. Display low stock products");
        System.out.println("3. Search the product");
        System.out.println("4. Exit");
        System.out.println("Enter the operation : ");
        choice=obj.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter the product name: ");
            product[count]=obj.next();

            System.out.println("Enter the quantity: ");
            quantity[count]=obj.nextInt();

            count++;

            System.out.println("Product added successfully");                
                break;

            case 2:
            for (int i=0;i<count;i++) {
                if(quantity[i]<5){
                System.out.println("Product : "+product[i]+" Quantity: "+quantity[i]);
            }
            else{
                System.out.println("No low stock");
            }
            }

        break;

        case 3:
        System.out.print("Enter product name to search: ");
        String search=obj.next();
        boolean found = false;
        for (int i=0;i< count;i++) {
        if (product[i].equals(search)) {
            System.out.println("Product: " + product[i] + ", Quantity: " + quantity[i]);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Product not found.");
    }
    break;

    case 4:
    System.out.println("Exiting....");
           
            default:
                System.out.println("Invalid choice.");
        }
            
        } while (choice!=4);
    }
}
