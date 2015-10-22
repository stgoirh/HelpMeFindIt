/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodostrabajo;

/**
 *
 * @author stgoirh
 */
public class MetodosTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public String ubicacion(){
        //el usuario escioje una iopcion segun donde este
        return opcionUbicacion;
    }
    public String llegadaMicros(){
        //el usuario elija la entrada de la ufro a la que quiere ir
        return opcionUbicacion;
    }
    public void llenar(boolean arreglo[]){
        //llena el arreglo llamando a los metodos de mircros
        boolean micros[]= new boolean[12];
        for(int i=0;i<arreglo.length;i++){
            micros[i]=metodoMicros();
        }
        return micros[];
    }
    public String tomarMicro(boolean micros[]){
        for(int j=0;j<micros.length;j++){
            if(micros[j]==true){
                //muestra los verdaderos en una interfaz
            }
        }
        //salida numero de micro
        return;
    }
    public void mapaRecorrido(String micro){
        //mostrar mapa segun micro
    }
    public boolean micros(String opcionUbicacion,String opcionLlegada){ //X12
        //compara los parametros y entrega un true o false
        if(opcionUbicacion==opcionLLegada){
            boolean microSirve1=true;
        }
        return microSirve1;
    }
    public String lugarDepartamento(String opcionLlegada){
        //obtiene un mapa segun la salida y micro en que este y puede elejir un
        //departamento al que quiere llegar
        return opcionLugarDepartamento;
    }
    public void mapasUfro(opcionLugarDepartamento){
        //muestra un mapa con un recorrido segun la opcion escojida en el metodo anterior
    }
    
}
