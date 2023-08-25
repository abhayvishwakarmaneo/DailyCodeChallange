package gfg.problems.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] arr = {"lopuvndzymqhfjbhgxfueaoesngtjaywopqlcwlciblqkmxsmcosecxwrfsbfqxwfqhjmsmwvxohmmzaqnsvrrtjxlmeb", "aidisrcgoyfcfrqhrhumcodxzcjnhmahverpvuxlucqzwign", "dzttfruhahqohyjlrajnxwhcojyxrlmwnipsbjbdssrasdnjdyzdvifjrdijqvfffxxg", "bjbtadnfsyjrxoogtzxyiiofqukptsx", "darffelyduraifideibmqrrindxhxxfaxxgfb", "denuhxbpafxduqunyityrqxwrwvxbxqedfakcbaehzhdpdqqnjqeandtjyslxirbpsnrtpxcpefgjyyxjodldiep", "waggtjvlxohmljdrrkbriaazfmeostxrtfxnrvaolhcxtgqmstdatfbztgpmzmdvtckkxk", "judipja", "bugdplhqfnfrotwjnytxygyjadtrotspnyudlbvqqbjfufojgkjeqjpsmijabbrrblwoprffsqkpyzyejh", "bqztejcekfxbilxwapdfjusyurzacikfblyfu", "mgjjiruhpwytcipwijphjrqvyriyycakklwsesctpaotkdptoecxxuuvnctmgvyrgwlmr", "fgqubczqvowanvwiskmlytiymqxxconjwdfxffpdvnfkibuanhnlcvmo", "jlrzyavdis", "nhokutuewpekyrxaolodwzuvawqdeiotrednxarwrxipofpetfhpedlgcbmgmaadffrehkcyiknyscflho", "osnwupicbjegqkxwrkzqsjfsdkxotmrheegavocyzhfrteo", "oneiykbcuysnklxqsdqntvotetmxxajopoyqazuuamjkaidsnvhhqvcuootordegtcyvcspchaohjtbwp", "ffehcsyxipamxvp", "qtqhvzklitfjrusxbwgfqgdzxfnxdcvtvndsnnevilf", "fzyivhqlpt", "naakdehzcwcujrahzloasnzdiitvx", "kkomwsqfrscvpnmpulbilvxmyhurdufpewbdotkhomcdaquwdvhotedrmzlrtsiao", "dcenlucpzefucirjzkqccebpvvhfxwqaawpmrtbqxjka", "clsmbuqfyfcvpjslzulwlzpfdf", "osghuuaivubduihpxrjisdwqpxfwclcqfjyzdyjaukfpvngsgqbavzrkwwibjlrowppzpzbklhbgwjzezcevdvhzusadd", "szlhabibnwkqegzdkbhrwkmfmgxomciedwndxwhmsrewadckeldcyqkkyjakmlqphevgccuwvyuvdwgkkjmibyuci", "owfhloliupkolgmfdqejaovoyypucxotvwaiklrfcdvnlispayacmxsmwhgagxtbttkfgdmigixssqj", "qjwfhqrfyyfgxbiquuxdxmnfulzodiitsgybwqgwq", "dnmnfjjeoiqbnkmnarxi", "rqlsndyjvmoiabplkuzskbixpxzjuiwmyhgnnfzitnttpifbegwrjeqbdpkxxglypu", "czmluaenroustdokmuan", "rzxrfkrveexfrkztonkdjcymtkbnmoldokuvulqzqqejaecr", "owesurleszqimvywquqdmrtewehciyvwwzpqscwmboxpjvlbrefgvyktftvntsmpudhmfdbjryadvmensjtnkfjpzgeuzq", "tvrhdvkooiorgcwtufokpvtgwzlraddvz", "ferpsiagzglxbffprwmkdjmoamtdkszpytesbgzcmmanrhejdrvgajwcyqhikgxjbdbcmcfyohoiouttnoanywrymyg", "hfikkjnwmuxc", "lkthdmvuokulcszcyylfgwpqlmehjikwtfdyrauilotpgutgthlzfbrspvzyelwzqbzjcurpkmgrhbzainzpqrhfoi", "utbvlevxiroxbbfukhukrhlhzeqetbjpum", "isifbztaawgxinrsgagpzkgffhqvdegnwosxnoapmg", "vvfpbhvtggznnidinhobeevdtjdjw", "xrgfgkmcdvkeixoo"};
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr, arr.length));
    }

    static String longestCommonPrefix(String arr[], int n) {
        // code here
        if (n == 1) {
            return arr[0];
        }
        for (int i = 1; i < n; i++) {
            String temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < arr[j].length()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        String compare = "-1";
        StringBuilder output = new StringBuilder();
        String str1 = arr[0];
        String str2 = arr[1];
        for (int j = 0; j < arr[0].length(); j++) {
            boolean b = str1.charAt(j) != str2.charAt(j);
            if (j == 0 && b) {
                return compare;
            } else if (str1.charAt(j) == str2.charAt(j)) {
                output.append(str1.charAt(j));
            } else if (b) {
                break;
            }
        }
        for (int i = 0; i < arr.length; ) {
            String substring = arr[i].substring(0, output.length());
            if (output.length() == 1 && !substring.contentEquals(output)) {
                return compare;
            }
            if (!substring.contentEquals(output)) {
                i--;
                output = new StringBuilder(output.substring(0, output.length() - 1));
            } else
                i++;
        }

        return new String(output);
    }

//    static String longestCommonPrefix(String arr[], int n){
//        // code here
//        if(n == 1){
//            return arr[0];
//        }
//        for (int i=1 ;i<n; i++)
//        {
//            String temp = arr[i];
//            int j = i - 1;
//            while (j >= 0 && temp.length() < arr[j].length())
//            {
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//        String compare = "-1";
//        StringBuilder output = new StringBuilder();
//        for(int i = 0; i < arr.length;) {
//            if (i == 0) {
//                String str1 = arr[i];
//                String str2 = arr[i + 1];
//                for (int j = 0; j < arr[i].length(); j++) {
//                    if (j == 0 && str1.charAt(j) != str2.charAt(j)) {
//                        return compare;
//                    } else if (str1.charAt(j) == str2.charAt(j)) {
//                        output.append(str1.charAt(j));
//                    } else if (str1.charAt(j) != str2.charAt(j)) {
//                        break;
//                    }
//                }
//                i++;
//            } else {
//                String substring = arr[i].substring(0, output.length());
//                if (output.length() == 1 && !substring.contentEquals(output)){
//                    return compare;
//                }
//                if (!substring.contentEquals(output)) {
//                    i--;
//                    output = new StringBuilder(output.substring(0, output.length() - 1));
//                } else
//                    i++;
//            }
//        }
//
//        return new String(output);
//    }
}
