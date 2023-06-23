package View;

import java.io.IOException;
import java.util.Scanner;

import Controller.ContractContro;
import Controller.CustomerContro;
import Controller.ServiceContro;
import Model.Customer;
import Model.Service;

public class ManagerView {
    
    Scanner scanner = new Scanner(System.in);
    ContractContro contractContro = new ContractContro();
    CustomerContro customerContro = new CustomerContro();
    ServiceContro serviceContro = new ServiceContro();
  
    public void Managerdisplay() throws IOException{
        //         contractContro.getAllContract();
        // customerContro.getAllCustomer();
        // serviceContro.getAllService();
         System.out.println("===Menu Manager===\n"
                + "1.Add New Service\n"
                + "2.View All Contract\n"
                + "3.Add New Customer\n"
                + "4.View All Customer\n"
                + "5.Exit\n");
        
        int key = Integer.parseInt(scanner.nextLine());
        switch (key) {
            case 1:
                AddNewService();
                break;
            case 2:
                ViewAllContract();
                break;
            case 3:
                AddNewCustomer();
                break;
            case 4 :
                ViewAllCustomer();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    private void ViewAllCustomer() throws IOException {
        System.out.println(customerContro.getAllCustomer());

    }
    public void AddNewCustomer() throws IOException {
        System.out.println("Input Id : ");
        String idCustomer = scanner.nextLine();
        System.out.println("Input name : ");
        String nameCustomer = scanner.nextLine();
         System.out.println("Input email : ");
        String emailCustomer = scanner.nextLine();
          System.out.println("Input phone : ");
        String phoneCustomer = scanner.nextLine();
        System.out.println("Input username : ");
        String usernameCustomer = scanner.nextLine();
        System.out.println("Input password : ");
        String passwordCustomer = scanner.nextLine();
        Customer customer = new Customer(idCustomer, nameCustomer, emailCustomer, phoneCustomer, usernameCustomer, passwordCustomer);
        customerContro.addCustomer(customer);
    }
    private void ViewAllContract() throws IOException {
        System.out.println(contractContro.getAllContract());
    }
    private void AddNewService() throws IOException {
         System.out.println("Input Id : ");
            String idService = scanner.nextLine();
             System.out.println("Input name : ");
            String nameService = scanner.nextLine();
             System.out.println("Input price : ");
            String priceService = scanner.nextLine();
             System.out.println("Input status : ");
            String statusService = scanner.nextLine();
            Service service = new Service(idService, nameService, priceService, statusService) ;
            serviceContro.addService(service);
    }
}
