@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnParameter
import software.amazon.awscdk.services.ssm.CfnParameterProps
import software.constructs.Construct

public fun Construct.cfnParameter(
  id: String,
  props: CfnParameterProps,
  initializer: CfnParameter.() -> Unit = {},
): CfnParameter = CfnParameter(this, id, props).apply(initializer)
