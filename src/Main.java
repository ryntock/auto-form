import java.awt.Desktop;
import java.net.URI;

// Main.java
public class Main {
    public static void main(String[] args) {
        // URL de la page que vous souhaitez ouvrir
        String url = "https://forms.office.com/pages/responsepage.aspx?id=W4e0qGZ2akWv_4g7sTU3K-JbjpXvC8ROjaIzoagjn1VURUpPQTlHWUpVSFhPMkczV01TNENSNUM5US4u";

        // Créer une instance de la classe Page avec l'URL
        Page myPage = new Page(url);

        // Ouvrir la page Internet dans le navigateur par défaut
        openWebpage(url);
    }

    // Méthode pour ouvrir une page Internet dans le navigateur par défaut
    private static void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}