import javafx.application.Application;
import javafx.stage.Stage;

public class DialogLayout extends Application{

    public void start(Stage stage) throws Exceptions{
        stage.setTitle("Dialog Layout");
        stage.show();
    }

    private Pane createInputPane() {
        final GridPane gridPane = new GridPane();
        gridPane.setBorder(
                new Border(
                        new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, null,
                                new BorderWidths(5)))
        );
        gridPane.setPadding(new Insets(7, 7, 7, 7));
        gridPane.setGridLinesVisible(true);
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        final Label label1 = new Label("Label1");
        final TextField textfield1 = new TextField();
        final Label label2 = new Label("Label2");
        final TextField textfield2 = new TextField();
        final Button button = new Button("Button");
        gridPane.add(label1, 0, 0);
        gridPane.add(textfield1, 1, 0);
        gridPane.add(label2, 0, 1);
        gridPane.add(textfield2, 1, 1);
        gridPane.add(button, 1, 2);
        return gridPane;
    }


    public static void main(String[] args) {
        launch(args);

    }
}
