package com.rktirtho.ocp.interfacing;

import java.io.Serializable;

public interface DefaultInterface extends Iterable<String>, Serializable{

}

 interface Default extends Iterable<String>, Serializable{

}
 abstract class Demo implements Default{}
