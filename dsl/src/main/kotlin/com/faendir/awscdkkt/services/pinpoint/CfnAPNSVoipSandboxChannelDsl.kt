package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipSandboxChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAPNSVoipSandboxChannel(
  id: String,
  props: CfnAPNSVoipSandboxChannelProps,
  initializer: CfnAPNSVoipSandboxChannel.() -> Unit = {},
): CfnAPNSVoipSandboxChannel = CfnAPNSVoipSandboxChannel(this, id, props).apply(initializer)
