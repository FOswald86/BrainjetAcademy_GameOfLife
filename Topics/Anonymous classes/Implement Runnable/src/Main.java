class Create {

    public static Runnable createRunnable(String text, final int repeats) {

        Runnable runnable = new Runnable() {
            int counter = repeats;
            @Override
            public void run() {
                while (counter > 0) {
                    System.out.println(text);
                    counter--;
                }
            }
        };

        return runnable;
    }
}