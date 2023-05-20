@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.Function
import software.amazon.awscdk.services.cloudfront.FunctionProps
import software.constructs.Construct

public fun Construct.function(
  id: String,
  props: FunctionProps,
  initializer: Function.() -> Unit = {},
): Function = Function(this, id, props).apply(initializer)
