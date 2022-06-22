import java.util.*;

public class CollectionUtils {
    public static  Collection<String> filterPhones(Collection<String> phones, Collection<String> blacklist){
        for (String phoneNumber : blacklist){
            if (phones.contains(phoneNumber)){
                phones.remove(phoneNumber);
            }
        }
        return phones;
    }
}
