package TriangleClassifier;

public class TriangleClassifier {

    public String isTrianbleClassifier(int a, int b, int c) {
        if ((a == b) && (b == c) && (a == c)) {
            return "tam giác đều";
        } else if (a>0 &&((a == b) || (a == c) || (b == c))) {
            return "tam giác cân";
        } else if ((a + b > c) && (a + c > b) &&  (b + c > a)) {
            return "tam giác thường";
        } else {
            return "không phải là tam giác";
        }
    }


}