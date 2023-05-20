@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.config.ManagedRuleProps
import software.constructs.Construct

public fun Construct.managedRule(
  id: String,
  props: ManagedRuleProps,
  initializer: ManagedRule.() -> Unit = {},
): ManagedRule = ManagedRule(this, id, props).apply(initializer)
