package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSMSChannel
import software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSMSChannel(
  id: String,
  props: CfnSMSChannelProps,
  initializer: CfnSMSChannel.() -> Unit = {},
): CfnSMSChannel = CfnSMSChannel(this, id, props).apply(initializer)
