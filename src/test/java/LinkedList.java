import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkedList
{

    java.util.LinkedList<Integer> linkList;
    java.util.LinkedList<Integer> revLinkList;

    @BeforeTest
    public void linkListCreation()
    {
        linkList =new java.util.LinkedList<Integer>();
        revLinkList =new java.util.LinkedList<Integer>();
        linkList.add(1000);
        linkList.add(10);
        linkList.add(100);
        linkList.addFirst(10000);
        linkList.addLast(23);
    }

    @Test
    public void linkListTraversal()
    {
        linkList.get(0);
        System.out.println(linkList.getFirst());
        linkList.getLast();
        System.out.println(linkList.peek());
    }

    @Test
    public void clearAndSizeList()
    {
        linkList.size();
        linkList.clear();

    }

    @Test
    public void revLinkList()
    {
        for(int i=linkList.size()-1;i>=0;i--)
        {
            revLinkList.add(linkList.get(i));
        }

        System.out.println(revLinkList.toString());

    }
}
