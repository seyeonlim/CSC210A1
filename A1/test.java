import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    //Testing wholeSum method
    @Test
    public void testWholeSumPositiveNumbers() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f};
        assertEquals(6.0f, Methods.wholeSum(arr), 0.01f);
    }

    @Test
    public void testWholeSumMixedNumbers() {
        float[] arr = new float[] {-7.5f, 3.2f};
        assertEquals(-4.3f, Methods.wholeSum(arr), 0.0f);
    }

    @Test
    public void testWholeSumEmptyArray() {
        float[] arr = new float[] {};
        assertEquals(0.0f, Methods.wholeSum(arr), 0.01f);
    }

    @Test
    public void testWholeSumOneElement() {
        float[] arr = new float[] {8.8f};
        assertEquals(8.8f, Methods.wholeSum(arr), 0.01f);
    }

    @Test
    public void testWholeSumTwoElements() {
        float[] arr = new float[] {8.8f, 2.0f};
        assertEquals(10.8f, Methods.wholeSum(arr), 0.01f);
    }

    //Testing sum method
    @Test
    public void testSumRange() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(5.0f, Methods.sum(arr, 1, 3), 0.01f);
    }

    @Test
    public void testSumRange2() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(10.0f, Methods.sum(arr, 0, 4), 0.01f);
    }

    @Test
    public void testSumSameRange() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(0.0f, Methods.sum(arr, 2, 2), 0.01f);
    }

    @Test
    public void testSumMixedNumbers() {
        float[] arr = new float[] {1.0f, -2.0f, 3.0f, -4.0f};
        assertEquals(-2.0f, Methods.sum(arr, 0, 4), 0.01f);
    }

    @Test
    public void testSumNoRange() {
        float[] arr = new float[] {1.0f, 3.0f, 3.0f, 4.0f};
        assertEquals(11.0f, Methods.sum(arr), 0.01f);
    }

    @Test
    public void testSumNegativeNumbers() {
        float[] arr = new float[] {-1.0f, -2.0f, -3.0f, -4.0f};
        assertEquals(-2.0f, Methods.sum(arr, 1, 2), 0.01f);
    }

    //Testing mean method
    @Test
    public void testMeanRange() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(3.5f, Methods.mean(arr, 2, 4), 0.01f);
    }

    @Test
    public void testMeanRange2() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(2.5f, Methods.mean(arr, 1, 3), 0.01f);
    }

    @Test
    public void testMeanSameRange() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(0.0f, Methods.mean(arr, 1, 1), 0.01f);
    }

    @Test
    public void testMeanMixedNumbers() {
        float[] arr = new float[] {1.0f, -4.0f, 3.0f, -5.0f};
        assertEquals(-1.25f, Methods.mean(arr), 0.01f);
    }

    @Test
    public void testMeanNoRange() {
        float[] arr = new float[] {1.0f, 2.0f, 3.0f, 4.0f};
        assertEquals(2.5f, Methods.mean(arr), 0.01f);
    }

    @Test
    public void testMeanNegativeNumbers() {
        float[] arr = new float[] {-1.0f, -2.0f, -3.0f, -4.0f};
        assertEquals(-2.5f, Methods.mean(arr), 0.01f);
    }

    //Testing min method
    @Test
    public void testMinRange() {
        float[] arr = new float[] {1.0f, 3.0f, 2.0f, 4.0f};
        assertEquals(2.0f, Methods.min(arr, 1, 4), 0.01f);
    }

    @Test
    public void testMinNoRange() {
        float[] arr = new float[] {1.0f, 3.0f, 2.0f, 4.0f};
        assertEquals(1.0f, Methods.min(arr), 0.01f);
    }

    @Test
    public void testMinEmptyArray() {
        float[] arr = new float[] {};
        assertEquals(Float.NaN, Methods.min(arr), 0.01f);
    }

    @Test
    public void testMinMixedNumbers() {
        float[] arr = new float[] {-1.0f, -3.0f, 2.0f, -4.0f};
        assertEquals(-4.0f, Methods.min(arr, 0, 4), 0.01f);
    }

    @Test
    public void testMinNegativeNumbers() {
        float[] arr = new float[] {-1.0f, -3.0f, -5.0f, -4.0f};
        assertEquals(-5.0f, Methods.min(arr, 2, 4), 0.01f);
    }

    @Test
    public void testMinSameRange() {
        float[] arr = new float[] {-1.0f, 3.0f, -5.0f, -4.0f};
        assertEquals(Float.NaN, Methods.min(arr, 2, 2), 0.01f);
    }

    //Testing max method
    @Test
    public void testMaxRange() {
        float[] arr = new float[] {1.0f, 3.0f, 2.0f, 4.0f};
        assertEquals(4.0f, Methods.max(arr, 1, 4), 0.01f);
    }

    @Test
    public void testMaxNoRange() {
        float[] arr = new float[] {1.0f, 3.0f, 2.0f, 6.0f};
        assertEquals(6.0f, Methods.max(arr), 0.01f);
    }

    @Test
    public void testMaxEmptyArray() {
        float[] arr = new float[] {};
        assertEquals(Float.NaN, Methods.max(arr), 0.01f);
    }

    @Test
    public void testMaxMixedNumbers() {
        float[] arr = new float[] {-1.0f, -3.0f, 2.0f, -4.0f};
        assertEquals(2.0f, Methods.max(arr, 0, 4), 0.01f);
    }

    @Test
    public void testMaxNegativeNumbers() {
        float[] arr = new float[] {-1.0f, -3.0f, -5.0f, -4.0f};
        assertEquals(-4.0f, Methods.max(arr, 2, 4), 0.01f);
    }

    @Test
    public void testMaxSameRange() {
        float[] arr = new float[] {-1.0f, 3.0f, -5.0f, -4.0f};
        assertEquals(Float.NaN, Methods.max(arr, 2, 2), 0.01f);
    }

    //Testing lowest method
    @Test
    public void testLowestPositiveNumbers() {
        float[] arr = new float[] {1.0f, 3.0f, 2.0f, 4.0f};
        assertArrayEquals(new float[]{1.0f, 2.0f}, Methods.lowest(arr, 0, 4, 2), 0.01f);
    }

    @Test
    public void testLowestPositiveNumbers2() {
        float[] arr = new float[] {2.0f, 3.0f, 2.0f, 3.0f};
        assertArrayEquals(new float[]{2.0f, 2.0f, 3.0f}, Methods.lowest(arr, 0, 4, 3), 0.01f);
    }

    @Test
    public void testLowestNoRange() {
        float[] arr = new float[] {4.0f, 3.0f, 2.0f, 1.0f};
        assertArrayEquals(new float[]{1.0f, 2.0f}, Methods.lowest(arr, 3), 0.01f);
    }
}
