package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnGCMChannel
import software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGCMChannel(
  id: String,
  props: CfnGCMChannelProps,
  initializer: @AwsCdkDsl CfnGCMChannel.() -> Unit = {},
): CfnGCMChannel = CfnGCMChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGCMChannel(id: String, initializer: @AwsCdkDsl
    CfnGCMChannel.Builder.() -> Unit = {}): CfnGCMChannel = CfnGCMChannel.Builder.create(this,
    id).apply(initializer).build()
