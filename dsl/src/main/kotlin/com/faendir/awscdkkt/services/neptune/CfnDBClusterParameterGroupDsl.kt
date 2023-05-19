@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.neptune

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps
import software.constructs.Construct

public fun Construct.cfnDBClusterParameterGroup(
  id: String,
  props: CfnDBClusterParameterGroupProps,
  initializer: CfnDBClusterParameterGroup.() -> Unit = {},
): CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(this, id, props).apply(initializer)
