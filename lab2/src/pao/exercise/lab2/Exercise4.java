package pao.exercise.lab2;

/**
 * Implement a Singleton class as you learned in the course.
 */
public class Exercise4 {
    public static void main(String[] args)
    {
        MySingletonClass obj1 = MySingletonClass.getMySingletonClass();
        MySingletonClass obj2 = MySingletonClass.getMySingletonClass();

        if (obj1 == obj2)
        {
            System.out.println("Singleton class successfully created!");
            obj1.showMySingletonClass();
        }
        else
            System.out.println("Singleton class creation failed!");
    }
}
class MySingletonClass
{
    private static MySingletonClass mySingletonClass;
    private static final int CONSTANT_FIELD = 10;

    private MySingletonClass() {}

    public static MySingletonClass getMySingletonClass()
    {
        if(mySingletonClass == null)
            mySingletonClass = new MySingletonClass();
        return mySingletonClass;
    }

    public void showMySingletonClass()
    {
        System.out.println("Nothing else but a constant here: " + CONSTANT_FIELD);
    }
}