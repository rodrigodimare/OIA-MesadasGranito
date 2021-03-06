import java.io.*;

public class app {
    public static void main(String[] args) throws IOException {
        int i=0;
        int cantidadMesadas = 0;
        File f = new File("mesadas.in");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String lineaArchivo;
        if((lineaArchivo=br.readLine())!=null){
            cantidadMesadas = Integer.parseInt(lineaArchivo);
        }
        PilaMesada pilaMesada = new PilaMesada();
        while(i<cantidadMesadas && (lineaArchivo=br.readLine())!=null){
            String arrayMesada[] = lineaArchivo.split(" ");
            int anchoMesada = Integer.parseInt(arrayMesada[0]);
            int largoMesada = Integer.parseInt(arrayMesada[1]);
            pilaMesada.apilarMesada(new Mesada(anchoMesada,largoMesada));
            i++;
        }
        br.close();
        //Descomentar para ver el mensaje por consola.
        System.out.println(pilaMesada.contarElementosLista());

        File file = new File("mesadas.out");
        if (!file.exists()) {
            file.createNewFile();//Crear archivo.
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Integer.toString(pilaMesada.contarElementosLista()));
        bw.close();
    }
}
