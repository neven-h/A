public class C extends A {
    private int _cVal;

    public C(int aVal, int cVal) {
        _cVal = cVal;
    }

    // correction
    @Override
    public boolean foo(int n) {
        return (n == 1);
//         if (_aVal < 5 || _cVal < 7) {
//             return true;
//         }
//         return (n < 5);
        
        // another option:
//       if (_aVal < 1 && _cVal > 1) {
//        return true;        
    }
}
