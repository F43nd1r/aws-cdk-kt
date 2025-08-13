package com.faendir.awscdkkt.generated.services.observabilityadmin

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.observabilityadmin.CfnOrganizationTelemetryRule
import software.amazon.awscdk.services.observabilityadmin.CfnOrganizationTelemetryRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationTelemetryRule(
  id: String,
  props: CfnOrganizationTelemetryRuleProps,
  initializer: @AwsCdkDsl CfnOrganizationTelemetryRule.() -> Unit = {},
): CfnOrganizationTelemetryRule = CfnOrganizationTelemetryRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationTelemetryRule(id: String, initializer: @AwsCdkDsl CfnOrganizationTelemetryRule.Builder.() -> Unit = {}): CfnOrganizationTelemetryRule = CfnOrganizationTelemetryRule.Builder.create(this, id).apply(initializer).build()
