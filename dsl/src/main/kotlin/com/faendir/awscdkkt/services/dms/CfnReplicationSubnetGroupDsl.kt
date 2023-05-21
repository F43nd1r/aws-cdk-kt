package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationSubnetGroup(
  id: String,
  props: CfnReplicationSubnetGroupProps,
  initializer: CfnReplicationSubnetGroup.() -> Unit = {},
): CfnReplicationSubnetGroup = CfnReplicationSubnetGroup(this, id, props).apply(initializer)
