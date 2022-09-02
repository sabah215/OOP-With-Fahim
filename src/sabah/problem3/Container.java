package sabah.problem3;

public class Container {
        private double capacity = 0;
        private double quantity = 0;

        public Container(){

        }

        public void full(){
            quantity = capacity;
        }
        public void empty(){
            quantity = 0;
        }
        public String transfer(Container c){
            this.quantity += c.quantity;
            return "Liquid fully transfered.";
        }

    public double getQuantity() {
        return quantity;
    }

    public double getCapacity() {
        return capacity;
    }
    public String leftover(){
            double left =  capacity - quantity;
            if(left == 0)
                return "Container is full.";
            return String.valueOf(left);
    }
    public String displayQuantity(){
            return "Quantity: " +quantity+" liters";
    }
}
