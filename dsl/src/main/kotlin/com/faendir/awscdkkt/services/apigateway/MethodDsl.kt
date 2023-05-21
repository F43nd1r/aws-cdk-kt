package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodProps
import software.constructs.Construct

@Generated
public fun Construct.method(
  id: String,
  props: MethodProps,
  initializer: Method.() -> Unit = {},
): Method = Method(this, id, props).apply(initializer)
