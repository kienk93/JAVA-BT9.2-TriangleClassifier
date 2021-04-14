import TriangleClassifier.TriangleClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    TriangleClassifier triangleClassifier = new TriangleClassifier();
    @Test
    @DisplayName("checkTriangle")
    public void checkTriangle() {
        String expertResult = "tam giác đều";
        String actualResult = triangleClassifier.isTrianbleClassifier(2, 2, 2);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("checkTriangle")
    public void checkTriangle2() {
        String expertResult = "tam giác cân";
        String actualResult = triangleClassifier.isTrianbleClassifier(2, 2, 3);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("checkTriangle")
    public void checkTriangle3() {
        String expertResult = "tam giác thường";
        String actualResult = triangleClassifier.isTrianbleClassifier(3, 4, 5);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("checkTriangle")
    public void checkTriangle4() {
        String expertResult = "không phải là tam giác";
        String actualResult = triangleClassifier.isTrianbleClassifier(8, 2, 3);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("checkTriangle")
    public void checkTriangle5() {
        String expertResult = "không phải là tam giác";
        String actualResult = triangleClassifier.isTrianbleClassifier(-1, 2, 1);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("checkTriangle")
    public void checkTriangle6() {
        String expertResult = "không phải là tam giác";
        String actualResult = triangleClassifier.isTrianbleClassifier(0, 1, 1);
        assertEquals(expertResult,actualResult);
    }


}