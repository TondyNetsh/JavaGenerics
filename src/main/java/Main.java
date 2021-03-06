public static void main(String[] args) {

        GenericClass generic = new GenericClass();

        generic.printArrayContent(new Integer[]{1,2,3});
        generic.printArrayContent(new String[]{"Rotondwa", "Netshimbupfe", "Gauteng"});

        GenericClass<String> stringInstance = new GenericClass<String>();
        stringInstance.setStringElements("Test"); //Assign a value to string element from Generic class

        System.out.println(stringInstance.getStringElements()); // print out Test

        GenericClass<Integer> integerInstance = new GenericClass<Integer>();
        integerInstance.setIntElements(1000); //Assign a value to intiger element from Generic class

        System.out.println(integerInstance.getIntElements()); // print out 1000
}