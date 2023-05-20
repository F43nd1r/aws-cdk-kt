@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction
import software.amazon.awscdk.services.lambda.CfnFunctionProps
import software.constructs.Construct

public fun Construct.cfnFunction(
  id: String,
  props: CfnFunctionProps,
  initializer: CfnFunction.() -> Unit = {},
): CfnFunction = CfnFunction(this, id, props).apply(initializer)
