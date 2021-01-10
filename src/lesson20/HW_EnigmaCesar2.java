package lesson20;

public class HW_EnigmaCesar2 {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("СъеШь же ещё этих мягких французских булок, да выпей чаю"));
        //System.out.println(enigmaCaesarDe("ФэзЫя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб"));
    }

    private static String enigmaCaesar(String firstString) {
        String newString = firstString.toLowerCase();
        String outputCode = "";
        for (int i = 0; i < newString.length(); i++) {
            String az = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            int indexIn = az.indexOf(newString.charAt(i));
            if (indexIn == -1) {
                outputCode += newString.charAt(i);
            } else {
                indexIn += 3;
                if (indexIn >= az.length()) {
                    indexIn -= az.length();
                }
                outputCode += az.charAt(indexIn);
            }
            if (newString.codePointAt(i) != firstString.codePointAt(i)) {
                String upperCase = outputCode.substring(i, i + 1).toUpperCase();
                outputCode = outputCode.replace(outputCode.substring(i, i + 1), upperCase);
            }
        }
        return outputCode;
    }
}

