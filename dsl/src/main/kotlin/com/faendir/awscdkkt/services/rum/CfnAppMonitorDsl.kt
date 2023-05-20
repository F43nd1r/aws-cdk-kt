@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rum

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor
import software.amazon.awscdk.services.rum.CfnAppMonitorProps
import software.constructs.Construct

public fun Construct.cfnAppMonitor(
  id: String,
  props: CfnAppMonitorProps,
  initializer: CfnAppMonitor.() -> Unit = {},
): CfnAppMonitor = CfnAppMonitor(this, id, props).apply(initializer)
