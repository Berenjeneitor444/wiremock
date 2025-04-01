import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.WireMockServer;

public class MockServerManager {
    private WireMockServer wireMockServer;

    public WireMockServer getServer() {
        return wireMockServer;
    }
    // Inicia el servidor

    public void startServer() {
        WireMockConfiguration config = WireMockConfiguration.options().port(8080);
        wireMockServer = new WireMockServer(config);
        wireMockServer.start();
        System.out.println("WireMock Server started on port 8080");
    }
    // Detiene el servidor

    public void stopServer() {
        if (wireMockServer != null) {
            wireMockServer.stop();
            System.out.println("WireMock Server stopped.");
        }
    }
}
