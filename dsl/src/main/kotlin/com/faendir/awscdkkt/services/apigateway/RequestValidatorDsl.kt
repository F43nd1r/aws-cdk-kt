package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.RequestValidatorProps
import software.constructs.Construct

@Generated
public fun Construct.requestValidator(
  id: String,
  props: RequestValidatorProps,
  initializer: RequestValidator.() -> Unit = {},
): RequestValidator = RequestValidator(this, id, props).apply(initializer)
