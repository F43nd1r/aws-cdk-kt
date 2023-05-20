@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PlacementGroup
import software.amazon.awscdk.services.ec2.PlacementGroupProps
import software.constructs.Construct

public fun Construct.placementGroup(id: String, initializer: PlacementGroup.() -> Unit = {}):
    PlacementGroup = PlacementGroup(this, id).apply(initializer)

public fun Construct.placementGroup(
  id: String,
  props: PlacementGroupProps,
  initializer: PlacementGroup.() -> Unit = {},
): PlacementGroup = PlacementGroup(this, id, props).apply(initializer)
