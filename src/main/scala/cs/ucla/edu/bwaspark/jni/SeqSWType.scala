package cs.ucla.edu.bwaspark.jni

//import cs.ucla.edu.bwaspark.datatype.{FASTQSingleNode}

class SeqSWType {
  var readIdx: Int = -1
  var pairIdx: Int = -1
  //var seq: FASTQSingleNode = _
  var seqLength: Int = 0
  var seqTrans: Array[Byte] = _
}
