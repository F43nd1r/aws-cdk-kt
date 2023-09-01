package com.faendir.awscdkkt.generated.services.internetmonitor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import software.amazon.awscdk.services.internetmonitor.CfnMonitorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMonitor(
  id: String,
  props: CfnMonitorProps,
  initializer: @AwsCdkDsl CfnMonitor.() -> Unit = {},
): CfnMonitor = CfnMonitor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMonitor(id: String, initializer: @AwsCdkDsl
    CfnMonitor.Builder.() -> Unit = {}): CfnMonitor = CfnMonitor.Builder.create(this,
    id).apply(initializer).build()
