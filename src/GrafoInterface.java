/**
 * Clase que implementara la interfaz del Grafo
 * @author José Mariano Reyes
 */
public interface GrafoInterface  <K,E>{
    /**
     * Metodo para agregar etiquetas a la matriz
	 * @param label
	 */
    public void add(K label);

    /**
     * Agregar subgrafo
     */
    public void addEdge(K ciudad1, K ciudad2, E label);

    public void show();

    public int getIndex(K label);

    /**
     *
     * @param label
     * @return la etiqueta dependiendo de la posicion de la matriz
     */
    public K get(int label);

    /**
     *
     * @param ciudad1
     * @param ciudad2
     * @return la distancia
     */
    public int getEdge(K ciudad1, K ciudad2);

    public boolean contains(K label);

    public int size();
}
