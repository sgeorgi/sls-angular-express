package io.georgi.sls

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}
import org.apache.logging.log4j.{LogManager, Logger}

import scala.jdk.CollectionConverters._

class Handler extends RequestHandler[Request, ApiGatewayResponse] {

  val logger: Logger = LogManager.getLogger(getClass)

  def handleRequest(input: Request, context: Context): ApiGatewayResponse = {
    logger.info(s"This is a test function")
    val headers = Map("x-custom-response-header" -> "my custom response header value")
    ApiGatewayResponse(200, "Go Serverless v2.0! Your function executed successfully!", headers.asJava, true)
  }
}
