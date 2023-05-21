package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnServerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServer(id: String, initializer: CfnServer.() -> Unit = {}): CfnServer =
    CfnServer(this, id).apply(initializer)

@Generated
public fun Construct.cfnServer(
  id: String,
  props: CfnServerProps,
  initializer: CfnServer.() -> Unit = {},
): CfnServer = CfnServer(this, id, props).apply(initializer)
