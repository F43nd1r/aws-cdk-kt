@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringParameter
import software.amazon.awscdk.services.ssm.StringParameterProps
import software.constructs.Construct

public fun Construct.stringParameter(
  id: String,
  props: StringParameterProps,
  initializer: StringParameter.() -> Unit = {},
): StringParameter = StringParameter(this, id, props).apply(initializer)
