package service;


import repository.ClimaRepository;
import model.Clima;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class ClimaService {

    @Value("${openweathermap.apikey}")
    private String apiKey;

    private final ClimaRepository climaRepository;

    public ClimaService(ClimaRepository climaRepository) {
        this.climaRepository = climaRepository;
    }

    public Clima obtenerYGuardarClima(String ciudad) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" +
                ciudad + "&appid=" + apiKey + "&units=metric&lang=es";

        RestTemplate restTemplate = new RestTemplate();
        Map datos = restTemplate.getForObject(url, Map.class);

        Float temperatura = ((Number) ((Map) datos.get("main")).get("temp")).floatValue();
        String descripcion = (String) ((Map) ((List) datos.get("weather")).get(0)).get("description");

        Clima clima = new Clima();
        clima.setCiudad(ciudad);
        clima.setTemperatura(temperatura);
        clima.setDescripcion(descripcion);
        clima.setFecha(LocalDate.now());

        return climaRepository.save(clima);
    }
}

