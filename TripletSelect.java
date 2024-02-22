import tester.*;

class Triplet {
    int a;
    int b;
    int c;

    Triplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

}

class TripletSelect {
    int[] getBs(Triplet[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i].b;
        }
        return output;
    }

    Triplet[] arr1 = {};
    Triplet t1 = new Triplet(1, 2, 3);
    Triplet t2 = new Triplet(4, 5, 6);
    Triplet t3 = new Triplet(7, 8, 9);
    Triplet[] arr2 = {t1, t2, t3};
    Triplet[] arr3 = {t3, t1};
    Triplet[] arr4 = {t2};

    void testCheckTripletSelect(Tester T) {
    T.checkExpect(getBs(arr1), new int[0]);
    T.checkExpect(getBs(arr2), new int[]{2, 5, 8});
    T.checkExpect(getBs(arr3), new int[]{8, 2});
    T.checkExpect(getBs(arr4), new int[]{5});
    }
}

