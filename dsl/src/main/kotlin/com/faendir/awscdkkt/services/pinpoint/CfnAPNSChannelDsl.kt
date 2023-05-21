package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAPNSChannel(
  id: String,
  props: CfnAPNSChannelProps,
  initializer: CfnAPNSChannel.() -> Unit = {},
): CfnAPNSChannel = CfnAPNSChannel(this, id, props).apply(initializer)
