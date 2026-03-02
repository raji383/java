public class UnitConverter {
    public static String convert(String[] args) {
        // your code here
        String from = args[0];
        String to = args[1];
        int n = Integer.parseInt(args[3]);
        switch (from) {
            case "Fahrenheit":
                if (to != "Celsius") {
                    return "ERROR";
                }
                n = (n - 32) * (5 / 9);
                break;
            case "Celsius":
                if (to != "Fahrenheit") {
                    return "ERROR";
                }
                n = n * (5 / 9) + 32;
                break;
            case "Kilometers":
                if (to != "Miles") {
                    return "ERROR";
                }
                n *= 0.621371;
                break;
            case "Miles":
                if (to != "Kilometers") {
                    return "ERROR";
                }
                n *= 1.60934;
                break;
            case "Pounds":
                if (to != "kilograms") {
                    return "ERROR";
                }
                n *= 0.45359237;
                break;

            default:
                return "ERROR";
        }
        return String.valueOf(n);
    }

    public static void main(String[] args) {
        System.out.println(UnitConverter.convert(new String[] { "celsius", "fahrenheit", "100" }));
        System.out.println(UnitConverter.convert(new String[] { "fahrenheit", "celsius", "212" }));
        System.out.println(UnitConverter.convert(new String[] { "kilometers", "miles", "5" }));
        System.out.println(UnitConverter.convert(new String[] { "pounds", "kilograms", "10" }));
        System.out.println(UnitConverter.convert(args));
    }
}