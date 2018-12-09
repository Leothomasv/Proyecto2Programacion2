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
 * @author Leonel Thomas
 */
public class Users {
   RandomAccessFile users;
    public Users(){
  
        try{
            new File("Users").mkdirs();
            users=new RandomAccessFile("Users/usuarios.med","rw");

        }catch(IOException e){
    }
    
}
    public long getFinal() throws IOException{
        users.seek(0);
        while(users.getFilePointer() < users.length() ){
            if(users.length()!=0){
                
                users.readUTF();
                users.readUTF();
                users.readBoolean();             
            }
        }
        return users.getFilePointer();
    } 
    public void write(String nombre, String user, String contra) throws IOException{
        users.seek(getFinal());
        users.writeUTF(user);
        users.writeUTF(contra);
        users.writeUTF(nombre);
    
        
        
    }
    public int findeUser(String usuario, String contrasena)throws IOException{
        users.seek(0);
        String user, pass;
        
        while(users.getFilePointer()<users.length()){
            user = users.readUTF();
            pass = users.readUTF();
           
            if(user.equals(usuario) && pass.equals(contrasena) )
                return 1;
        }
        return 0;
    }
    
    public boolean Verificar(String usuario)throws IOException{
        users.seek(0);
        
        while(users.getFilePointer() < users.length()){
            users.readUTF();
            String us = users.readUTF();
            users.readUTF();
            if(usuario.equals(us)){
                return false;
            }
        }
        return true;
    }
    
    public boolean findUserUsado(String usuario, String contraseña) throws IOException{
    users.seek(0);
    String user,password,fullname;
    while(users.getFilePointer()<users.length()){
    user=users.readUTF();
    password=users.readUTF();
    users.readInt();
        if (user.equals(usuario))
         return true;
    }
    return false;
   }
}
