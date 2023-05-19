@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps
import software.constructs.Construct

public fun Construct.rule(id: String, initializer: Rule.() -> Unit = {}): Rule = Rule(this,
    id).apply(initializer)

public fun Construct.rule(
  id: String,
  props: RuleProps,
  initializer: Rule.() -> Unit = {},
): Rule = Rule(this, id, props).apply(initializer)
