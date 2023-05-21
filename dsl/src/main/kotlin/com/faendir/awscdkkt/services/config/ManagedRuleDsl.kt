package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.config.ManagedRuleProps
import software.constructs.Construct

@Generated
public fun Construct.managedRule(
  id: String,
  props: ManagedRuleProps,
  initializer: ManagedRule.() -> Unit = {},
): ManagedRule = ManagedRule(this, id, props).apply(initializer)
