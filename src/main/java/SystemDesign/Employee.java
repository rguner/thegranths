package SystemDesign;

public class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      this.name = name;
      this.address = address;
      this.number = number;
   }

   public String toString() {
      return name + " " + address + " " + number;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String newAddress) {
      address = newAddress;
   }

   public int getNumber() {
      return number;
   }
}