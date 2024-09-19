package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannelPlacementGroup
import software.amazon.awscdk.services.medialive.CfnChannelPlacementGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannelPlacementGroup(id: String, initializer: @AwsCdkDsl
    CfnChannelPlacementGroup.() -> Unit = {}): CfnChannelPlacementGroup =
    CfnChannelPlacementGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnChannelPlacementGroup(
  id: String,
  props: CfnChannelPlacementGroupProps,
  initializer: @AwsCdkDsl CfnChannelPlacementGroup.() -> Unit = {},
): CfnChannelPlacementGroup = CfnChannelPlacementGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChannelPlacementGroup(id: String, initializer: @AwsCdkDsl
    CfnChannelPlacementGroup.Builder.() -> Unit = {}): CfnChannelPlacementGroup =
    CfnChannelPlacementGroup.Builder.create(this, id).apply(initializer).build()
