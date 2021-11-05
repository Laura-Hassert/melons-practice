import java.sql.Array;

public class Main {

    public static void main(String[] args) {

        MelonType musk = new MelonType(
                "musk",
                "Muskmelon",
                1998,
                "green",
                true,
                true
        );

        MelonType cas = new MelonType(
                "cas",
                "Casaba",
                2003,
                "orange",
                true,
                false
        );

        MelonType cren = new MelonType(
                "cren",
                "Crenshaw",
                1996,
                "green",
                false,
                false
        );

        MelonType yw = new MelonType(
                "yw",
                "Yellow Watermelon",
                2013,
                "yellow",
                true,
                true
        );

        MelonType[] melonTypes = {musk, cas, cren, yw};

        Melon one = new Melon(
                yw,
                8,
                7,
                2,
                "Shiela"
        );

        Melon two = new Melon(
                yw,
                3,
                4,
                2,
                "Shiela"
        );

        Melon three = new Melon(
                cas,
                10,
                6,
                35,
                "Shiela"
        );

        Melon four = new Melon(
                cren,
                8,
                9,
                35,
                "Michael"
        );

        Melon five = new Melon(
                cren,
                8,
                2,
                35,
                "Michael"
        );

        Melon six = new Melon(
                musk,
                6,
                7,
                4,
                "Michael"
        );

        Melon seven = new Melon(
                yw,
                7,
                10,
                3,
                "Shiela"
        );

        Melon[] melons = {one, two, three, four, five, six, seven};

//        for (Melon melon : melons) {
//            System.out.println(melon.isSellable());
//        }

        getSellabilityReport(melons);

    }

    public static void getSellabilityReport(Melon[] melons) {
        String finalString;
        String name;
        int field = 0;
        String sellability;
        for (Melon melon : melons) {
            name = melon.harvester;
            field = melon.field;
            if (melon.isSellable() == true) {
                sellability = "(CAN BE SOLD)";
            } else {
                sellability = "(NOT SELLABLE)";
            }
            finalString = String.format("Harvested by %s from Field %d %s", name, field, sellability);
            System.out.println(finalString);
        }

    }

}
