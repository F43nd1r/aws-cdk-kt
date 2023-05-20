@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnADMChannel
import software.amazon.awscdk.services.pinpoint.CfnADMChannelProps
import software.constructs.Construct

public fun Construct.cfnADMChannel(
  id: String,
  props: CfnADMChannelProps,
  initializer: CfnADMChannel.() -> Unit = {},
): CfnADMChannel = CfnADMChannel(this, id, props).apply(initializer)
