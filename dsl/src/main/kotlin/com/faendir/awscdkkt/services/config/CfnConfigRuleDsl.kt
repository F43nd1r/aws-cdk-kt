@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
