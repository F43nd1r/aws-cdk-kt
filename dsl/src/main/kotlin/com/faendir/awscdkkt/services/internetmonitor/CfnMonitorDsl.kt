@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.internetmonitor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import software.amazon.awscdk.services.internetmonitor.CfnMonitorProps
import software.constructs.Construct

public fun Construct.cfnMonitor(
  id: String,
  props: CfnMonitorProps,
  initializer: CfnMonitor.() -> Unit = {},
): CfnMonitor = CfnMonitor(this, id, props).apply(initializer)
