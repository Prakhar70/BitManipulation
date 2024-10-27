public class XorOfRangeLR {
    public int findRangeXOR(int l, int r) {
        int xorTillLExcl = findXorTill(l - 1);
        int xoeTillRInx = findXorTill(r);
        return xorTillLExcl ^ xoeTillRInx;

    }

    private int findXorTill(int n) {
        if (n % 4 == 0) {
            return n;
        }
        else if(n%4 == 1){
            return 1;
        }
        else if(n % 4 == 2){
            return n+1;
        }
        return 0;
    }
}
