package org.audiveris.lite;

import org.audiveris.omr.Main;

public class AudiverisLite {

    /**
     * Executa o Audiveris em modo batch, convertendo uma imagem em MusicXML.
     *
     * Exemplo:
     *   java -jar audiveris-lite.jar "C:\partituras\mozart.png"
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Uso: java -jar audiveris-lite.jar <arquivo-imagem>");
            System.exit(1);
        }

        try {
            String inputPath = args[0];
            System.out.println("🎵 Convertendo " + inputPath + " para MusicXML...");

            // Invoca o Audiveris como se fosse em linha de comando
            String[] batchArgs = {
                "-batch",
                "-export",
                inputPath
            };

            Main.main(batchArgs);

            System.out.println("✅ Conversão concluída com sucesso!");
        } catch (Exception e) {
            System.err.println("❌ Erro durante o processamento: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
