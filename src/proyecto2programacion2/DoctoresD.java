/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2programacion2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * 
 */
public class DoctoresD {
      RandomAccessFile Doctores,rcs;
      public final static long SONG_OFFSET = 0;
    public DoctoresD(){
  
        try{
            rcs = new RandomAccessFile("Archivos/Doctores/CodigosDoctores.med","rw");
            Doctores = new RandomAccessFile("Archivos/Doctores/Doctores.med","rw");
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
        Doctores.seek(0);
        while(Doctores.getFilePointer() < Doctores.length() ){
            if(Doctores.length()!=0){
                Doctores.readInt();
                Doctores.readUTF();
                Doctores.readUTF();
                Doctores.readUTF();
                Doctores.readInt();
                Doctores.readDouble();
                Doctores.readBoolean();
            }
        }
        return Doctores.getFilePointer();
    } 
    public void write(String Nombre, String Email, int telefono,String especialidad, double honorarios) throws IOException{
        Doctores.seek(getFinal());
        
        int cod = getCode(SONG_OFFSET);
        Doctores.writeInt(cod);
        Doctores.writeUTF(Nombre);
        Doctores.writeUTF(Email);
        Doctores.writeUTF(especialidad);
        Doctores.writeInt(telefono);
        Doctores.writeDouble(honorarios);
        Doctores.writeBoolean(true);
        
        
    }
    public boolean verificarDoctor(String email)throws IOException{
        Doctores.seek(0);
        while(Doctores.getFilePointer()<Doctores.length()){
                Doctores.readInt();
                Doctores.readUTF();
                String w=Doctores.readUTF();
                Doctores.readUTF();
                Doctores.readInt();
                Doctores.readDouble();
                Doctores.readBoolean();
                if(w.equals(email)){
                return false;
                }
                
        }
        return true;
    }
    
    public boolean findDoctor(int codigo)throws IOException{
        Doctores.seek(0);
      
        while(Doctores.getFilePointer()<Doctores.length()){
            if(Doctores.readInt() == codigo){
                return true;
            }
                Doctores.readUTF();
                Doctores.readUTF();
                Doctores.readUTF();
                Doctores.skipBytes(12);
                Doctores.readBoolean();
        }
        return false;
    }
    
    public boolean Desactivar(int codigo)throws IOException{
        if(findDoctor(codigo)){
            Doctores.readUTF();
            Doctores.readUTF();
            Doctores.readUTF();
            Doctores.skipBytes(12);
            Doctores.writeBoolean(false);
            return true;
        }
        return false;
    }
    public boolean Activar(int codigo)throws IOException{
        if(findDoctor(codigo)){
            Doctores.readUTF();
            Doctores.readUTF();
            Doctores.readUTF();
            Doctores.skipBytes(12);
            Doctores.writeBoolean(true);
            return true;
        }
        return false;
    }
    
    
    public boolean ModificarHonorario(int codigo, double honorario)throws IOException{
        if(findDoctor(codigo)){
            Doctores.readUTF();
            Doctores.readUTF();
            Doctores.readUTF();
            Doctores.readInt();
            Doctores.writeDouble(honorario);
            Doctores.readBoolean();
            return true;
        }
        return false;
    }
    
    public String[][] ImprimirDoctores()throws IOException{
       Doctores.seek(0);
       int i=0;
       String Matriz[][] = new String [20][5];
        while(Doctores.getFilePointer()<Doctores.length()){
            
            
            int cod = Doctores.readInt();
            String nombre =  Doctores.readUTF();
            String email =  Doctores.readUTF();
            String Especialidad = Doctores.readUTF(); 
            int telefono = Doctores.readInt();  
            double honorarios = Doctores.readDouble();
            boolean activo = Doctores.readBoolean();
            if(activo){
                String codigo1 = Integer.toString(cod);
                String tel = Integer.toString(telefono);
                               
              Matriz[i][0] = codigo1;  
              Matriz[i][1] = nombre;
              Matriz[i][2] = email;
              Matriz[i][3] = tel;
              Matriz[i][4] = Especialidad;
                i++;             
            }   
        }
          
          return Matriz;
    }
        
}
