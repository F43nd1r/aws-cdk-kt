@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnParameter
import software.amazon.awscdk.CfnParameterProps
import software.constructs.Construct

public fun Construct.cfnParameter(id: String, initializer: CfnParameter.() -> Unit = {}):
    CfnParameter = CfnParameter(this, id).apply(initializer)

public fun Construct.cfnParameter(
  id: String,
  props: CfnParameterProps,
  initializer: CfnParameter.() -> Unit = {},
): CfnParameter = CfnParameter(this, id, props).apply(initializer)
