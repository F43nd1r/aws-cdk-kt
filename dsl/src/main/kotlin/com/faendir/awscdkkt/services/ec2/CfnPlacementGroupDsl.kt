@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnPlacementGroup
import software.amazon.awscdk.services.ec2.CfnPlacementGroupProps
import software.constructs.Construct

public fun Construct.cfnPlacementGroup(id: String, initializer: CfnPlacementGroup.() -> Unit = {}):
    CfnPlacementGroup = CfnPlacementGroup(this, id).apply(initializer)

public fun Construct.cfnPlacementGroup(
  id: String,
  props: CfnPlacementGroupProps,
  initializer: CfnPlacementGroup.() -> Unit = {},
): CfnPlacementGroup = CfnPlacementGroup(this, id, props).apply(initializer)
