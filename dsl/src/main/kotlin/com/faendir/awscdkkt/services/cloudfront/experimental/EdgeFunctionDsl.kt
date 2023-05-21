package com.faendir.awscdkkt.services.cloudfront.experimental

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.edgeFunction(
  id: String,
  props: EdgeFunctionProps,
  initializer: EdgeFunction.() -> Unit = {},
): EdgeFunction = EdgeFunction(this, id, props).apply(initializer)
