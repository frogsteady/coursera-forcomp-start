import forcomp.Anagrams.{Occurrences, wordOccurrences}

type Word = String
type Sentence = List[Word]
def wordOccurrences(w: Word): Occurrences = w.toCharArray.groupBy((f: Char)=> w.count(_ == f)).flatMap(kv=>kv._2.map(c=>(c, kv._1))).toList

wordOccurrences("abcd")

List(1,2,3).flatMap(List(_))
List(1,2,3).flatMap(List(_).flatMap(List(_)))
List(1,2,3).flatMap(List(_)).flatMap(List(_))