package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnAPNSChannel.() -> Unit = {},
): CfnAPNSChannel = CfnAPNSChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAPNSChannel(id: String, initializer: @AwsCdkDsl
    CfnAPNSChannel.Builder.() -> Unit = {}): CfnAPNSChannel = CfnAPNSChannel.Builder.create(this,
    id).apply(initializer).build()
