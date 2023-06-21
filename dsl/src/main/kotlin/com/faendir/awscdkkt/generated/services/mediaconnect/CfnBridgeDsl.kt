package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import software.amazon.awscdk.services.mediaconnect.CfnBridgeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBridge(id: String, props: CfnBridgeProps): CfnBridge = CfnBridge(this, id,
    props)

@Generated
public fun Construct.cfnBridge(
  id: String,
  props: CfnBridgeProps,
  initializer: @AwsCdkDsl CfnBridge.() -> Unit,
): CfnBridge = CfnBridge(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBridge(id: String, initializer: @AwsCdkDsl
    CfnBridge.Builder.() -> Unit): CfnBridge = CfnBridge.Builder.create(this,
    id).apply(initializer).build()
