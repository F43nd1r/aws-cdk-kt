package com.faendir.awscdkkt.generated.services.devopsagent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsagent.CfnPrivateConnection
import software.amazon.awscdk.services.devopsagent.CfnPrivateConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrivateConnection(
  id: String,
  props: CfnPrivateConnectionProps,
  initializer: @AwsCdkDsl CfnPrivateConnection.() -> Unit = {},
): CfnPrivateConnection = CfnPrivateConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrivateConnection(id: String, initializer: @AwsCdkDsl CfnPrivateConnection.Builder.() -> Unit = {}): CfnPrivateConnection = CfnPrivateConnection.Builder.create(this, id).apply(initializer).build()
