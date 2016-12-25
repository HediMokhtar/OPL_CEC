package Spoon

import spoon.processing.AbstractProcessor
import spoon.reflect.declaration.CtClass

class TestProcessor extends AbstractProcessor[CtClass[_]] {

  override def isToBeProcessed(element: CtClass[_]): Boolean = ???

  override def process(element: CtClass[_]): Unit = ???

}
