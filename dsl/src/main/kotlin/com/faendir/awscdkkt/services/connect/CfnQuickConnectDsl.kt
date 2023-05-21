package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnQuickConnectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQuickConnect(
  id: String,
  props: CfnQuickConnectProps,
  initializer: CfnQuickConnect.() -> Unit = {},
): CfnQuickConnect = CfnQuickConnect(this, id, props).apply(initializer)
