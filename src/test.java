import java.util.ArrayList;
import java.util.List;

public class test
{
    public static void main (String[] args)
    {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Andrew");
        nameList.add("Calvin");
        nameList.add("Jordan");
        nameList.add("Mattia");
        nameList.add("Alex");

        Sorts.ascendingSort(nameList);
        Sorts.printArray(nameList);
        Sorts.printArray(Sorts.RemoveLongerThan(4, nameList));
        Sorts.printArray(nameList);
    }

}
