package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAPNSSandboxChannel(id: String, props: CfnAPNSSandboxChannelProps):
    CfnAPNSSandboxChannel = CfnAPNSSandboxChannel(this, id, props)

@Generated
public fun Construct.cfnAPNSSandboxChannel(
  id: String,
  props: CfnAPNSSandboxChannelProps,
  initializer: @AwsCdkDsl CfnAPNSSandboxChannel.() -> Unit,
): CfnAPNSSandboxChannel = CfnAPNSSandboxChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAPNSSandboxChannel(id: String, initializer: @AwsCdkDsl
    CfnAPNSSandboxChannel.Builder.() -> Unit): CfnAPNSSandboxChannel =
    CfnAPNSSandboxChannel.Builder.create(this, id).apply(initializer).build()
