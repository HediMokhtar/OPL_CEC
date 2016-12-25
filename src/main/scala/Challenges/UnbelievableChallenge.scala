package Challenges

import java.util

import MonperrusLib.Challenge

/**
  * Created by ordinateur on 21/12/2016.
  */
class UnbelievableChallenge[T] extends Challenge[T]{
  override def getInputFormat: Class[_ <: T] = ???

  override def getInputs: util.List[T] = ???

  override def doIt(input: T): AnyRef = ???

  override def challenge(input: T): Unit = ???

  override def getJavaProgram: String = ???

}
