@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup
import software.amazon.awscdk.services.dms.CfnReplicationSubnetGroupProps
import software.constructs.Construct

public fun Construct.cfnReplicationSubnetGroup(
  id: String,
  props: CfnReplicationSubnetGroupProps,
  initializer: CfnReplicationSubnetGroup.() -> Unit = {},
): CfnReplicationSubnetGroup = CfnReplicationSubnetGroup(this, id, props).apply(initializer)
