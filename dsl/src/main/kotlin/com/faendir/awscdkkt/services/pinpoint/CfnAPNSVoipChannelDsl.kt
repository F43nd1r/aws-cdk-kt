@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps
import software.constructs.Construct

public fun Construct.cfnAPNSVoipChannel(
  id: String,
  props: CfnAPNSVoipChannelProps,
  initializer: CfnAPNSVoipChannel.() -> Unit = {},
): CfnAPNSVoipChannel = CfnAPNSVoipChannel(this, id, props).apply(initializer)
