import java.io.*;

public class LectorArchivos {
    File file;
    FileReader filer;
    BufferedReader buffer;
    FileWriter escritura;
    PrintWriter impresion;
    GrafoInterface graf = new Grafo();

    public void ReadFile(String direccion) throws FileNotFoundException {
        file= new File(direccion);
        filer = new FileReader(file);
        buffer = new BufferedReader(filer);
        String linea;
        try {
            while((linea=buffer.readLine())!=null) {
                String[] word;
                word = linea.split(" ");
                graf.add(word[0]);
                graf.add(word[1]);
            }
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }

    }
    /**
     *
     * @return Los arcos
     * @throws IOException
     */
    public GrafoInterface<String, String> arreglosN() throws IOException{
        filer = new FileReader(file);
        buffer = new BufferedReader(filer);
        String linea;
        while ((linea = buffer.readLine())!=null) {
            String[] arc;
            arc=linea.split(" ");
            graf.addEdge(arc[0], arc[1], arc[2]);
        }
        return graf;
    }
    /**
     * Escribe el archivo de texto
     * @param cadena
     * @throws IOException
     */
    public void Write(String cadena) throws IOException {
        escritura = new FileWriter(file);
        impresion = new PrintWriter(escritura);
        impresion.println(cadena);
    }

    public GrafoInterface<String, String> CostoM() throws IOException{
        // Lectura del fichero
        filer = new FileReader (file);
        buffer = new BufferedReader(filer);
        String linea;

        while((linea=buffer.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            graf.addEdge(tmp[0], tmp[1], tmp[2]);
        }
        return graf;
    }
}
