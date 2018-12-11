/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2programacion2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Leonel Thomas
 */
public class CitasD {
    RandomAccessFile citas,rcs;
      public final static long CODE_OFFSET=0;
    public CitasD(){
  
        try{
            rcs = new RandomAccessFile("Archivos/Citas/CodigosCitas.med","rw");
            citas=new RandomAccessFile("Archivos/Citas/Citas.med","rw");
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
        citas.seek(0);
        while(citas.getFilePointer() < citas.length() ){
            if(citas.length()!=0){
                citas.readInt();
                citas.readInt();
                citas.readInt();
                citas.readLong();
                citas.readUTF();
                citas.readUTF();
                citas.readInt();
                citas.readDouble();
            }
        }
        return citas.getFilePointer();
    } 
    public void write(int codPaciente, int codDoctor, long fecha, String descripcion,String tipoCita) throws IOException{
        citas.seek(getFinal());
        
        int cod = getCode(CODE_OFFSET);
        citas.writeInt(cod);
        citas.writeInt(codPaciente);
        citas.writeInt(codDoctor);
        citas.writeLong(fecha);
        citas.writeUTF(descripcion);
        citas.writeUTF(tipoCita);
        citas.writeInt(1);
        citas.writeDouble(0);
    }
    
    public boolean findCita(int codigo)throws IOException{
        citas.seek(0);
      
        while(citas.getFilePointer()<citas.length()){
            if(citas.readInt() == codigo){
                return true;
            }
               citas.skipBytes(8);
               citas.readLong();
               citas.readUTF();
               citas.readUTF();
               citas.skipBytes(12);
        }
        return false;
    }
    
    public boolean EditDate(int code, long date)throws IOException{
        if(findCita(code)){
            citas.skipBytes(8);
            citas.writeLong(date);
            citas.readUTF();
            citas.readUTF();
            citas.skipBytes(12);
        
        }
    
        return false;
    }
    
    public String[] mostrarCita(int code)throws IOException{
        String Vector[] = new String[7];
        
        if(findCita(code)){
            int codPaciente = citas.readInt(); 
            int codDoctor = citas.readInt(); 
            long fecha = citas.readLong();
            String descripcion = citas.readUTF();
            String tipoCita = citas.readUTF();
            int estado = citas.readInt();
            double monto = citas.readDouble();
            
                DateFormat df = new SimpleDateFormat("yyyyMMdd");
                String date = df.format(fecha);
                
                String codPaciente1 = Integer.toString(codPaciente);
                String codDoctor1 = Integer.toString(codDoctor);
                String monto1 = String.valueOf(monto);
                String estado1 = "Pendiente";
                if(estado == 2){
                estado1 = "Cancelada";
                }
                if(estado == 3){
                estado1 = "Atendida";
                }
                
            Vector[0] = codPaciente1;
            Vector[1] = codDoctor1;
            Vector[2] = date;
            Vector[3] = descripcion;
            Vector[4] = tipoCita;
            Vector[5] = estado1;
            Vector[6] = monto1;
            
            
        }
        return Vector;
    }
    
    public boolean CancelarCita(int cod)throws IOException{
        if(findCita(cod)){
            citas.skipBytes(8);
            citas.readLong();
            citas.readUTF();
            citas.readUTF();
            citas.writeInt(2);
            citas.readDouble();
            return true;
        
        }
        return false;
    }

    
}
