package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ChannelNamespace
import software.amazon.awscdk.services.appsync.ChannelNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.channelNamespace(
  id: String,
  props: ChannelNamespaceProps,
  initializer: @AwsCdkDsl ChannelNamespace.() -> Unit = {},
): ChannelNamespace = ChannelNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildChannelNamespace(id: String, initializer: @AwsCdkDsl
    ChannelNamespace.Builder.() -> Unit = {}): ChannelNamespace =
    ChannelNamespace.Builder.create(this, id).apply(initializer).build()
