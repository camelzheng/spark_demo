package com.shangtong

import org.apache.spark.{SparkConf, SparkContext}

object test {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("test")
    printf("Hello word")
    var arr = new Array[String](3)
    arr(0) = "zft"
    arr(1) = "frank"
    arr(2) = "郑福添"
    val four = arr::"futian"::"好好"::Nil
    four.foreach(str => println(str))
    val five = 1::2::3::4::5::Nil
    five.foreach(ints => println(ints))

    println("===============================")
    var testArr = Array("1","2")
    ObjecOps.main(testArr)


  }
}
