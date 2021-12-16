package functions;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import objects.enums.Windows;

import java.io.IOException;
import java.util.Objects;

import static app.Main.getCurrentStage;

public class WinModif {

    private static final Stage currentStage = getCurrentStage();
    private static final double xOffset = 0;
    private static final double yOffset = 0;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void WinChange(Windows w) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(WinModif.class.getResource("/views/windows/" + w + ".fxml")));
        Scene scene = new Scene(root);
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        currentStage.setTitle(w.getTitle());
        currentStage.setScene(scene);
        currentStage.setResizable(false);
        currentStage.setX((primScreenBounds.getWidth() - currentStage.getWidth()) / 2);
        currentStage.setY((primScreenBounds.getHeight() - currentStage.getHeight()) / 2);
        currentStage.show();
    }

    public static void NewWin(Windows w) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(WinModif.class.getResource("/views/windows/" + w + ".fxml")));
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();
    }

}
