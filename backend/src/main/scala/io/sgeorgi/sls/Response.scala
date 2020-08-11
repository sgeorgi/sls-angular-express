package io.sgeorgi.sls

import scala.beans.BeanProperty

case class Response(@BeanProperty message: String, @BeanProperty request: Request)
