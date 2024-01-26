public class Main {
    /*
    * Önceki Java sürümlerinde switch ifadeleri yalnızca sabit (constant) ifadelerle çalışabiliyordu.
    * Ancak Java 14 ile birlikte gelen Switch Expressions, daha esnek ve güçlü bir syntax sunar.
    * Bu örnekte, switch ifadesi içinde her durum için bir ifade (-> operatörü ile ayrılmış) kullanılmıştır.
    * Ayrıca, case ifadeleri artık virgül ile birleştirilebilir, bu da daha temiz ve kompakt bir kod yazma olanağı sağlar.

Switch Expressions, daha güçlü ve okunabilir bir switch-case syntax'ı sunar ve kodu daha etkili hale getirir.
* Bu özellik, özellikle enum'lar veya sabit ifadelerle çalışırken daha kullanışlıdır. Java 14 ve sonraki sürümlerle birlikte bu özelliği kullanarak kodunuzu daha modern hale getirebilirsiniz.
    */
    public static void main(String[] args) {
        int dayOfWeek = 3;

        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
        };
        System.out.println("Day type: " + dayType);

        //void type için:
        switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
        }

    }
}