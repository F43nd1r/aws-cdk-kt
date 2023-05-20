@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroupProps
import software.constructs.Construct

public fun Construct.cfnDBClusterParameterGroup(
  id: String,
  props: CfnDBClusterParameterGroupProps,
  initializer: CfnDBClusterParameterGroup.() -> Unit = {},
): CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(this, id, props).apply(initializer)
