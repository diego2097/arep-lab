package edu.escuelaing.arem.ASE.app;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class App {

    public static void main( String[] args ) throws IOException   {
    }
    
    
     /**
     * Este metodo se encarga de leer los datos y realizar las operaciones respectivas para calcular la media y las desviacion
     * estandar
     * @param path direccion del archivo 
     * @throws FileNotFoundException si la direccion es incorrecta, y por lo tanto no se encuentra el archivo
     * @throws IOException si ocurre un error en la entrada/salida
     */
    public static LinkedList<Double> calculo(String path)throws FileNotFoundException, IOException{  
        String cadena;
        FileReader f = new FileReader(path);
        BufferedReader b = new BufferedReader(f);
        int n=0;
        float suma=0;
		
        LinkedList<Double> lista = new LinkedList<Double>();
        while((cadena = b.readLine())!=null) {      
            n++;
            Double number = Double.parseDouble(cadena);
            lista.add(number);
            suma+=number;
        }
        b.close();  
		
        double media=suma/n;
        double numerador=0;
        for (int i=0; i<lista.size();i++){
            numerador+=Math.pow(lista.get(i)-media,2);
        }
        double desv=Math.sqrt(numerador/(lista.size()-1));
        LinkedList<Double> rta  = new LinkedList<Double>();
        rta.add(media);
        rta.add(desv);
        return rta; 
    }
}