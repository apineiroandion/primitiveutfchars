import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String cadea = "Está en casa";
        FileInputStream fis = new FileInputStream("/home/dam/Documentos/texto6.txt");
        FileOutputStream fos = new FileOutputStream("/home/dam/Documentos/texto6.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataInputStream dis = new DataInputStream(bis);
        DataOutputStream dos = new DataOutputStream(bos);
        escribir(dos, cadea);
        leer(dis, cadea);
    }
    /**
     * Metodo que escribe as cadeas
     */
    public static void escribir(DataOutputStream dos, String cadea) throws IOException {
        dos.writeUTF(cadea);
        System.out.println("Se esta escribindo: " + cadea);
        System.out.println("Levanse escritos " + dos.size() + " bytes");
        dos.writeChars(cadea);
        System.out.println("Se esta escribindo: " + cadea);
        System.out.println("Levanse escritos " + dos.size() + " bytes");
        dos.writeUTF(cadea);
        System.out.println("Se esta escribindo: " + cadea);
        System.out.println("Levanse escritos " + dos.size() + " bytes");
        dos.close();
    }
    /**
     * Metodo que lee as cadeas
     */
    public static void leer(DataInputStream dis, String cadea) throws IOException {
        System.out.println("Quedan por ler " + dis.available() + " bytes");
        int contador = 0;
        while (dis.available() > 0) {
            contador++;
            if (contador == 1) {
                System.out.print("leemos a primeira cadea: ");
                System.out.println(dis.readUTF());
                System.out.println("Quedan por ler " + dis.available() + " bytes");
            }
            if (contador == 2) {
                System.out.print("leemos a segunda cadea: ");
                for (int i = 0; i < cadea.length(); i++) {
                    System.out.print(dis.readChar());
                    if (i == cadea.length() - 1) {
                        System.out.println();
                    }
                }
                System.out.println("Quedan por ler " + dis.available() + " bytes");
            }
            if (contador == 3) {
                System.out.print("leemos a terceira cadea: ");
                System.out.println(dis.readUTF());
                System.out.println("Quedan por ler " + dis.available() + " bytes");
            }
        }
    }
}
