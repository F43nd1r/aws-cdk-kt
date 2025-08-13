package com.faendir.awscdkkt.generated.services.observabilityadmin

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.observabilityadmin.CfnTelemetryRule
import software.amazon.awscdk.services.observabilityadmin.CfnTelemetryRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTelemetryRule(
  id: String,
  props: CfnTelemetryRuleProps,
  initializer: @AwsCdkDsl CfnTelemetryRule.() -> Unit = {},
): CfnTelemetryRule = CfnTelemetryRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTelemetryRule(id: String, initializer: @AwsCdkDsl CfnTelemetryRule.Builder.() -> Unit = {}): CfnTelemetryRule = CfnTelemetryRule.Builder.create(this, id).apply(initializer).build()
