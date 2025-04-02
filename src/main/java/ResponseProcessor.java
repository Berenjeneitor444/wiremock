import com.github.tomakehurst.wiremock.extension.ResponseTransformerV2;
import com.github.tomakehurst.wiremock.http.Response;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;

public class ResponseProcessor implements ResponseTransformerV2 {

    @Override
    public Response transform(Response response, ServeEvent serveEvent) {
        String ResponseBody = "";
        DataProcessor dataProcessor = new DataProcessor();
        switch (serveEvent.getRequest().getUrl()){
            case "reserva/crear": ResponseBody = dataProcessor.process(serveEvent.getRequest().getBody());
            case "reserva/listar":;
            case "huesped/crear":;
            case "huesped/listar":;
        }
        //TODO: PASAR JSON DIRECTO O NO, COMO MANEJO LOS DATOS EN EL DATAPROCESOR, QUE TIPO DEBEN TENER, ETC...
        return Response.Builder.like(response).but().body(ResponseBody).build();
    }

    @Override
    public String getName() {
        return "data-processor";
    }
}
