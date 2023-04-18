package com.java.basic.basic.onlyEnum;

public class EnumShiki {
    // ENUM > 일정 갯수의 상수를 정하고 그 외에값은 허용하지 않습니다. / 코드의 중복과 if 문 사용을 줄일 수 있습니다.
    public enum ServerPage {
        JSP, PHP, ASP
    }

    // fullName Enum
    public enum ScriptPage {
        JSP("JavaServerPage"),
        ASP("ActiveServerPage"),
        PHP("HypertextPreprocessor");
        private final String label;
        // Generator
        ScriptPage(String label) {
            this.label = label;
        }
        public String getLabel() {
            return label;
        }
    }

    public static void ServerPage() {
        System.out.println(ScriptPage.JSP.name());
        System.out.println(ScriptPage.JSP.getLabel());
    }

    public enum Currency1 {
        DOLLAR, EURO, YEN, YUAN, WON
    }

    public enum Currency2 {
        DOLLAR(1323), EURO(1370), YEN(944), YUAN(186);
        int value;
        private Currency2(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public static void CurrencySwitchCase() {
        Currency1 currency = Currency1.WON;
        switch (currency) {
            case WON:
                System.out.println("한국산입니다.");
                break;
            case DOLLAR:
                System.out.println("I'm FROM USA");
                break;
        }
    }

    public static void CurrencyBoard() {
        Currency2 currency2 = Currency2.DOLLAR;
        switch(currency2) {
            case DOLLAR:
                System.out.println("DOLLAR TO WON > " + currency2.getValue() + "₩");
                break;
            case EURO:
                System.out.println("EURO TO WON > " + currency2.getValue() + "₩");
                break;
        }
    }

    public static void main(String[] args) {
        ServerPage();
    }
}
