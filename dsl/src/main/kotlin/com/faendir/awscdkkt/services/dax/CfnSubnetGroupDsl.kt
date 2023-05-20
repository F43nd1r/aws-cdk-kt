@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dax

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnSubnetGroup
import software.amazon.awscdk.services.dax.CfnSubnetGroupProps
import software.constructs.Construct

public fun Construct.cfnSubnetGroup(
  id: String,
  props: CfnSubnetGroupProps,
  initializer: CfnSubnetGroup.() -> Unit = {},
): CfnSubnetGroup = CfnSubnetGroup(this, id, props).apply(initializer)
