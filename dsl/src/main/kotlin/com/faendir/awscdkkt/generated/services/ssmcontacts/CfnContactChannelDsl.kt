package com.faendir.awscdkkt.generated.services.ssmcontacts

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannel
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactChannel(
  id: String,
  props: CfnContactChannelProps,
  initializer: @AwsCdkDsl CfnContactChannel.() -> Unit = {},
): CfnContactChannel = CfnContactChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactChannel(id: String, initializer: @AwsCdkDsl
    CfnContactChannel.Builder.() -> Unit = {}): CfnContactChannel =
    CfnContactChannel.Builder.create(this, id).apply(initializer).build()
