import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class ConsultaLivro {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        var titulo = scan.nextLine().replace(" ","+");

        String chave = "AIzaSyB-ODRV78k71TdNzvCB1ULkzoTCV6so5_Q";

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + titulo + "&key" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder().uri(URI.create(endereco)).build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        scan.close();
    }
}
