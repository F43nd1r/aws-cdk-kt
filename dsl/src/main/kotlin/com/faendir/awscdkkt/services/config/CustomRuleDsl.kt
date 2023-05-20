@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.CustomRuleProps
import software.constructs.Construct

public fun Construct.customRule(
  id: String,
  props: CustomRuleProps,
  initializer: CustomRule.() -> Unit = {},
): CustomRule = CustomRule(this, id, props).apply(initializer)
