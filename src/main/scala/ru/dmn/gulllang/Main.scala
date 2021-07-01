package ru.dmn.gulllang

import org.antlr.v4.runtime.{ANTLRFileStream, CommonTokenStream}

object Main {
  def main(args: Array[String]): Unit = {
    val lexer = new gulllangLexer(new ANTLRFileStream("./examples/Hello World.gll"))
    val parser = new gulllangParser(new CommonTokenStream(lexer))
    println
  }
}