package licorice.gui;

import licorice.analysis.Analysis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenomeManager {
    private static Logger logger = LoggerFactory.getLogger(GenomeManager.class);

    private File genomesDir;
    private File[] files;
    private Map<String,Integer> map;

    public GenomeManager(String path) {
        genomesDir = new File(path);
        logger.info(String.format("dir: '%s'",genomesDir.getAbsolutePath()));
        files = genomesDir.listFiles((File file, String s) -> s.endsWith(".fasta"));
        map = new HashMap<String,Integer>();

        if (files==null) {
            logger.error("No Reference found");
            System.exit(-1);
        } else {
            for (int i = 0; i < files.length; i++) {
                map.put(files[i].getAbsolutePath(),i);
                logger.info(String.format("Found genome '%s'", files[i]));
            }
        }
    }

    public int getIndex(String fileName) {
        File genomePath=(new File(fileName)).getAbsoluteFile();
        if(map.containsKey(genomePath)) {
            int idx = map.get(genomePath);
            logger.info(String.format("Genome file '%s' idx = %d", genomePath, idx));

            return idx;
        } else {
            return 0;
        }
    }
    public String[] listGenomes() {
        return  Arrays.stream(files).map(f -> f.getName()).toArray(size ->new String[size]);
    }

    public String getFilename(int selectedIndex) {
        return files[selectedIndex].getAbsolutePath();
    }
}
