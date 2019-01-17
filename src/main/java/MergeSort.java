public class MergeSort {
    public int[] solution(int[] input) {
        return mergeSort( input, 0 , input.length-1);
    }

    private int[] mergeSort(int[] input, int start, int end) {
        if ( start == end) {
            return new int[] {input[start]};
        }
        int len = end -start +1;
        int mid = (start + end) /2;

        int[] left = new int[mid-start+1];
        int[] right = new int[end-mid];

        left=mergeSort(input, start, mid );
        right=mergeSort(input, mid+1, end);

        int leftCount =0;
        int rightCount =0;
        int count=0;
        int[] temp = new int[left.length+ right.length];
        while(true) {
            if( (leftCount >= left.length) || (rightCount >= right.length)) {
                break;
            }
            else if (left[leftCount] <= right[rightCount]) {
                temp[count] = left[leftCount];
                leftCount++;
                count++;
            }
            else if(right[rightCount] < left[leftCount]) {
                temp[count] = right[rightCount];
                rightCount++;
                count++;
            }
        }
        while ( leftCount < left.length) {
            temp[count] = left[leftCount];
            leftCount++;
            count++;
        }
        while ( rightCount < right.length) {
            temp[count] = right[rightCount];
            rightCount++;
            count++;
        }
        return temp;
    }
}
