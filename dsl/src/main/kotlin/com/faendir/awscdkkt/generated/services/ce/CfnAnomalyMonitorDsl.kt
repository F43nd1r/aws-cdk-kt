package com.faendir.awscdkkt.generated.services.ce

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalyMonitor
import software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnomalyMonitor(id: String, props: CfnAnomalyMonitorProps): CfnAnomalyMonitor
    = CfnAnomalyMonitor(this, id, props)

@Generated
public fun Construct.cfnAnomalyMonitor(
  id: String,
  props: CfnAnomalyMonitorProps,
  initializer: @AwsCdkDsl CfnAnomalyMonitor.() -> Unit,
): CfnAnomalyMonitor = CfnAnomalyMonitor(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnomalyMonitor(id: String, initializer: @AwsCdkDsl
    CfnAnomalyMonitor.Builder.() -> Unit): CfnAnomalyMonitor =
    CfnAnomalyMonitor.Builder.create(this, id).apply(initializer).build()
