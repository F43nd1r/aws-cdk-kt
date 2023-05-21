package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnParameter
import software.amazon.awscdk.CfnParameterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnParameter(id: String, initializer: CfnParameter.() -> Unit = {}):
    CfnParameter = CfnParameter(this, id).apply(initializer)

@Generated
public fun Construct.cfnParameter(
  id: String,
  props: CfnParameterProps,
  initializer: CfnParameter.() -> Unit = {},
): CfnParameter = CfnParameter(this, id, props).apply(initializer)
