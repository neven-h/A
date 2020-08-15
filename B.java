public class B extends A {
    private int _bVal;

    public B(int aVal, int bVal){
        super(aVal);
        _bVal = bVal;
    }

    public boolean foo(int n) {
        if( _aVal < 2 || _bVal >4 ){
            return true;
        }
        return(n> 2);
    }
}
