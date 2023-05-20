@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.neptune

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps
import software.constructs.Construct

public fun Construct.cfnDBParameterGroup(
  id: String,
  props: CfnDBParameterGroupProps,
  initializer: CfnDBParameterGroup.() -> Unit = {},
): CfnDBParameterGroup = CfnDBParameterGroup(this, id, props).apply(initializer)
