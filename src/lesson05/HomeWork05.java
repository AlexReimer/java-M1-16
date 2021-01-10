package lesson05;

public class HomeWork05 {
    public static void main(String[] args) {

        /*родители Василия добились успехов в программировании
        и смогли передать свои знания сыну. Василий вырос и запрограммировал
        систему аварийного уничтожения первых космических кораблей земли,
        улетавших в Альфа-Центавра. Система реагирует на ввод
       команд двух старших офицеров. */
        System.out.println(bigBadaBoomShip(true, false));
        System.out.println(bigBadaBoomShip(false, false));
        System.out.println(bigBadaBoomShip(false, true));
        System.out.println(bigBadaBoomShip(true, true));


        /*На даче у родителей Васи решили поставить звонок,
        который должен звонить при нажатии на кнопку звонка у калитки или у двери дома.
        Если соседские дети начинают играться и нажимать на кнопку звонка одновременно
        и на калитке, и на доме, звонок не должен реагировать. Напишите прогу для звонка */
        System.out.println(doorBell(false, false));//false
        System.out.println(doorBell(true, true));//false
        System.out.println(doorBell(false, true));//true
        System.out.println(doorBell(true, false));//true
        /* ??? а получилось в E-XOR четыре раза true, хотя ожидалось 2 true и 2 false */


        /* умный дом семье Василия. Дверь открывается эл.ключом, когда есть интернет и эл-во.
    Написать прогу smartDoorCheckKey и проверить ее как контролер */
        System.out.println(smartDoorCheckKey(true, true, true));// => true
        System.out.println(smartDoorCheckKey(true, false, false));// => false
        System.out.println(smartDoorCheckKey(true, false, true));// => false
        System.out.println(smartDoorCheckKey(true, true, false));// => false
        System.out.println(smartDoorCheckKey(false, true, false));// => false
        System.out.println(smartDoorCheckKey(false, false, true));// => false
        System.out.println(smartDoorCheckKey(false, false, false));// => false
        System.out.println(smartDoorCheckKey(false, true, true));// => false

    }


    public static boolean smartDoorCheckKey(boolean key, boolean internet, boolean electricity) {
        return internet && electricity || key;
    }


    public static boolean bigBadaBoomShip(boolean officerOne, boolean officerTwo) {
        return officerOne && officerTwo;
    }

    public static boolean doorBell(boolean door, boolean gate) {
        boolean a = door;
        boolean b = gate;
        boolean f = a ^ b;
        System.out.println(f);
        return door ^ gate;
        //return ! (door == gate); //можно и так
        //return door != gate; //можно и так
    }


}


