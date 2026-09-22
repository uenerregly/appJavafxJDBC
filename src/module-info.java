module a379_appJavafxJdbc {
	requires javafx.controls;
	requires javafx.fxml;

	opens application to javafx.graphics, javafx.fxml;

	opens gui to javafx.fxml;

	exports gui;
}
