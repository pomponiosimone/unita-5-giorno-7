package pomponiosimone.unita_giorno_7.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BlogPost
{
    private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    //to string
    @Override
    public String toString() {
        return "BlogPost{" +
                "categoria='" + categoria + '\'' +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", cover='" + cover + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", tempoDiLettura=" + tempoDiLettura +
                '}';
    }
}
