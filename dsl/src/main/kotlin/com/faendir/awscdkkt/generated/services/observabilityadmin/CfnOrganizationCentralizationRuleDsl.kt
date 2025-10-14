package com.faendir.awscdkkt.generated.services.observabilityadmin

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.observabilityadmin.CfnOrganizationCentralizationRule
import software.amazon.awscdk.services.observabilityadmin.CfnOrganizationCentralizationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationCentralizationRule(
  id: String,
  props: CfnOrganizationCentralizationRuleProps,
  initializer: @AwsCdkDsl CfnOrganizationCentralizationRule.() -> Unit = {},
): CfnOrganizationCentralizationRule = CfnOrganizationCentralizationRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationCentralizationRule(id: String, initializer: @AwsCdkDsl CfnOrganizationCentralizationRule.Builder.() -> Unit = {}): CfnOrganizationCentralizationRule = CfnOrganizationCentralizationRule.Builder.create(this, id).apply(initializer).build()
