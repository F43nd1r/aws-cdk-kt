package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.SubnetGroup
import software.amazon.awscdk.services.rds.SubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.subnetGroup(
  id: String,
  props: SubnetGroupProps,
  initializer: SubnetGroup.() -> Unit = {},
): SubnetGroup = SubnetGroup(this, id, props).apply(initializer)
