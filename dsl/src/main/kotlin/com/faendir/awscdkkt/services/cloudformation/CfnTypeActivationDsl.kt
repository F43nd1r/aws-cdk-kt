@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation
import software.amazon.awscdk.services.cloudformation.CfnTypeActivationProps
import software.constructs.Construct

public fun Construct.cfnTypeActivation(id: String, initializer: CfnTypeActivation.() -> Unit = {}):
    CfnTypeActivation = CfnTypeActivation(this, id).apply(initializer)

public fun Construct.cfnTypeActivation(
  id: String,
  props: CfnTypeActivationProps,
  initializer: CfnTypeActivation.() -> Unit = {},
): CfnTypeActivation = CfnTypeActivation(this, id, props).apply(initializer)
