package com.faendir.awscdkkt.generated.services.observabilityadmin

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.observabilityadmin.CfnTelemetryEnrichment
import software.amazon.awscdk.services.observabilityadmin.CfnTelemetryEnrichmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTelemetryEnrichment(id: String, initializer: @AwsCdkDsl CfnTelemetryEnrichment.() -> Unit = {}): CfnTelemetryEnrichment = CfnTelemetryEnrichment(this, id).apply(initializer)

@Generated
public fun Construct.cfnTelemetryEnrichment(
  id: String,
  props: CfnTelemetryEnrichmentProps,
  initializer: @AwsCdkDsl CfnTelemetryEnrichment.() -> Unit = {},
): CfnTelemetryEnrichment = CfnTelemetryEnrichment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTelemetryEnrichment(id: String, initializer: @AwsCdkDsl CfnTelemetryEnrichment.Builder.() -> Unit = {}): CfnTelemetryEnrichment = CfnTelemetryEnrichment.Builder.create(this, id).apply(initializer).build()
