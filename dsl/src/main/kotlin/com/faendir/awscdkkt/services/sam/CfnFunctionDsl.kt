package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction
import software.amazon.awscdk.services.sam.CfnFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFunction(id: String, initializer: CfnFunction.() -> Unit = {}): CfnFunction
    = CfnFunction(this, id).apply(initializer)

@Generated
public fun Construct.cfnFunction(
  id: String,
  props: CfnFunctionProps,
  initializer: CfnFunction.() -> Unit = {},
): CfnFunction = CfnFunction(this, id, props).apply(initializer)
