package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnSubnetGroup
import software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnetGroup(
  id: String,
  props: CfnSubnetGroupProps,
  initializer: CfnSubnetGroup.() -> Unit = {},
): CfnSubnetGroup = CfnSubnetGroup(this, id, props).apply(initializer)
