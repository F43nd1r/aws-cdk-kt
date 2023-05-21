package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.CfnTypeActivationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTypeActivation(id: String, initializer: CfnTypeActivation.() -> Unit = {}):
    CfnTypeActivation = CfnTypeActivation(this, id).apply(initializer)

@Generated
public fun Construct.cfnTypeActivation(
  id: String,
  props: CfnTypeActivationProps,
  initializer: CfnTypeActivation.() -> Unit = {},
): CfnTypeActivation = CfnTypeActivation(this, id, props).apply(initializer)
