package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailChannel
import software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEmailChannel(id: String, props: CfnEmailChannelProps): CfnEmailChannel =
    CfnEmailChannel(this, id, props)

@Generated
public fun Construct.cfnEmailChannel(
  id: String,
  props: CfnEmailChannelProps,
  initializer: @AwsCdkDsl CfnEmailChannel.() -> Unit,
): CfnEmailChannel = CfnEmailChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEmailChannel(id: String, initializer: @AwsCdkDsl
    CfnEmailChannel.Builder.() -> Unit): CfnEmailChannel = CfnEmailChannel.Builder.create(this,
    id).apply(initializer).build()
