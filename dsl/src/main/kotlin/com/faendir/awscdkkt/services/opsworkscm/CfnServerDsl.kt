package com.faendir.awscdkkt.services.opsworkscm

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
  initializer: CfnServer.() -> Unit = {},
): CfnServer = CfnServer(this, id, props).apply(initializer)
