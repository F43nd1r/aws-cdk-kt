package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterParameterGroup(
  id: String,
  props: CfnClusterParameterGroupProps,
  initializer: CfnClusterParameterGroup.() -> Unit = {},
): CfnClusterParameterGroup = CfnClusterParameterGroup(this, id, props).apply(initializer)
