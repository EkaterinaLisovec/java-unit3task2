public class Mobile {
    public static void main(String[] args) {
        float current_account = 1000.01F; //INPUT
        float transfer = 2000.01F; //INPUT
        int bonus = 0;
        if (transfer > 1000) {
            bonus = (int) transfer / 100;
        }
        float total_account = current_account + transfer + bonus;
        System.out.println("Bonus = " + bonus);
        System.out.println("Total account = " + total_account);
    }
}
