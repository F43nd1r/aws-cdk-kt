package com.faendir.awscdkkt.generated.services.rum

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor
import software.amazon.awscdk.services.rum.CfnAppMonitorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppMonitor(
  id: String,
  props: CfnAppMonitorProps,
  initializer: @AwsCdkDsl CfnAppMonitor.() -> Unit = {},
): CfnAppMonitor = CfnAppMonitor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAppMonitor(id: String, initializer: @AwsCdkDsl CfnAppMonitor.Builder.() -> Unit = {}): CfnAppMonitor = CfnAppMonitor.Builder.create(this, id).apply(initializer).build()
