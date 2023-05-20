@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer
import software.amazon.awscdk.services.transfer.CfnServerProps
import software.constructs.Construct

public fun Construct.cfnServer(id: String, initializer: CfnServer.() -> Unit = {}): CfnServer =
    CfnServer(this, id).apply(initializer)

public fun Construct.cfnServer(
  id: String,
  props: CfnServerProps,
  initializer: CfnServer.() -> Unit = {},
): CfnServer = CfnServer(this, id, props).apply(initializer)
