
package oop1;


abstract class TicketBooking{
    public abstract void bookTicket();
    public abstract void getDetails(); 
}
class BusinessClassBooking extends TicketBooking{
     protected String location;
    protected String destination;
    @Override
    public void bookTicket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

class EconomicClassBooking extends TicketBooking{
   
    
    @Override
    public void bookTicket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         
    }
   
   
}
public class Oop1 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
