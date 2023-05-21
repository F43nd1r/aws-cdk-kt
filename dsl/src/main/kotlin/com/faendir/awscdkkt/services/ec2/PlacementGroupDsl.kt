package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PlacementGroup
import software.amazon.awscdk.services.ec2.PlacementGroupProps
import software.constructs.Construct

@Generated
public fun Construct.placementGroup(id: String, initializer: PlacementGroup.() -> Unit = {}):
    PlacementGroup = PlacementGroup(this, id).apply(initializer)

@Generated
public fun Construct.placementGroup(
  id: String,
  props: PlacementGroupProps,
  initializer: PlacementGroup.() -> Unit = {},
): PlacementGroup = PlacementGroup(this, id, props).apply(initializer)
