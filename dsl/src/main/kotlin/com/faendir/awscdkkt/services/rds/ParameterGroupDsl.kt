@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupProps
import software.constructs.Construct

public fun Construct.parameterGroup(
  id: String,
  props: ParameterGroupProps,
  initializer: ParameterGroup.() -> Unit = {},
): ParameterGroup = ParameterGroup(this, id, props).apply(initializer)
