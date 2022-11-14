package basic.onlyEnum;

public class EnumImplement {
    // Enum > 기본적으로 상속이 불가함으로 implements 해서 상속을 흉내 낼 수 있다!
    enum Currency implements Runnable {
        DOLLAR(1323) {
            public void showCurrency() {
                System.out.println("DOLLAR to WON > " + getValue() + "₩");
            }
        },
        EURO(1370) {
            public void showCurrency() {
                System.out.println("EURO to WON > " + getValue() + "₩");
            }
        },
        YEN(944){
            public void showCurrency() {
                System.out.println("YEN to WON > " + getValue() + "₩");
            }
        },
        YUAN(186){
            public void showCurrency() {
                System.out.println("YUAN to WON > " + getValue() + "₩");
            }
        };

        private int value;

        private Currency(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            String tempString = value + "₩";
            return tempString;
        }

        @Override
        public void run() {
            System.out.println("run() Method's Override");
        }
        // abstract method 사용시 상수에서 재정의가 가능합니다. / enum 확장성 증가 / 개발자 실수를 컴파일시 확인 가능
        public abstract void showCurrency();
    }

    public static void main(String[] args) {
        Currency currency = Currency.YUAN;
        currency.showCurrency();
    }

}
