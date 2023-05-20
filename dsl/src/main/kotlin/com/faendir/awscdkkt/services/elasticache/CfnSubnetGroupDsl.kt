@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnSubnetGroup
import software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps
import software.constructs.Construct

public fun Construct.cfnSubnetGroup(
  id: String,
  props: CfnSubnetGroupProps,
  initializer: CfnSubnetGroup.() -> Unit = {},
): CfnSubnetGroup = CfnSubnetGroup(this, id, props).apply(initializer)
