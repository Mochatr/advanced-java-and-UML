import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String clientIP = clientSocket.getInetAddress().getHostAddress();
        
        // Affichage requis par le TP
        System.out.println("Thread " + threadName + " traite le client");

        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String inputLine;
            // Lecture des messages envoyés par Telnet
            while ((inputLine = in.readLine()) != null) {
                inputLine = inputLine.trim();
                System.out.println("Message reçu: " + inputLine);

                // Réponses selon les règles définies
                if (inputLine.equalsIgnoreCase("hello")) {
                    out.println("Bonjour client !");
                } else if (inputLine.equalsIgnoreCase("time")) {
                    String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    out.println(now);
                } else if (inputLine.equalsIgnoreCase("bye")) {
                    out.println("Connexion fermée");
                    break; // Sort de la boucle pour fermer uniquement cette connexion
                } else {
                    out.println("Message reçu: " + inputLine);
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur avec le client " + clientIP + " : " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Erreur lors de la fermeture du socket: " + e.getMessage());
            }
        }
    }
}