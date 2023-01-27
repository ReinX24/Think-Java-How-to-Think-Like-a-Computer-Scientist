class MainApp {

    public static void main(String[] args) {

        Outer classOne = new Outer(); // outer class object
        System.out.println("[Outer Class Object and Method]");
        classOne.outerInfo(); // shows variables in Outer class
        System.out.println("[Accessing Inner Class Methods with Outer Class Objects]");
        classOne.showInnerInfo(); // shows inner class info
        System.out.println("[Accessing Inner Class Methods with an Inner Class Object]");
        Outer.Inner classTwo = classOne.new Inner(); // creating an inner class object using an outer class object
        classTwo.innerInfo(); // directly shows inner class information

    }

}