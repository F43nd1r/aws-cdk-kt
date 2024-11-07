package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnChannelNamespace
import software.amazon.awscdk.services.appsync.CfnChannelNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChannelNamespace(
  id: String,
  props: CfnChannelNamespaceProps,
  initializer: @AwsCdkDsl CfnChannelNamespace.() -> Unit = {},
): CfnChannelNamespace = CfnChannelNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChannelNamespace(id: String, initializer: @AwsCdkDsl
    CfnChannelNamespace.Builder.() -> Unit = {}): CfnChannelNamespace =
    CfnChannelNamespace.Builder.create(this, id).apply(initializer).build()
