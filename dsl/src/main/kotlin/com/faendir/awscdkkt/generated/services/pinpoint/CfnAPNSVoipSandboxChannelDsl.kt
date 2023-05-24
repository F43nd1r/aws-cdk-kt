package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAPNSVoipSandboxChannel(id: String, props: CfnAPNSVoipSandboxChannelProps):
    CfnAPNSVoipSandboxChannel = CfnAPNSVoipSandboxChannel(this, id, props)

@Generated
public fun Construct.cfnAPNSVoipSandboxChannel(
  id: String,
  props: CfnAPNSVoipSandboxChannelProps,
  initializer: @AwsCdkDsl CfnAPNSVoipSandboxChannel.() -> Unit,
): CfnAPNSVoipSandboxChannel = CfnAPNSVoipSandboxChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAPNSVoipSandboxChannel(id: String, initializer: @AwsCdkDsl
    CfnAPNSVoipSandboxChannel.Builder.() -> Unit): CfnAPNSVoipSandboxChannel =
    CfnAPNSVoipSandboxChannel.Builder.create(this, id).apply(initializer).build()
