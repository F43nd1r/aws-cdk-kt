@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBParameterGroup
import software.amazon.awscdk.services.rds.CfnDBParameterGroupProps
import software.constructs.Construct

public fun Construct.cfnDBParameterGroup(
  id: String,
  props: CfnDBParameterGroupProps,
  initializer: CfnDBParameterGroup.() -> Unit = {},
): CfnDBParameterGroup = CfnDBParameterGroup(this, id, props).apply(initializer)
