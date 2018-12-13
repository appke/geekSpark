import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.rdd.RDD.rddToPairRDDFunctions




object WordCount {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.setMaster("local").setAppName("WC")
    val sc = new SparkContext(conf)
    val lines :RDD[String] = sc.textFile("words.txt")
    val word :RDD[String]  = lines.flatMap{lines => {
      lines.split(" ")
    }}
    val pairs : RDD[(String,Int)] = word.map{ x => (x,1) }
    val result = pairs.reduceByKey{(a,b)=> {a+b}}
    result.sortBy(_._1,true).foreach(println)

    // 简化写法
    // lines.flatMap { _.split(" ")}.map { (_,1)}.reduceByKey(_+_).foreach(println)
  }

}
