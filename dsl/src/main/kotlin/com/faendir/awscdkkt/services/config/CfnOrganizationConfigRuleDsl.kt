package com.faendir.awscdkkt.services.config

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
  initializer: CfnOrganizationConfigRule.() -> Unit = {},
): CfnOrganizationConfigRule = CfnOrganizationConfigRule(this, id, props).apply(initializer)
