package org.helldev.latin;

import java.util.Map;

public class NullForm extends PerfectForm{
    public NullForm() {
        super("stem", "infiniteSuffix");
    }

    //Dont do this, I just want to get the tests functional that i broke with the constructor changes.
    @Override
    public Map<VerbProperties, String> getSuffixes() {
        return Map.of();
    }
}
