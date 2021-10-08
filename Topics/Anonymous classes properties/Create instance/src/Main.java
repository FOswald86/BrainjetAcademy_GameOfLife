class CreateInstance {

    public static SuperClass create() {

        SuperClass instance = new SuperClass() {
            @Override
            public void method2() {
                String name = new Object(){}.getClass().getEnclosingMethod().getName();
                System.out.println(name);
            }

            @Override
            public void method3() {
                String name = new Object(){}.getClass().getEnclosingMethod().getName();
                System.out.println(name);
            }


        };
        instance.method2();
        instance.method3();
        return instance;
    }
}

// Don't change the code below

abstract class SuperClass {

    public static void method1() { 
        System.out.println("It's a static method.");
    }

    public void method2() {
        System.out.println("It's not a static method.");
    }

    public abstract void method3();

}