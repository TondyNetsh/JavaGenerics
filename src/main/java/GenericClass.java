class GenericClass<T>{
    private T integerElements;
    private T stringElements;

    public void setIntElements(T intElements){
        integerElements = intElements;
    }
    public void setStringElements(T stringElements){
        this.stringElements = stringElements;
    }
    public T getIntElements(){
        return integerElements;
    }
    public T getStringElements(){
        return stringElements;
    }
    public <T> void printArrayContent(T[] array){
        for (T elements:array) {
            System.out.print(elements + " "); //Output for all string and/or integer elements
        }
        System.out.println("");
        //System.out.print();
    }
}
