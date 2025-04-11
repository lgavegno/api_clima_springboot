package model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clima")
public class Clima {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ciudad;
    private Float temperatura;
    private String descripcion;
    private LocalDate fecha;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public Float getTemperatura() { return temperatura; }
    public void setTemperatura(Float temperatura) { this.temperatura = temperatura; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
