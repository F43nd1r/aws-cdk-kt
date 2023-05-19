@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigRuleProps
import software.constructs.Construct

public fun Construct.cfnConfigRule(
  id: String,
  props: CfnConfigRuleProps,
  initializer: CfnConfigRule.() -> Unit = {},
): CfnConfigRule = CfnConfigRule(this, id, props).apply(initializer)
