public class Mobile {
    public static void main(String[] args) {
        float currentAccount = 1000.01F; //INPUT
        float transfer = 1000.01F; //INPUT
        int bonus = 0;
        if (transfer > 1000) {
            bonus = (int) transfer / 100;
        }
        float totalAccount = currentAccount + transfer + bonus;
        System.out.println("Bonus = " + bonus);
        System.out.println("Total account = " + totalAccount);
    }
}
