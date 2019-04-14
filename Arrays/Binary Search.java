package Libray.arrays;

class Binary_Search{
	int upperBound(long[] array, int length, long value) {
        int low = 0;
        int high = length;
        while (low < high) {
            int mid = (low + high) / 2;
            if(value == array[mid]){
                return mid;
            }
            else if (value > array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}