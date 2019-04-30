public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);
        Transactions.withdraw(account, 100, new TransactionListener() {

            @Override
            public void onLoading() {
                System.out.println("Please wait while loading data");
            }

            @Override
            public void onError(String error) {
                System.out.printf(error);
            }

            @Override
            public void onComplete(Bank account) {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }
        });
    }
}
