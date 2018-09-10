package com.elvisestevan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoColecoes {

    public List<String> getList() {
        return Arrays.asList("cnt","mariana","eliane","paulo","rony","rony","rony","sibelle","jemima","flávia","raquel",
                "roseane","edson","lúcia","eliane","maya","alan","marcio","marisio","ari","adelina","lisleide","jemima",
                "robson","jaqueline","thiago","tatiane","sara","márcia","lílian","juliana","renato","leandro","vanessa",
                "jaqueline","tamires","tatiana","quetlin","paulo","maria","ricardo","vanderlei","taina","irimar","daniela",
                "breno","neli","sandra","adelia","elisângela","alessandra","leandro","suellen","carlos","nilmara","michelle",
                "ana","cristiane","patricia","greicy","lidia","natalia","danielle","sueli","rosana","jaqueline","debora","mariana",
                "beatris","aline","juliana","tatiana","roseli","patricia","trudy","luiz","paula","marilu","tatiana","francine","adriana",
                "mira","maria","adriana","patricia","lilian","melanea","cintia","lusiane","juliana","simone","jacqueline","renata","chegou","chegou","chegou","chegou","erika",
                "soraya","julia","heloisa","marlene","naíra","muriel","luciana","renata","marilene","daniela","bruna","franciara","licia","pedro","rogerio","carla","maria","ana",
                "rafael","alex","chegou","chegou","chegou","mercia","vanessa","sonia","eliano","carlos","giuliana","graziela","taís","sandra","cnt","cnt","cnt","moises","luciana",
                "larissa","magnaldo","fabíola","andressa","ana","marco","aline","josias","fábio","maria","ricardo","viviane","keilla","wilson","chegou","susy","elias","angela","isabel",
                "sheila","fernando","maria","ricardo","lisiane","juliana","vanessa","mônica","chegou","elenice","chegou","cnt","marina","oiara","jaqueline","juan","tammy","maria","vanessa",
                "gizela","vanessa","renata","renata","bruno","léia","paula","lindolfo","thatiany","renato","wilson","ana","chegou","chegou","chegou","chegou","chegou","odoni","rosalia",
                "maximilian","eliane","joao","magda","keyla","leonardo","ana","rafael","marcelly","valdeni","silvano","ana","renata","sandra","camila","wagner","zuleica","nancy","flavia",
                "cilene","maxwell","leandro","diego","luciana","elizete","vanilson","karla","celida","edson","luciano","augusto","jessica","marlene","maria","selma","maria","adriano",
                "altair","henrique","lenore","thiago","lucineia","vinicius","maria","jerry","antonia","sany","mariolan","luciana","braz","caio","angela","renata","aline","frederico",
                "marcio","simone","lucas","bruna","judith","elen","anderson","lurdenilce","tassiana","edileusa","deivid","nathalia","maria","fabianacoimbra","oneide","leandro","carloman",
                "geraldo","silvana","soraia","michel","eliana","claudineia","fernanda","bruno","maria","marcila","vera","danielle","rodolfo","rafael","lorena","eliza","denildo","atyla",
                "lucia","maira","ademar","augusto","sergio","maria","cristiane","wesley","monica","jacira","jose","manoel","wesley","helenice","abimael","paulo","iturbson","luzia","rafeli",
                "wanessa","jose","renata","jaqueline","diego","monica","gilson","luiz","pablo","claudia","carlos","marcus","denise","maria","edna","rosalia","danillo","luiza","gabriella",
                "cristine","ana","glauce","fernanda","michel","gabriela","aparecida","marcelo","cintia","raivone","mauricio","chegou","chegou","salvio","joão","samantha","maria","samira",
                "fabiola","luiz","juarez","maria","lorenzo","mira","luiz","vanessa","ricardo","antonia","raquel","raquel","bianca","patricia","flavia","chegou","rachel","aline","karen",
                "suzane","fabio","rodrigo","claudia","rejane","maria","maria","michela","telicia","elisangela","gisleine","marcus","helden","luciney","leandro","diego","cristhian","alex",
                "antonio","marcel","marines","lais","antonio","kamylla","glicerio","diego","diego","renata","joao","patricia","marcia","renan","samantha","rosalia","sonia","samuel","marilene",
                "roberta","hamilton","sheila","lizete","patricia","evaldo","francisca","peterson","vladimir","jorge","mirian","nelma","fernanda","ana","arthur","camila","domenica","elienai",
                "jacira","joao","jocival","jorge","jose","jose","lorena","luciana","luciene","cnt","solange","solange","cleonice","cleidimar","silvana","carla","deborah","ariana","juarez",
                "antonio","juliana","rosely","hesron","danielle","divina","richard","willians","karina","tauana","cleiton","antonio","nathalia","natanael","patricia","vani","fabiana",
                "claudio","claudio","tania","mariana","marcos","dariano","mariangela","carlos","elaine","raquel","vanessa","maria","maria","kely","rubia","giovanna","ivan","deborah",
                "isaura","arlex","cristina","emerson","marcus","sinue","paulo","jane","thennyson","gilda","solange","sandra","carla","juliana","eni","henrique","henrique","renzo",
                "rosalia","monica","ana","tiago","marcelo","alexandre","alexandre","juliana","adriano","regis","erica","eduardo","ana","maria","cintia","chegou","chegou","davi",
                "renata","stheffany","stheffany","juliana","romulo","wilma","ezequiel","rosana","lucas","valter","fernando","sonia","larissa","lisete","erica","sergio","daniel",
                "nathan","wagner","almir","rayanne","sueli","karen","geine","luiz","marina","claudia","shirlei","rafael","deborah","walter","evangelista","fernanda","vagner",
                "nadiane","guido","jefferson","edneide","leticia","silmara","nivaldo","eduardo","deusdedit","chegou","chegou","chegou","fernanda","marilia","marcia","kelly",
                "maitê","erica","taciana","lucas","valessa","izabela","sgt","joelma","lourival","denise","ailme","natalia","adriane","francisco","eudilandio","herme","patricia",
                "staylon","rafael","siomara","kassia","lindasir","mirelly","ademir","bruno","roberto","anna","giuliana","karin","silvana","walbert","vanir","franz","flavia",
                "priscila","webster","ricardo","ricardo","catarina","luiz","manuel","valeria","ivone","luciano","roseli","alessandro","lais","rogerio","lidia","felipe","etiane",
                "felipe","carolina","maria","catia","jose","cnt","cnt","adriano","hebertt","juliana","leticia","maria","lusiene","aretuza","marcus","manoel","bruno","fabiane",
                "luiz","sylvia","alessandro","daniele","guilhermina","mercia","helden","renate","jorge","mauricio","ceres","carla","mario","adriana","aline","eymar","halley",
                "sergio","margarete","guilherme","renistelle","alan","alexsander","arnaldo","antonio","mia","heloiza","marcia","patricia","edlaine","valdineia","eliege","marcos","karen",
                "arlete","joão","carlos","rodrigo","laiza","william","aline","maria","marta","marli","danielle","laurineide","elaine","janayna","benito","alexandre","adalberto","renzo","raquel",
                "lucia","danilo","maria","camila","maria","lorena","rita","jessica","mario","andre","rosemeire","maria","ma","luciana","rodrigo","edna","andre","andressa","mizael","flavio",
                "gladicelio","monica","jose","leila","raphael","gleice","priscila","clóvis","vaildes","anderson","jonas","carmecilda","elizabeth","vandressa","marcio","deivison","sueli","aline",
                "karen","rodrigo","elisangela","gisleine","sonia","samuel","marilene","roberta","hamilton","sheila","lizete","evaldo","evaldo","francisca","peterson","vladimir","jorge","nelma",
                "fernanda","mirian","luciana","luciana","joao","luciene","jacira","ana","arthur","camila","domenica","elienai","jocival","jorge","jose","jose","lorena","soanny","luciane","luciana",
                "sebastiao","nilza","fernanda","luciana","kelly","enildson","alessio","eduardo","paulo","ligia","sidrak","francisca","ramiz","ramiz","cleber","jair","juliana","claudia","tatiana",
                "fabiana","francisco","tatiane","fatima","katia","marcia","maria","marcel","claudio","jose","renato","isabel","maiara","emerson","lorrani","elisabete","andreia","fernando","clésia");
    }

    public void ordenarJava7() {
        List<String> palavras = this.getList();

        Comparator<String> comparator = getStringComparator();

        Collections.sort(palavras, comparator);
    }

    public void ordenarJava8() {
        List<String> palavras = this.getList();

        Comparator<String> comparator = getStringComparator();

        palavras.sort(comparator);
    }

    private Comparator<String> getStringComparator() {
        return Comparator.comparingInt(String::length);
    }

}
