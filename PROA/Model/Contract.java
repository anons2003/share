package Model;

public class Contract {
   
    @Override
    public String toString() {
        return "\n"+"\n"+"Contract [idContract=" + idContract + ", customer=" + customer + ", service=" + service + ", dayrent="
                + dayrent + "]";
    }
    public Contract(String idContract, Customer customer, Service service, String dayrent) {
        this.idContract = idContract;
        this.customer = customer;
        this.service = service;
        this.dayrent = dayrent;
    }
    private String idContract;
    public String getIdContract() {
        return idContract;
    }
    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }
    private Customer customer;
    private Service service;
    private String dayrent;
    
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public String getDayrent() {
        return dayrent;
    }
    public void setDayrent(String dayrent) {
        this.dayrent = dayrent;
    }
    
}
