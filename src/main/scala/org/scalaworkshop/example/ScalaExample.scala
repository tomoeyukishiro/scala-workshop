package org.scalaworkshop.example
import org.junit.runner.RunWith
import org.nd4j.api.linalg.DSL._
import org.nd4j.linalg.api.ndarray.INDArray
import org.nd4j.linalg.factory.Nd4j
import java.util
/**
 * Created by alicewang on 4/28/15.
 */
object ScalaExample {

  def main (args: Array[String]){
    val arr = Nd4j.create(5)
    println(util.Arrays.toString(arr.shape))
  }

}
