package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnRouterNetworkInterface
import software.amazon.awscdk.services.mediaconnect.CfnRouterNetworkInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouterNetworkInterface(
  id: String,
  props: CfnRouterNetworkInterfaceProps,
  initializer: @AwsCdkDsl CfnRouterNetworkInterface.() -> Unit = {},
): CfnRouterNetworkInterface = CfnRouterNetworkInterface(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouterNetworkInterface(id: String, initializer: @AwsCdkDsl CfnRouterNetworkInterface.Builder.() -> Unit = {}): CfnRouterNetworkInterface = CfnRouterNetworkInterface.Builder.create(this, id).apply(initializer).build()
