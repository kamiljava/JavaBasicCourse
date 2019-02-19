package controller;

import java.util.regex.Pattern;

public class RegExpController {

        public boolean checkPostalCode(String postalCode){
            String template ="^\\d{2}-\\d{3}$";
            return Pattern.matches(template,postalCode);
        }
        public boolean checkPesel(String pesel){
            String template = "\\d{11}";

            return Pattern.matches(template,pesel);
}
    public boolean phoneNumber(String number) {
        String template1 = "^[+]{1}\\d{2,3}-\\d{3}-\\d{3}-\\d{3}";
        String templat2 = "\\d{3}-\\d{3}-\\d{3}";

        return Pattern.matches(template1 + "|" + templat2, number);
    }
    public boolean checkMail(String mail){
        String template = "^[a-zA-Z0-9]*[.]?[a-zA-Z0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]*$";

        return Pattern.matches(template,mail);
    }

    public static void main(String[] args) {

            RegExpController rec = new RegExpController();
        System.out.println("Sprawdzanie kodu pocztowego");
        System.out.println(rec.checkPostalCode("03-032"));
        System.out.println(rec.checkPostalCode("0x-032"));
        System.out.println(rec.checkPostalCode("03032"));
        System.out.println(rec.checkPostalCode("55-032"));
        System.out.println("Sprawdzenie peselu");
        System.out.println(rec.checkPesel("11111111111"));
        System.out.println(rec.checkPesel("11111"));
        System.out.println(rec.checkPesel("1          1"));
        System.out.println("Sprawdzanie numerów telefonów");
        System.out.println(rec.phoneNumber("+48-333-333-333"));
        System.out.println(rec.phoneNumber("+48 333-333-333"));
        System.out.println(rec.phoneNumber("++4-333-333-333"));
        System.out.println(rec.phoneNumber("+4-333-333-333"));
        System.out.println(rec.phoneNumber("+48-333-333-333-333"));
        System.out.println(rec.phoneNumber("333-333-333"));
        System.out.println("Sprawdzenie email");
        System.out.println(rec.checkMail("kamilkamil@wp.pl"));
        System.out.println(rec.checkMail("kamilkamilwp.pl"));
        System.out.println(rec.checkMail("88kamilkamil@wp.pl"));

    }
}
