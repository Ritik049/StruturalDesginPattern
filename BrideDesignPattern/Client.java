public class Client
{
    public static void main(String[]args)
    {
        Device tv = new DeviceTV();

        AdvancedRemote remote = new AdvancedRemote(tv);      //abstraction(implementation);

        remote.volumeUp();
        remote.channelUp();
        remote.volumeDown();
        remote.volumeUp();

        System.out.println(tv.getChannel());
        System.out.println(tv.getVolume());

        remote.mute();
        System.out.println(tv.getVolume());

    


    }
}