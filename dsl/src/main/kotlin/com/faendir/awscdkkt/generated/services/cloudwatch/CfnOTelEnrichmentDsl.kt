package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnOTelEnrichment
import software.amazon.awscdk.services.cloudwatch.CfnOTelEnrichmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOTelEnrichment(id: String, initializer: @AwsCdkDsl CfnOTelEnrichment.() -> Unit = {}): CfnOTelEnrichment = CfnOTelEnrichment(this, id).apply(initializer)

@Generated
public fun Construct.cfnOTelEnrichment(
  id: String,
  props: CfnOTelEnrichmentProps,
  initializer: @AwsCdkDsl CfnOTelEnrichment.() -> Unit = {},
): CfnOTelEnrichment = CfnOTelEnrichment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOTelEnrichment(id: String, initializer: @AwsCdkDsl CfnOTelEnrichment.Builder.() -> Unit = {}): CfnOTelEnrichment = CfnOTelEnrichment.Builder.create(this, id).apply(initializer).build()
