package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.parameterGroup(
  id: String,
  props: ParameterGroupProps,
  initializer: ParameterGroup.() -> Unit = {},
): ParameterGroup = ParameterGroup(this, id, props).apply(initializer)
