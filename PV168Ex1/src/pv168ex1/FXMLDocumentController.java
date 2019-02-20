/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv168ex1;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Matouš
 */
public class FXMLDocumentController implements Initializable {
    

    ObservableList<Course> courses = FXCollections.observableArrayList();
    @FXML
    private TableView<Course> tw2;
    @FXML
    private TableColumn<Course, String> idcol;
    @FXML
    private TableColumn<Course, String> ncol;
    @FXML
    private TableColumn<Course, String> rcol;
    @FXML
    private ListView<Student> lw;
    @FXML
    private Label idL;
    @FXML
    private Label nL;
    @FXML
    private Label rL;
    @FXML
    private Label tL;
    @FXML
    private AnchorPane pane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pane.setMinWidth(600);
        
        idcol.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getId()));
        ncol.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getName()));
        rcol.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getRoom()));
        
        Person p1 = new Person("Jane", "Doe", new Date(1996,5,2), Gender.FEMALE);
        Person p2 = new Person("Barack", "Obama", new Date(1999,8,2), Gender.MALE);
        Person p3 = new Person("Milos", "Zeman", new Date(1994,5,12), Gender.MALE);
        Student s1 = new Student(p1);
        Student s2 = new Student(p2);
        Teacher t1 = new Teacher(p3);
        List<Student> students = new ArrayList<>();
        students.add(s1); students.add(s2);
        Course c = new Course(t1, students, "PV168","Seminar z Javy", "B130"); 

        courses.add(c);
        
        tw2.setItems(courses);
        
        tw2.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            lw.setItems(FXCollections.observableArrayList(newValue.getStudents()));
            idL.setText(newValue.getId());
            nL.setText(newValue.getName());
            rL.setText(newValue.getRoom());
            tL.setText(newValue.getTeacher().toString());
        });
        
    }    
    
}
