package com.faendir.awscdkkt.services.pinpoint

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
  initializer: CfnGCMChannel.() -> Unit = {},
): CfnGCMChannel = CfnGCMChannel(this, id, props).apply(initializer)
