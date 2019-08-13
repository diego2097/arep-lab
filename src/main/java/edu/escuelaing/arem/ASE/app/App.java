package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;


public class App 
{
    public static void main( String[] args ) throws IOException 
    {
        /*calculo("C:/Users/USUARIO/Documents/lab/prueba.txt");
        calculo("C:/Users/USUARIO/Documents/lab/prueba2.txt");*/
    }
    
     /**
     * Este metodo se encarga de leer los datos y realizar las operaciones respectivas para calcular la media y las desviacion
     * estandar
     * @param path direccion del archivo 
     * @throws FileNotFoundException si la direccion es incorrecta, y por lo tanto no se encuentra el archivo
     * @throws IOException si ocurre un error en la entrada/salida
     */
    public static ArrayList<Double> calculo(String path)throws FileNotFoundException, IOException{  
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
        /*System.out.println("la media es: "+media);*/
        
        double numerador=0;
        for (int i=0; i<lista.size();i++){
            numerador+=Math.pow(lista.get(i)-media,2);
        }
        double desv=Math.sqrt(numerador/(lista.size()-1));
        /*System.out.println("la desviacion estandar es: "+desv);*/
        ArrayList<Double> rta  = new ArrayList<Double>();
        rta.add(media);
        rta.add(desv);
        return rta; 
    }
}