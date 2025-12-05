package com.faendir.awscdkkt.generated.services.observabilityadmin

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.observabilityadmin.CfnTelemetryPipelines
import software.amazon.awscdk.services.observabilityadmin.CfnTelemetryPipelinesProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTelemetryPipelines(
  id: String,
  props: CfnTelemetryPipelinesProps,
  initializer: @AwsCdkDsl CfnTelemetryPipelines.() -> Unit = {},
): CfnTelemetryPipelines = CfnTelemetryPipelines(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTelemetryPipelines(id: String, initializer: @AwsCdkDsl CfnTelemetryPipelines.Builder.() -> Unit = {}): CfnTelemetryPipelines = CfnTelemetryPipelines.Builder.create(this, id).apply(initializer).build()
