package ddebugger

import java.io.File

import MonperrusLib.{CauseEffectChain, Challenge, DDebugger}

/**
  * Created by ordinateur on 21/12/2016.
  */
class ScalaDdbugger[T] extends DDebugger[T]{

  override def debug(c: Challenge[T]): CauseEffectChain = ???

}
