/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2programacion2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Leonel Thomas
 */
public class PacientesInfo {
    RandomAccessFile pacientes,rcs;
      public final static long PACIENTES_OFFSET=0;
      public final static long CODIGO_OFFSET=0;
      int cantidad =0;
    public PacientesInfo(){
  
        try{
            rcs = new RandomAccessFile("Archivos/Pacientes/codigosPacientes.med","rw");
            initCodes();
        }catch(IOException e){
    }      
    }
    private void initCodes()throws IOException{
        if(rcs.length()==0){
            rcs.writeInt(1);
            rcs.writeInt(1);
        }
    }
    private int getCode(long offset)throws IOException{
        rcs.seek(offset);
        int code= rcs.readInt();
        rcs.seek(offset);
        rcs.writeInt(code+1);
        return code;
    }
    public long getFinal() throws IOException{
        pacientes.seek(0);
        while(pacientes.getFilePointer() < pacientes.length() ){
            if(pacientes.length()!=0){
                pacientes.readInt();
                pacientes.readUTF();
                pacientes.readUTF();
                pacientes.readUTF();
                pacientes.readInt();
                pacientes.readUTF();
            }
        }
        return pacientes.getFilePointer();
    } 
    public RandomAccessFile pacientes(int cod)throws IOException{
        
    return pacientes=new RandomAccessFile("Archivos/Pacientes/Paciente_"+cod+".med","rw");
    
    }
    
    
    public void write(String Nombre, String Email,String fecha,int telefono, String Historial) throws IOException{
        int cod = getCode(PACIENTES_OFFSET);
        pacientes(cod);
        
        pacientes.seek(0);
        pacientes.writeInt(cod);
        pacientes.writeUTF(Nombre);
        pacientes.writeUTF(Email);
        pacientes.writeUTF(fecha);
        pacientes.writeInt(telefono);
        pacientes.writeUTF(Historial);    
        
    }
    
    
   public boolean findPaciente(int codigo)throws IOException{
       pacientes(codigo);
       pacientes.seek(0);
      
        while(pacientes.getFilePointer()<pacientes.length()){
            if(pacientes.readInt() == codigo){
                return true;
            }
                pacientes.readUTF();
                pacientes.readUTF();
                pacientes.readUTF();
                pacientes.readInt();
                pacientes.readUTF();
        }
        return false;
    }
   
   public String[] Datos(int codigo)throws IOException{
        pacientes(codigo);
       pacientes.seek(0);
        String Vector[] = new String [5];
        while(pacientes.getFilePointer()<pacientes.length()){
          
            int cod = pacientes.readInt();         
            String Nombre =  pacientes.readUTF();
            String Email = pacientes.readUTF();
            String Fecha = pacientes.readUTF();
            int tel = pacientes.readInt();   
            String Historial = pacientes.readUTF();
            
                String tel1 = Integer.toString(tel);
            Vector[0] = Nombre;
            Vector[1] = Email;
            Vector[2] = Fecha;
            Vector[3] = tel1;
            Vector[4] = Historial;
        }
       
       
       return Vector;
   }
   
   public String[][] ListarPacientes()throws IOException{
     
       
        int i =0;
        
        String Matriz[][] = new String [20][5];
        for(int j=1; j<=20;j++ ){
            pacientes(j);
            pacientes.seek(0);
            
            while(pacientes.getFilePointer()<pacientes.length()){
                int cod = pacientes.readInt();
               
                String Nombre =  pacientes.readUTF();
                String Email = pacientes.readUTF();
                String Fecha = pacientes.readUTF();
                int tel = pacientes.readInt();
                pacientes.readUTF();
                String cod1 = Integer.toString(cod);
                String Tel = Integer.toString(tel);
                //Asignar valores a la matris
                Matriz[i][0] = cod1;
                Matriz[i][1] = Nombre;
                Matriz[i][2] = Email;
                Matriz[i][3] = Tel;
                Matriz[i][4] = Fecha;
                i++;
              
            }
            if(!findPaciente(j)){
            return Matriz;
            }
        }
       return Matriz;
   }
}
