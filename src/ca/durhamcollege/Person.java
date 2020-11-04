package ca.durhamcollege;

public class Person
{
    //Data members
    private String m_name;
    private int m_age;

    //Constructors

    /**
     * The default constructor sets name to "unknown" and age to 0
     */
    public Person()
    {
        m_name = "unkown";
        m_age = 0;
    }
    public Person(String m_name, int age)
    {
        this.m_age = age;
        this.m_name = m_name;
    }

    public Person(int m_age)
    {
        this.m_age = m_age;
    }
    //Accessors
    public String getName()
    {
        return m_name;
    }
    public int getAge()
    {
    return m_age;
    }
    //Mutators
    public void setName(String m_name)
    {
        this.m_name = m_name;
    }
    public void setAge(int m_age)
    {
        this.m_age = m_age;
    }

    //Methods

    /**
     * This method overrides the built-in toString method and returns the Person properties
     * @return {String}
     */
    @Override
    public String toString() {

        String outputString = "";
        outputString +="Name: " + this.m_name;
        outputString+= "Age : " + this.m_age;
        return outputString;
    }

    /**
     * This method tests the Person class and returns a simple message to the console
     */
    public void saysHello()
    {
        System.out.println(this.m_name + "Says hello.");
    }
}
