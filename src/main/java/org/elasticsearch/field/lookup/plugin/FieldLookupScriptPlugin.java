package org.elasticsearch.field.lookup.plugin;

import org.elasticsearch.field.lookup.script.CosineSimilarityScoreScript;
import org.elasticsearch.field.lookup.script.IsPrimeSearchScript;
import org.elasticsearch.field.lookup.script.LanguageModelScoreScript;
import org.elasticsearch.field.lookup.script.FieldLookupScript;
import org.elasticsearch.field.lookup.script.PhraseScoreScript;
import org.elasticsearch.field.lookup.script.PopularityScoreScriptFactory;
import org.elasticsearch.field.lookup.script.RandomSortScriptFactory;
import org.elasticsearch.field.lookup.script.TFIDFScoreScript;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.script.ScriptModule;

/**
 * This class is instantiated when Elasticsearch loads the plugin for the
 * first time. If you change the name of this plugin, make sure to update
 * src/main/resources/es-plugin.properties file that points to this class.
 */
public class FieldLookupScriptPlugin extends AbstractPlugin {

    /**
     * The name of the plugin.
     * <p/>
     * This name will be used by elasticsearch in the log file to refer to this plugin.
     *
     * @return plugin name.
     */
    @Override
    public String name() {
        return "native-script-example";
    }

    /**
     * The description of the plugin.
     *
     * @return plugin description
     */
    @Override
    public String description() {
        return "Native script examples";
    }

    public void onModule(ScriptModule module) {
        // Register each script that we defined in this plugin
//        module.registerScript("is_prime", IsPrimeSearchScript.Factory.class);
        module.registerScript("field_lookup", FieldLookupScript.Factory.class);
//        module.registerScript("random", RandomSortScriptFactory.class);
//        module.registerScript("popularity", PopularityScoreScriptFactory.class);
//        module.registerScript(TFIDFScoreScript.SCRIPT_NAME, TFIDFScoreScript.Factory.class);
//        module.registerScript(CosineSimilarityScoreScript.SCRIPT_NAME, CosineSimilarityScoreScript.Factory.class);
//        module.registerScript(PhraseScoreScript.SCRIPT_NAME, PhraseScoreScript.Factory.class);
//        module.registerScript(LanguageModelScoreScript.SCRIPT_NAME, LanguageModelScoreScript.Factory.class);
    }
}
