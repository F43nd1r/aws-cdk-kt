@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps
import software.constructs.Construct

public fun Construct.cfnOrganizationConfigRule(
  id: String,
  props: CfnOrganizationConfigRuleProps,
  initializer: CfnOrganizationConfigRule.() -> Unit = {},
): CfnOrganizationConfigRule = CfnOrganizationConfigRule(this, id, props).apply(initializer)
