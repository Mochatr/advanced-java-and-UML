import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadServer {
    private static final int PORT = 5000;
    private static final int MAX_THREADS = 5;

    public static void main(String[] args) {
        // Création du pool de threads fixe
        ExecutorService pool = Executors.newFixedThreadPool(MAX_THREADS);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Serveur TCP démarré sur le port " + PORT);

            // Attente des connexions dans une boucle infinie
            while (true) {
                Socket clientSocket = serverSocket.accept();
                
                // Affichage de l'adresse IP du client lors de la connexion
                System.out.println("Client connecté: " + clientSocket.getInetAddress().getHostAddress());
                
                // Soumet la gestion du client au pool de threads
                pool.execute(new ClientHandler(clientSocket));
            }
        } catch (IOException e) {
            System.err.println("Erreur sur le serveur principal : " + e.getMessage());
        } finally {
            pool.shutdown();
        }
    }
}