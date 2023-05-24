package com.faendir.awscdkkt.generated.services.codestarconnections

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarconnections.CfnConnection
import software.amazon.awscdk.services.codestarconnections.CfnConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnection(id: String, props: CfnConnectionProps): CfnConnection =
    CfnConnection(this, id, props)

@Generated
public fun Construct.cfnConnection(
  id: String,
  props: CfnConnectionProps,
  initializer: @AwsCdkDsl CfnConnection.() -> Unit,
): CfnConnection = CfnConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnection(id: String, initializer: @AwsCdkDsl
    CfnConnection.Builder.() -> Unit): CfnConnection = CfnConnection.Builder.create(this,
    id).apply(initializer).build()
