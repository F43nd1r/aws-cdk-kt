package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.amazon.awscdk.services.pinpoint.CfnADMChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnADMChannel(
  id: String,
  props: CfnADMChannelProps,
  initializer: CfnADMChannel.() -> Unit = {},
): CfnADMChannel = CfnADMChannel(this, id, props).apply(initializer)
