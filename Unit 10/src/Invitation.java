public class Invitation

{

    private String hostName;

    private String address;



    public Invitation(String n, String a)

    {

        hostName = n;

        address = a;

    }

    public Invitation(String address)

    {

       this.address = address;

        hostName = "Host";

    }

    public String returnHostName()
    {
        return hostName;
    }

    public void changeAddress(String a)
    {
        address = a;
    }

    public String invitePerson(String p)
    {
        return "Dear " + p + ", please attend my event at " + address + ". See you then, " + hostName + ".";
    }

}