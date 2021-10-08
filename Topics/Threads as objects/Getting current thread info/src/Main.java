class Info {

    public static void printCurrentThreadInfo() {
        // get the thread and print its info
        String name = String.valueOf(Thread.currentThread().getName());
        int priority = Thread.currentThread().getPriority();
        System.out.println("name: " + name
                + "\npriority: " + priority);
    }
}