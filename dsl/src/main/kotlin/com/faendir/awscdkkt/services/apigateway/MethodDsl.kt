@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodProps
import software.constructs.Construct

public fun Construct.method(
  id: String,
  props: MethodProps,
  initializer: Method.() -> Unit = {},
): Method = Method(this, id, props).apply(initializer)
