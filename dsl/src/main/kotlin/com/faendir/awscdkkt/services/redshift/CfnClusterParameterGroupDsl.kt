@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
import software.constructs.Construct

public fun Construct.cfnClusterParameterGroup(
  id: String,
  props: CfnClusterParameterGroupProps,
  initializer: CfnClusterParameterGroup.() -> Unit = {},
): CfnClusterParameterGroup = CfnClusterParameterGroup(this, id, props).apply(initializer)
