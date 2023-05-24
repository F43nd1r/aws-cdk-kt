package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps
import software.constructs.Construct

@Generated
public fun Construct.rule(id: String, props: RuleProps): Rule = Rule(this, id, props)

@Generated
public fun Construct.rule(
  id: String,
  props: RuleProps,
  initializer: @AwsCdkDsl Rule.() -> Unit,
): Rule = Rule(this, id, props).apply(initializer)

@Generated
public fun Construct.rule(id: String): Rule = Rule(this, id)

@Generated
public fun Construct.rule(id: String, initializer: @AwsCdkDsl Rule.() -> Unit): Rule = Rule(this,
    id).apply(initializer)

@Generated
public fun Construct.buildRule(id: String, initializer: @AwsCdkDsl Rule.Builder.() -> Unit): Rule =
    Rule.Builder.create(this, id).apply(initializer).build()
