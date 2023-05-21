package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringParameter
import software.amazon.awscdk.services.ssm.StringParameterProps
import software.constructs.Construct

@Generated
public fun Construct.stringParameter(
  id: String,
  props: StringParameterProps,
  initializer: StringParameter.() -> Unit = {},
): StringParameter = StringParameter(this, id, props).apply(initializer)
