package com.faendir.awscdkkt.generated.services.cloudtrail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnChannel
import software.amazon.awscdk.services.cloudtrail.CfnChannelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannel(id: String, initializer: @AwsCdkDsl CfnChannel.() -> Unit = {}): CfnChannel = CfnChannel(this, id).apply(initializer)

@Generated
public fun Construct.cfnChannel(
  id: String,
  props: CfnChannelProps,
  initializer: @AwsCdkDsl CfnChannel.() -> Unit = {},
): CfnChannel = CfnChannel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChannel(id: String, initializer: @AwsCdkDsl CfnChannel.Builder.() -> Unit = {}): CfnChannel = CfnChannel.Builder.create(this, id).apply(initializer).build()
