package oo_abusers;

public class ACwDI {
    public interface Order {
        void processPayment(double amount);
    }

    public static class OnlineOrder implements Order {
        private String customerName;
        private String orderDetails;

        public void processPayment(double amount) {
            System.out.println("Processing online payment of amount: " + amount);
        }
    }

    public static class OfflineOrder implements Order {
        private String customerName;
        private String orderDetails;

        public void processPayment(double amount) {
            System.out.println("Processing offline payment of amount: " + amount);
        }
    }
}
