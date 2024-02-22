package com.faendir.awscdkkt.generated.services.mediapackagev2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediapackagev2.CfnChannelGroup
import software.amazon.awscdk.services.mediapackagev2.CfnChannelGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannelGroup(
  id: String,
  props: CfnChannelGroupProps,
  initializer: @AwsCdkDsl CfnChannelGroup.() -> Unit = {},
): CfnChannelGroup = CfnChannelGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChannelGroup(id: String, initializer: @AwsCdkDsl
    CfnChannelGroup.Builder.() -> Unit = {}): CfnChannelGroup = CfnChannelGroup.Builder.create(this,
    id).apply(initializer).build()
