/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class AccountDanger implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {

        AccountDanger ad = new AccountDanger();
        Thread sanjeevThread = new Thread(ad);
        sanjeevThread.setName("SanjeevThread:");
        Thread thread = new Thread(ad);
        thread.setName("NaishaThread");

        sanjeevThread.start();
        thread.start();


    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            makeWithdrawl(10);

            if (account.getBalance() < 0) {
                System.out.println("Account is overdrwan");
            }

        }
    }

    private synchronized void makeWithdrawl(int amount) {

        if (account.getBalance() >= amount) {

            System.out.println("Account:" + Thread.currentThread().getName() + " withdraw is going to start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.withdraw(amount);
            System.out.println("Withdrwan complteted by :" + Thread.currentThread().getName());

        } else {
            System.out.println("No enough money for :" + Thread.currentThread().getName() + " to withdraw  and balance is: " + account.getBalance());
        }

    }

}
