package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannel
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAPNSVoipChannel(
  id: String,
  props: CfnAPNSVoipChannelProps,
  initializer: CfnAPNSVoipChannel.() -> Unit = {},
): CfnAPNSVoipChannel = CfnAPNSVoipChannel(this, id, props).apply(initializer)
