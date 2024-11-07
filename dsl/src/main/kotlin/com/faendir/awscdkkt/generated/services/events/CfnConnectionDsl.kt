package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnection(id: String, initializer: @AwsCdkDsl CfnConnection.() -> Unit =
    {}): CfnConnection = CfnConnection(this, id).apply(initializer)

@Generated
public fun Construct.cfnConnection(
  id: String,
  props: CfnConnectionProps,
  initializer: @AwsCdkDsl CfnConnection.() -> Unit = {},
): CfnConnection = CfnConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnection(id: String, initializer: @AwsCdkDsl
    CfnConnection.Builder.() -> Unit = {}): CfnConnection = CfnConnection.Builder.create(this,
    id).apply(initializer).build()
