@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSubnetGroup
import software.amazon.awscdk.services.rds.CfnDBSubnetGroupProps
import software.constructs.Construct

public fun Construct.cfnDBSubnetGroup(
  id: String,
  props: CfnDBSubnetGroupProps,
  initializer: CfnDBSubnetGroup.() -> Unit = {},
): CfnDBSubnetGroup = CfnDBSubnetGroup(this, id, props).apply(initializer)
