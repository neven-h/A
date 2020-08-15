public class C extends A {
    private int _cVal;

    public C(int aVal, int cVal) {
        _cVal = cVal;
    }

    // correction
    @Override
    public boolean foo(int n) {
        if (_aVal < 5 || _cVal < 7) {
            return true;
        }
        return (n < 5);
    }
}
