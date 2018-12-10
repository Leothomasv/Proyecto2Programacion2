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
public class UsuariosDatos {
    RandomAccessFile usuarios;
    File fichero = new File("Archivos/Usuarios/Usuarios.med");
    public UsuariosDatos(){
        try{
            
           usuarios=new RandomAccessFile(fichero,"rw");
        }catch(IOException e){
        }
    }
    public long getFinal() throws IOException{
        usuarios.seek(0);
        while(usuarios.getFilePointer() < usuarios.length() ){
            if(usuarios.length()!=0){
                usuarios.readUTF();
                usuarios.readUTF();
                usuarios.readUTF();
            }
        }
        return usuarios.getFilePointer();
    } 
    public void write(String Nombre, String Usuario, String Contrasena) throws IOException{
        usuarios.seek(getFinal());
        
        
        usuarios.writeUTF(Nombre);
        usuarios.writeUTF(Usuario);
        usuarios.writeUTF(Contrasena);
        
    }
    
    public String[][] Listar( )throws IOException{
        usuarios.seek(0);
        String  matriz[][] = new String[20][2];
        int i=0;
        while(usuarios.getFilePointer()<usuarios.length()){
        String Nombre =  usuarios.readUTF();
        String Usuario = usuarios.readUTF();
        usuarios.readUTF();
          matriz[i][0] = Nombre;
          matriz[i][1] = Usuario;
          i++;
        }
        return matriz;
    }
    
    public String[] MostrarDatos(String user )throws IOException{
        usuarios.seek(0);
        String  vector[] = new String[2];
        while(usuarios.getFilePointer()<usuarios.length()){
        String Nombre =  usuarios.readUTF();
        String Usuario = usuarios.readUTF();
        String Contrasena = usuarios.readUTF();
        if(user.equals(Usuario)){
        
          vector[0] = Nombre;
          vector[1] = Contrasena;
          return vector;
         }
        }
        return null;
    }
    
    
    public boolean Verificar(String Nombre, String contrasena)throws IOException{
        usuarios.seek(0);
        
        while(usuarios.getFilePointer() < usuarios.length()){
            usuarios.readUTF();
            String us = usuarios.readUTF();
            String contra = usuarios.readUTF();
            if(Nombre.equals(us) && contrasena.equals(contra)){
                return true;
            }
        }
        return false;
    }
    
    public boolean VerificarUsuario(String Nombre)throws IOException{
        usuarios.seek(0);
        
        while(usuarios.getFilePointer() < usuarios.length()){
            usuarios.readUTF();
            String us = usuarios.readUTF();
            usuarios.readUTF();
            if(Nombre.equals(us)){
                return false;
            }
        }
        return true;
    }
    
    public boolean Modificar(String us, String contra, String nom)throws IOException{
        
    String  matriz[][] = new String[20][3];
    int i=0; 
    int contador =1;
    while(usuarios.getFilePointer()<usuarios.length()){
    String Nombre =  usuarios.readUTF();
    String Usuario = usuarios.readUTF();
    String contrasena = usuarios.readUTF();
      matriz[i][0] = Nombre;
      matriz[i][1] = Usuario;
      matriz[i][2] = contrasena;
      i++;
      contador++;
    }
        usuarios.close();
        fichero.delete();  
    for(int f=0; f < i;f++){
        if(matriz[f][1].equals(us)){
            matriz[f][0] = nom;
            matriz[f][2] = contra;

        }
    }
    
   usuarios=new RandomAccessFile(fichero,"rw");
    usuarios.seek(getFinal());
    for(int j =0;j<contador;j++){
        usuarios.writeUTF(matriz[j][0]);
        usuarios.writeUTF(matriz[j][1]);
        usuarios.writeUTF(matriz[j][2]);
        return true;
    }
    
       return false;   
    }
}
