package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannel
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVoiceChannel(id: String, props: CfnVoiceChannelProps): CfnVoiceChannel =
    CfnVoiceChannel(this, id, props)

@Generated
public fun Construct.cfnVoiceChannel(
  id: String,
  props: CfnVoiceChannelProps,
  initializer: @AwsCdkDsl CfnVoiceChannel.() -> Unit,
): CfnVoiceChannel = CfnVoiceChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVoiceChannel(id: String, initializer: @AwsCdkDsl
    CfnVoiceChannel.Builder.() -> Unit): CfnVoiceChannel = CfnVoiceChannel.Builder.create(this,
    id).apply(initializer).build()
