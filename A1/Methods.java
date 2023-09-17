import java.util.Arrays;

public class Methods {
    public static float wholeSum(float[] arr) {
        float wholeSum = 0f;
        for(int i = 0; i < arr.length; i++) {
            wholeSum += arr[i];
        }
        return wholeSum;
    }

    public static float sum(float[] arr, int lo, int hi) {
        float partialSum = 0f;
        for(int i = lo; i < hi; i++) {
            partialSum += arr[i];
        }
        return partialSum;
    }

    public static float sum(float[] arr) {
        float partialSum = 0f;
        for(int i = 0; i < arr.length; i++) {
            partialSum += arr[i];
        }
        return partialSum;
    }

    public static float mean(float[] arr) {
        float mean = wholeSum(arr) / arr.length;
        return mean;
    }

    public static float mean(float[] arr, int lo, int hi) {
        if(hi == lo) return 0.0f;
        float mean = sum(arr, lo, hi) / (hi - lo);
        return mean;
    }

    public static float min(float[] arr) {
        if (arr == null || arr.length == 0) {
            return Float.NaN; 
        }
        float min = Float.POSITIVE_INFINITY;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static float min(float[] arr, int lo, int hi) {
        if (arr == null || arr.length == 0 || lo >= arr.length || lo >= hi ) {
            return Float.NaN; 
        }

        float min = Float.POSITIVE_INFINITY;
        for(int i = lo; i < hi; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static float max(float[] arr) {
        if (arr == null || arr.length == 0) {
            return Float.NaN; 
        }

        float max = Float.NEGATIVE_INFINITY;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static float max(float[] arr, int lo, int hi) {
        if (arr == null || arr.length == 0 || lo >= arr.length || lo >= hi) {
            return Float.NaN; 
        }

        float max = Float.NEGATIVE_INFINITY;
        for(int i = lo; i < hi; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static float[] lowest(float[] arr, int lo, int hi, int num) {
        //or return Float.NaN??
        if (arr == null || arr.length == 0 || lo < 0 || hi > arr.length || num <= 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }

        float[] subArray = Arrays.copyOfRange(arr, lo, hi);
        Arrays.sort(subArray);
        float[] result = new float[num];
        for (int i = 0; i < num; i++) {
            if (i < subArray.length) {
                result[i] = subArray[i];
            } else {
                result[i] = Float.NaN;
            }
        }
        return result;
    }

    public static float[] lowest(float[] arr, int num) {
        if (arr == null || arr.length == 0 || num <= 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        Arrays.sort(arr);
        float[] result = new float[num];
        for (int i = 0; i < num; i++) {
            if (i < arr.length) {
                result[i] = arr[i];
            } else {
                result[i] = Float.NaN;
            }
        }
        return result;
    }

    public static float[] highest(float[] arr, int lo, int hi, int num) {
        if (arr == null || arr.length == 0 || lo < 0 || hi > arr.length || num <= 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }

        float[] subArray = Arrays.copyOfRange(arr, lo, hi);
        Arrays.sort(subArray);
        float[] result = new float[num];
        for (int i = 0; i < num; i++) {
            if (i < subArray.length) {
                result[i] = subArray[subArray.length - i - 1];
            } else {
                result[i] = Float.NaN;
            }
        }
        return result;
    }

    public static float[] highest(float[] arr, int num) {
        if (arr == null || arr.length == 0 || num <= 0) {
            throw new IllegalArgumentException("Invalid parameters");
        }
        Arrays.sort(arr);
        float[] result = new float[num];
        for (int i = 0; i < num; i++) {
            if (i < arr.length) {
                result[i] = arr[arr.length - i - 1];
            } else {
                result[i] = Float.NaN;
            }
        }
        return result;
    }
    

}