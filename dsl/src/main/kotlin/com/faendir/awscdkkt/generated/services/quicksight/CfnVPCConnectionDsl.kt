package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnVPCConnection
import software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCConnection(id: String, initializer: @AwsCdkDsl
    CfnVPCConnection.() -> Unit = {}): CfnVPCConnection = CfnVPCConnection(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnVPCConnection(
  id: String,
  props: CfnVPCConnectionProps,
  initializer: @AwsCdkDsl CfnVPCConnection.() -> Unit = {},
): CfnVPCConnection = CfnVPCConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCConnection(id: String, initializer: @AwsCdkDsl
    CfnVPCConnection.Builder.() -> Unit = {}): CfnVPCConnection =
    CfnVPCConnection.Builder.create(this, id).apply(initializer).build()
