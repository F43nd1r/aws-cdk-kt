package com.faendir.awscdkkt.generated.services.kinesisvideo

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannel
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSignalingChannel(id: String, initializer: @AwsCdkDsl CfnSignalingChannel.() -> Unit = {}): CfnSignalingChannel = CfnSignalingChannel(this, id).apply(initializer)

@Generated
public fun Construct.cfnSignalingChannel(
  id: String,
  props: CfnSignalingChannelProps,
  initializer: @AwsCdkDsl CfnSignalingChannel.() -> Unit = {},
): CfnSignalingChannel = CfnSignalingChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSignalingChannel(id: String, initializer: @AwsCdkDsl CfnSignalingChannel.Builder.() -> Unit = {}): CfnSignalingChannel = CfnSignalingChannel.Builder.create(this, id).apply(initializer).build()
