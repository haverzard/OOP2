package com.avatarduel.view;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class DeckView {
    private static HBox deckCounterBottom;
    private static HBox deckCounterTop;

    public static void init() {
        deckCounterBottom = new HBox();
        deckCounterTop = new HBox();
        deckCounterTop.setAlignment(Pos.CENTER);
        deckCounterBottom.setAlignment(Pos.CENTER);
    }

    public static void updateDeckCounter(String type, int x) {
        HBox deckCounter = getDeckCounter(type);
        Text deckCounts = new Text(Integer.toString(x));
        deckCounter.getChildren().clear();
        deckCounter.getChildren().add(deckCounts);
        deckCounter.getChildren().add(new Text(" / 60"));
    }

    public static HBox getDeckCounter(String type) {
        if (type.equals("top")) {
            return deckCounterTop;
        } else {
            return deckCounterBottom;
        }
    }
}
