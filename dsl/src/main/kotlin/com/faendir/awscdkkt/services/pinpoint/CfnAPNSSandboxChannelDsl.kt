package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAPNSSandboxChannel(
  id: String,
  props: CfnAPNSSandboxChannelProps,
  initializer: CfnAPNSSandboxChannel.() -> Unit = {},
): CfnAPNSSandboxChannel = CfnAPNSSandboxChannel(this, id, props).apply(initializer)
