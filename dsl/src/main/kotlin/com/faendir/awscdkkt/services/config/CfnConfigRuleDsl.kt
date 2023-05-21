package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigRule(
  id: String,
  props: CfnConfigRuleProps,
  initializer: CfnConfigRule.() -> Unit = {},
): CfnConfigRule = CfnConfigRule(this, id, props).apply(initializer)
