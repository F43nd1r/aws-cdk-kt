@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailChannel
import software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps
import software.constructs.Construct

public fun Construct.cfnEmailChannel(
  id: String,
  props: CfnEmailChannelProps,
  initializer: CfnEmailChannel.() -> Unit = {},
): CfnEmailChannel = CfnEmailChannel(this, id, props).apply(initializer)
