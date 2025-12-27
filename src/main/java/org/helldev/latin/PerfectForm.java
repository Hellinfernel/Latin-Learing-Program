package org.helldev.latin;

import java.util.Map;

public abstract class PerfectForm {
    private String infiniteSuffix;
    private String stem;

    private PerfectForm(){
    }

    public PerfectForm(String stem, String infiniteSuffix) {
        this.stem = stem;
        this.infiniteSuffix = infiniteSuffix;
    }

    public abstract Map<VerbProperties,String> getSuffixes();

    public String getInfiniteSuffix() {
        return infiniteSuffix;
    }

    public String getStem() {
        return stem;
    }
}
