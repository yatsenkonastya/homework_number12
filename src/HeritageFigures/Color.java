package HeritageFigures;

public enum Color {

    Блакитний ("#001ff2 (35,53,125)") {
        @Override
        public String toString() {
            return ("Цей колір блакитний");
        }
    },
    Червоний ("#f0110f (137,0,87)") {
        @Override
        public String toString() {
            return ("Цей колір червоний");
        }
    },
    Чорний ("#0ff02f (450,36,91)") {
        @Override
        public String toString() {
            return ("Цей колір чорний");
        }
    };
    private String color;
    Color (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
