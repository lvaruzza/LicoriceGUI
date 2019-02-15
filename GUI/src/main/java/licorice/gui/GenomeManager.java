package licorice.gui;

import licorice.analysis.Analysis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class GenomeManager {
    private static Logger logger = LoggerFactory.getLogger(GenomeManager.class);

    private File genomesDir;
    private File[] files;

    public GenomeManager(String path) {
        genomesDir = new File(path);
        logger.info(String.format("dir: '%s'",genomesDir.getAbsolutePath()));
        files = genomesDir.listFiles((File file, String s) -> s.endsWith(".fasta"));
        if (files==null) {
            logger.error("No Reference found");
            System.exit(-1);
        } else {
            for (int i = 0; i < files.length; i++) {
                logger.info(String.format("Found genome '%s'", files[i]));
            }
        }
    }

    public String[] listGenomes() {
        return  Arrays.stream(files).map(f -> f.getName()).toArray(size ->new String[size]);
    }
}
