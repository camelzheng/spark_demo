package com.shangtong

import org.apache.spark.{SparkConf, SparkContext}

object HdfsTest {
  def main(args: Array[String]): Unit = {
    println("git add")
    val conf = new SparkConf()
    conf.set("spark.master", "local")
    conf.set("spark.app.name", "spark demo")
    val sc = new SparkContext(conf);
    // 读取hdfs数据
    val textFileRdd = sc.textFile("hdfs://hadoop1:8020/tmp/helloSpark.txt")
    val fRdd = textFileRdd.flatMap { _.split(" ") }
    val mrdd = fRdd.map { (_, 1) }
    val rbkrdd = mrdd.reduceByKey(_+_)
    // 写入数据到hdfs系统
    rbkrdd.saveAsTextFile("hdfs://hadoop1:8020/tmp/wcresult")
  }
}
