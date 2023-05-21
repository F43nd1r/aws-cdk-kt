package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClusterSubnetGroup(
  id: String,
  props: CfnClusterSubnetGroupProps,
  initializer: CfnClusterSubnetGroup.() -> Unit = {},
): CfnClusterSubnetGroup = CfnClusterSubnetGroup(this, id, props).apply(initializer)
