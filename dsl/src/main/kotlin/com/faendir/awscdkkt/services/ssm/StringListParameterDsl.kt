package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.StringListParameter
import software.amazon.awscdk.services.ssm.StringListParameterProps
import software.constructs.Construct

@Generated
public fun Construct.stringListParameter(
  id: String,
  props: StringListParameterProps,
  initializer: StringListParameter.() -> Unit = {},
): StringListParameter = StringListParameter(this, id, props).apply(initializer)
