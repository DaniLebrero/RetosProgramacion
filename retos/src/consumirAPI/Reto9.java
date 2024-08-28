package consumirAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Reto9 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon?limit=10000/");
        try {
            conexAPI(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void conexAPI(URL url) throws IOException {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        // Procesar la respuesta como texto
        String response = content.toString();
        String[] results = response.split("\\{\"name\":\"");

        for (int i = 1; i < results.length; i++) {
            String pokemonName = results[i].split("\"")[0];
            System.out.println("#" + i + " " + pokemonName);
        }
    }
}
