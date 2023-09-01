package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnAPNSVoipChannel.() -> Unit = {},
): CfnAPNSVoipChannel = CfnAPNSVoipChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAPNSVoipChannel(id: String, initializer: @AwsCdkDsl
    CfnAPNSVoipChannel.Builder.() -> Unit = {}): CfnAPNSVoipChannel =
    CfnAPNSVoipChannel.Builder.create(this, id).apply(initializer).build()
