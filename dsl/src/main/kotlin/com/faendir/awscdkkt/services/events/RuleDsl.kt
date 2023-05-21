package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps
import software.constructs.Construct

@Generated
public fun Construct.rule(id: String, initializer: Rule.() -> Unit = {}): Rule = Rule(this,
    id).apply(initializer)

@Generated
public fun Construct.rule(
  id: String,
  props: RuleProps,
  initializer: Rule.() -> Unit = {},
): Rule = Rule(this, id, props).apply(initializer)
