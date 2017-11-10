class HelloWorldApp {
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            new Thread(() -> {
                while(true) {
                    System.out.println("TEST " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();  // TODO: Customise this generated block
                    }
                }
            }).start();
        }
        System.out.println("Threads created");
    }
}
