
package com.example.newsfinder;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class NewsController {
    @FXML
    private TextField countryField;
    @FXML
    private ListView<Article> articleListView;

    @FXML
    private void searchNews() {
        String country = countryField.getText();
        List<Article> articles = NewsApiUtils.getTopHeadlines(country);
        articleListView.getItems().setAll(articles);
    }
}