public class NewSwitch {
        public static void main(String[] args) {
            String day = "Tuesday";
            String typeOfDay = switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
                case "Saturday", "Sunday" -> "Weekend";
                default -> "Invalid day";
            };
            System.out.println(day + " is a " + typeOfDay);
        }
}
