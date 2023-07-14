public class Gen<T> {
    T ob;
    Gen (T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void printElement(){
        System.out.println(ob.getClass().getName() + " " + ob);
    } 
}