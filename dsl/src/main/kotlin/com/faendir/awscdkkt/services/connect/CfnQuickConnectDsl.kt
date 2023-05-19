@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnQuickConnectProps
import software.constructs.Construct

public fun Construct.cfnQuickConnect(
  id: String,
  props: CfnQuickConnectProps,
  initializer: CfnQuickConnect.() -> Unit = {},
): CfnQuickConnect = CfnQuickConnect(this, id, props).apply(initializer)
