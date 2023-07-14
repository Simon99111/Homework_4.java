class Gen{
     
    public <T> void printArray(T[] items){
        for(T item: items){
            System.out.print(item + " ");
        }
    }
}