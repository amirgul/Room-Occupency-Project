public class RoomOcupency
{

    private int numberInRoom= 3;
    private static int totalNumber= 10;

    public void addOneToRoom()
    {
        numberInRoom++;
        totalNumber = totalNumber+ 1;
    }
    public void removeOneFromRoom()
    {
        if(numberInRoom <= 0)
        {
            System.out.println("no one can be romoved from the room");

        }
        else
        {
            numberInRoom--;
            totalNumber = totalNumber -1;
        }
    }
    public int getNumberInRoom()
    {
        return numberInRoom;
    }

    public  int getTotalNumber()
    {
        return totalNumber;
    }
}
