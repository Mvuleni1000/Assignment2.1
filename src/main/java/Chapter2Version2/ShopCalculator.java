package Chapter2Version2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/18.
 */
public class ShopCalculator {


    public int Sum(int a , int b)
    {
        return a+b;
    }

    public List<String> returnList()
    {
        List list = new ArrayList();

        list.add("Mnisi");
        list.add("Sibusiso");

        return list;
    }

    public float floatNumber(float a,float b)
    {
        return  a+b;
    }

    public String FirstName()
    {
        return "Sbu";
    }

    public String nullValue()
    {
        return null;
    }


}
