@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps
import software.constructs.Construct

public fun Construct.cfnAPNSSandboxChannel(
  id: String,
  props: CfnAPNSSandboxChannelProps,
  initializer: CfnAPNSSandboxChannel.() -> Unit = {},
): CfnAPNSSandboxChannel = CfnAPNSSandboxChannel(this, id, props).apply(initializer)
