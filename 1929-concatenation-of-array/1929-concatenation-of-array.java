class Solution {
    public int[] getConcatenation(int[] array1) {
        int array2[] = new int[array1.length];
        for(int i = 0;i<array1.length;i++){
            array2[i] = array1[i];
        }
        int[] result = new int[array1.length+array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}