package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PlacementGroup
import software.amazon.awscdk.services.ec2.PlacementGroupProps
import software.constructs.Construct

@Generated
public fun Construct.placementGroup(id: String, initializer: @AwsCdkDsl PlacementGroup.() -> Unit =
    {}): PlacementGroup = PlacementGroup(this, id).apply(initializer)

@Generated
public fun Construct.placementGroup(
  id: String,
  props: PlacementGroupProps,
  initializer: @AwsCdkDsl PlacementGroup.() -> Unit = {},
): PlacementGroup = PlacementGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPlacementGroup(id: String, initializer: @AwsCdkDsl
    PlacementGroup.Builder.() -> Unit = {}): PlacementGroup = PlacementGroup.Builder.create(this,
    id).apply(initializer).build()
