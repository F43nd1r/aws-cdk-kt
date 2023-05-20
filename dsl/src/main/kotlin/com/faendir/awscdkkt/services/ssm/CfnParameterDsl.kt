@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
