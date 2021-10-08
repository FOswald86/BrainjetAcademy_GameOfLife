class MessageNotifier extends Thread {

    // write fields to store variables here
    String s;
    int n;

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.s = msg;
        this.n = repeats;
    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        while (this.n > 0) {
            System.out.println(this.s);
            this.n--;
        }
    }
}