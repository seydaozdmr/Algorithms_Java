package src.HackerRank;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSplit {
    public static void main(String[] args) {
        String s=",_! ! _@?'  !?_,'! '_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?_,@?,'@@',, !.? @@@@!!?' _, @???_,@ !_@!'!!!__!??'!. _. ,@! !.?'@,' '_!@@,'?' '?' ''_? '!!'?_?,._!..@_,_', ',',, !!__!_@,.! '?...  ?_? ._ ?' _! '?_..,,''.'@'??.??' @'.?' ?'_.'.'_ .'??@',_@_ , ?! , ._ . ',_'@..' ?,?,!_'',',,,?,..',.?,?_',..@?.,_ .@_?_ ,',.?_!'.??'_@__!!!'._!!__'? .?,._'', @@?!@ '?_ .@  .!!!' .'.', _!''!_@.@..@',@? @?. .@'.,@ , !'! @,@.@. ?,'_!,_'_,'! @_,_@._'?'',!_@ ,'?.@ _!__@'. '?_, ?@_,,.,.@',@!!!@ !?!@ '@_'_ _'  @_? ,_. .@@@ '.  '!@  ._ ,__!__', '._?.,,, ,!.,!?? ??. ?@_  ,@'_@'!.,@@. @@,, ?_??!' !,@'?@!!@@'_ ?'@!.@', !?.'@' _'! @ ?.,., ?' ''@ ?_ __! ! '! . ,.@,'?.?__'__@..@'!@.@ _  .!! !?_ _.?,  ''_._! ? !,_ ,, ,@!?@,@?,. _@ @_'?!._,'_?!,??.?@,.!!' .!..',._'?  '_,'?@ _!.,_,.!?_ ?,,'@!!?@ @@!@.?_'!_.?!@ ??!' ,,,.,!_?.?.,!_ _ _.,?!_.'_ ,@'? !_.?@!',.?_@ _? ? ,@!', .,??!@??? @,!_.@ !. ''!,'?  ?,!'_.,@,@!_@ ''_._@_!@.!'@ ?@!@!,_@@ . @@_.@_??!!!@, ??'!., _ !'@'_@?_.!, ''?? ..''.,,.?@@??'.,_?'?'.' '' @,?'''@@.";


        if(s.trim().isEmpty()) {
            System.out.println(0);
        }
        else {
            System.out.println(s.trim().split("[!,?. @_']+").length);
            for(String a : s.trim().split("[!,?. @_']+")){
                System.out.println(a);
            }
        }

//        String [] blank=s.replaceFirst("^\\W+", "").split("\\W+");
//        if(blank.length>0){
//            blank = Arrays.stream(blank).filter(e->!e.equals("")).toArray(String[]::new);
//            StringBuilder builder=new StringBuilder();
//            for(int i=0;i<blank.length;i++){
//                String[] newWords=blank[i].split("[!,?._'@]");
//                if(newWords.length>1){
//                    for(String e:newWords){
//                        builder.append(e);
//                        if(i!=blank.length-1)
//                            builder.append(" ");
//                    }
//                    continue;
//                }
//                newWords=blank[i].split("[!,?._'@]");
//                builder.append(newWords[0]);
//                if(i!=blank.length-1)
//                    builder.append(" ");
//            }
//            String result=builder.toString();
//            String [] resultArray=result.split(" ");
//
//            System.out.println(resultArray.length);
//        }else{
//            System.out.println(blank.length);
//        }


    }
}
