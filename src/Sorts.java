import java.util.ArrayList;
import java.util.List;

public class Sorts
{
    public static void ascendingSort(String[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int lowPosition = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j].compareTo(arr[lowPosition]) < 0)
                {
                    lowPosition = j;
                }

                swap(i, lowPosition, arr);
            }
        }
    }

    private static void swap(int indexA, int indexB, String[] arr)
    {
        String temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public static void printArray(int[] arr)
    {
        for (int n : arr)
        {
            System.out.print(n + ", ");
        }
        System.out.println();
    }

    public static void printArray(List<String> list)
    {
        for (String n : list)
        {
            System.out.print(n + ", ");
        }
        System.out.println();
    }

    public static void ascendingSort(List<String> list)
    {
        for (int i = 0; i < list.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < list.size(); h++)
            {
                if (list.get(h).compareTo(list.get(lowPosition)) < 0)
                    lowPosition = h;
            }
            list.set(i, list.set(lowPosition, list.get(i)));
        }
    }

    public static ArrayList<String> RemoveLongerThan(int lenMax, List<String> list)
    {
        ArrayList<String> removedList = new ArrayList<String>();
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (list.get(i).length() > lenMax)
            {
                removedList.add(list.remove(i));
            }
        }

        return removedList;
    }
}
