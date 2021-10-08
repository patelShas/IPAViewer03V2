package View;

import Controller.IDictController;
import Controller.IPADictController;
import Model.IPADictionary;
import Model.References.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictGUIController implements IDictViewer {
    private IDictController controller;
    private IPADictionary model;

    @FXML
    private ListView<String> pronunciationList;
    @FXML
    private ListView<String> phonemeList;
    @FXML
    private TextField pronunciationLabel;
    @FXML
    private TextField phonemeDesc;
    @FXML
    private TextArea phonemeExp;
    @FXML
    private TextField searchBar;
    @FXML
    private Text successMarker;
    @FXML
    private TextArea referenceSheet;
    @FXML
    private RadioButton fontSmall, fontMedium, fontLarge;
    @FXML
    private RadioButton defaultScheme, khakiGreenScheme, coolBlueScheme, somewhatPurpleScheme;

    private ToggleGroup fontGroup;
    private ToggleGroup colorGroup;


    @FXML
    public void initialize() {
        model = new IPADictionary();
        controller = new IPADictController(model, this);
        // Setting up the reference page
        String ref = infoToRef(new AlveolarRidgeInfo(), new EpiglottisInfo(), new PharynxInfo(),
                new PlaceOfArticulationInfo(), new UvulaInfo(), new VocalTractInfo(), new HardPalateInfo(),
                new SoftPalateInfo(), new BladeTongueInfo(), new BodyTongueInfo());
        referenceSheet.setText(ref);
        // Setting up setting options
        fontGroup = new ToggleGroup();
        fontSmall.setToggleGroup(fontGroup);
        fontMedium.setToggleGroup(fontGroup);
        fontLarge.setToggleGroup(fontGroup);
        fontMedium.setSelected(true);
        colorGroup = new ToggleGroup();
        defaultScheme.setToggleGroup(colorGroup);
        khakiGreenScheme.setToggleGroup(colorGroup);
        coolBlueScheme.setToggleGroup(colorGroup);
        somewhatPurpleScheme.setToggleGroup(colorGroup);
        defaultScheme.setSelected(true);

    }

    private String infoToRef(IRef... info) {
        List<String> temp = new ArrayList<>();
        for (IRef ref :
                info) {
            temp.add(ref.getName().substring(0, 1).toUpperCase() + ref.getName().substring(1) + " - " + ref.getDesc() + "\n\n");
        }
        String[] refs = temp.toArray(new String[0]);
        Arrays.sort(refs);
        StringBuilder ans = new StringBuilder("");
        for (int j = 0; j < refs.length; j++) {
            ans.append(refs[j]);
        }
        return ans.toString();
    }

    public void setFont(ActionEvent event) {
        Scene scene = searchBar.getScene();
        ObservableList<String> styleSheets = scene.getStylesheets();
        styleSheets.remove(getClass().getResource("StyleSheets/font12.css").toExternalForm());
        styleSheets.remove(getClass().getResource("StyleSheets/font24.css").toExternalForm());
        styleSheets.remove(getClass().getResource("StyleSheets/font36.css").toExternalForm());
        if (fontSmall.isSelected()) {
            styleSheets.add(getClass().getResource("StyleSheets/font12.css").toExternalForm());
        } else if (fontMedium.isSelected()) {
            styleSheets.add(getClass().getResource("StyleSheets/font24.css").toExternalForm());
        } else if (fontLarge.isSelected()) {
            styleSheets.add(getClass().getResource("StyleSheets/font36.css").toExternalForm());
        }
    }

    public void setColorScheme(ActionEvent event) {
        Scene scene = searchBar.getScene();
        ObservableList<String> styleSheets = scene.getStylesheets();
        if (khakiGreenScheme.isSelected()) {
            styleSheets.add(getClass().getResource("StyleSheets/khakiGreen.css").toExternalForm());
        } else {
            styleSheets.remove(getClass().getResource("StyleSheets/khakiGreen.css").toExternalForm());
        }
        if (coolBlueScheme.isSelected()) {
            styleSheets.add(getClass().getResource("StyleSheets/coolBlue.css").toExternalForm());
        } else {
            styleSheets.remove(getClass().getResource("StyleSheets/coolBlue.css").toExternalForm());
        }
        if (somewhatPurpleScheme.isSelected()) {
            styleSheets.add(getClass().getResource("StyleSheets/somewhatPurple.css").toExternalForm());
        } else {
            styleSheets.remove(getClass().getResource("StyleSheets/somewhatPurple.css").toExternalForm());
        }
    }

    public void lookItUp() {
        // Make change to model
        String query = searchBar.getText();
        doCommand("IPALookup " + query);
        pronunciationList.setItems(FXCollections.observableList(model.getAllEntries()));
        // Allow a specific pronunciation to be selected
        pronunciationList.getSelectionModel().selectedItemProperty().addListener(pronunListSetUp);
    }

    ChangeListener<String> pronunListSetUp = new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
            // update the pronuciation label
            int chosenVariantIndex = pronunciationList.getSelectionModel().getSelectedIndex();
            if (chosenVariantIndex >= 0) {
                doCommand("IPALearn variant " + pronunciationList.getSelectionModel().getSelectedIndex());
                pronunciationLabel.setText(model.getCurrentPronunc());
                // set up the phoneme list
                String reading = model.getCurrentPronunc();
                List<String> phonList = new ArrayList<>();
                for (int i = 1; i < reading.length() - 1; i++) {
                    phonList.add("Learn /" + reading.charAt(i) + "/");
                }
                phonemeList.setItems(FXCollections.observableList(phonList));
                phonemeList.getSelectionModel().selectedItemProperty().addListener(phonListSetUp);
            } else {
                pronunciationLabel.setText("");
                phonemeList.setItems(FXCollections.observableList(new ArrayList<>()));
            }
        }
    };

    ChangeListener<String> phonListSetUp = new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
            int chosenPhonIndex = phonemeList.getSelectionModel().getSelectedIndex();
            if (chosenPhonIndex >= 0) {
                doCommand("IPALearn sound " + (chosenPhonIndex + 1));
                phonemeDesc.setText(model.getPhonemeName());
                phonemeExp.setText(model.getPhonemeDesc());
            } else {
                phonemeDesc.setText("");
                phonemeExp.setText("");
            }
        }
    };

    private void doCommand(String command) {
        controller.executeSingleCommand(new StringReader(command));
    }

    @Override
    public void renderSuccess(String type) {
        successMarker.setText(type);
    }

    @Override
    public void renderError(String errorMessage) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Error!");
        window.setMinWidth(250);
        window.setMinHeight(125);

        Label label = new Label();
        label.setText(errorMessage);
        Button closeButton = new Button("Got it.");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}
