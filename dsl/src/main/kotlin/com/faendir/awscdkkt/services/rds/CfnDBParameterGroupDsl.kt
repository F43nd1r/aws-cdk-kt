@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
