package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannel
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVoiceChannel(
  id: String,
  props: CfnVoiceChannelProps,
  initializer: CfnVoiceChannel.() -> Unit = {},
): CfnVoiceChannel = CfnVoiceChannel(this, id, props).apply(initializer)
