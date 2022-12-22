public class water {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height)
    {
        int max = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length-1;

        while(low < high)
        {
            int min = Math.min(height[low], height[high]);
            int capacity = min * (high - low);

            max = Math.max(max, capacity);

            if (height[low] < height[high])
                low++;

            else
                high--;
        }

        return max;
    }
}