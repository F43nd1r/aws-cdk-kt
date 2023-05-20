@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionProps
import software.constructs.Construct

public fun Construct.function(
  id: String,
  props: FunctionProps,
  initializer: Function.() -> Unit = {},
): Function = Function(this, id, props).apply(initializer)
