class StaticMethods {
    public static void main(String[] args) {

        // Using static methods
        sayMessage();

        // But what if we want to use a non static method?
        // We will have to create a class and instance of that class to use it
        // We will need to create a different class that will have these methods

        NonStaticMethods testMethod = new NonStaticMethods();
        testMethod.sayAnotherMessage(); // this will run the non static method

        // But what if that class has a static method?
        // We can use that method directly without making another object instance
        NonStaticMethods.moreMessages();

        // Conclusion
        // Methods need to be static when used in the same class and in the main method

        // Non static methods need to be in another class to be used, an instance of
        // that class needs to be made so that we can access the non static method

        // As for static methods in another class, we can access those directly through
        // the class without creating an instance of that class

    }

    static void sayMessage() { // needs to be static so that it could be used for the main method

        System.out.println("Message from a static method");

    }

}