package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOrganizationConfigRule(
  id: String,
  props: CfnOrganizationConfigRuleProps,
  initializer: @AwsCdkDsl CfnOrganizationConfigRule.() -> Unit = {},
): CfnOrganizationConfigRule = CfnOrganizationConfigRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOrganizationConfigRule(id: String, initializer: @AwsCdkDsl CfnOrganizationConfigRule.Builder.() -> Unit = {}): CfnOrganizationConfigRule = CfnOrganizationConfigRule.Builder.create(this, id).apply(initializer).build()
