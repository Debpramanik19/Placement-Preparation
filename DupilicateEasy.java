
public class DupilicateEasy
{
    public static void main(String args[])
    {
        boolean flag = false;
        int arr[] = {1,2,5,3,4,5};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate element found: "+arr[i]);
                    flag = true;
                }
            }
        }
        if(flag == false)
        {
            System.out.println("Duplicate element  not found");
        }
        
    }
}
