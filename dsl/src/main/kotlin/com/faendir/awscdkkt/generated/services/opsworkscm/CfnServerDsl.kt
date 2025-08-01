package com.faendir.awscdkkt.generated.services.opsworkscm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opsworkscm.CfnServer
import software.amazon.awscdk.services.opsworkscm.CfnServerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServer(
  id: String,
  props: CfnServerProps,
  initializer: @AwsCdkDsl CfnServer.() -> Unit = {},
): CfnServer = CfnServer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServer(id: String, initializer: @AwsCdkDsl CfnServer.Builder.() -> Unit = {}): CfnServer = CfnServer.Builder.create(this, id).apply(initializer).build()
