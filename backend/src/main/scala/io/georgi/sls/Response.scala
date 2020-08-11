package io.georgi.sls

import scala.beans.BeanProperty

case class Response(@BeanProperty message: String, @BeanProperty request: Request)
