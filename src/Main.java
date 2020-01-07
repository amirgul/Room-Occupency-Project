public class Main
{

    public static void main(String[] args)
    {
        RoomOcupency object = new RoomOcupency();
        object.removeOneFromRoom();
        object.removeOneFromRoom();
        object.removeOneFromRoom();
        object.removeOneFromRoom();
        int numberInRoom = object.getNumberInRoom();
        int totalNumber = object.getTotalNumber();
        System.out.println("Number in room: "+ numberInRoom);
        System.out.println("Total number: "+ totalNumber);


    }
}
