package service;

import java.util.HashMap;
import java.util.Map;

public class TranslateService implements ITranslateService {
   static Map<String, String> dictionary;
    static {
        dictionary = new HashMap<>();
        dictionary.put("dog", "con cho");
        dictionary.put("cat", "con meo");
        dictionary.put("chicken", "con ga");
        dictionary.put("house", "ngoi nha");
        dictionary.put("duck", "con vit");
        dictionary.put("lion", "con ho");
    }
    @Override
    public String getValueByKey(String key) {
        String result = dictionary.get(key);
        return result;
    }
}
