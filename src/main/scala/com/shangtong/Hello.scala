package com.shangtong

import org.apache.spark.{SparkConf, SparkContext}

object Hello {

  def main(args: Array[String]): Unit = {
    println("main begin----")
    //System.setProperty("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
    val sparkConf = new SparkConf().setAppName("sparkDemo")
    sparkConf.setMaster("local[4]")
    val sc = new SparkContext(sparkConf)
    val a = sc.parallelize(List(1,2,3,4))
    val b = a.map(x => x+1)
    var colors = Map("red" -> "#FF0000","azure" -> "#F0FFFF","pearu" -> "#CD853F")
    val nums: Map[Int, Int] = Map()
    println("colors中的间为：" + colors.keys)
    println( "colors 中的值为 : " + colors.values )
    println( "检测 colors 是否为空 : " + colors.isEmpty )
    println( "检测 nums 是否为空 : " + nums.isEmpty )
    println("main end...............")
  }
}
