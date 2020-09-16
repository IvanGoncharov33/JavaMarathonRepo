package SeaBattle;

public enum Display {
    DECK_ISALIVE("\uD83D\uDEE5"), DECK_ISNOTALIVE("\uD83D\uDFE5"), HALO("\uD83D\uDFE6"), EMPTY_CELL("⬜"), MISS_CELL("[x]");

    private String display;
    private Ship ship;

    private Display(String display) {
        this.display = display;
    }

    public String toString() {
        return display;
    }
}
