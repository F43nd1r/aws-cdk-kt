package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ManagedRule.() -> Unit = {},
): ManagedRule = ManagedRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildManagedRule(id: String, initializer: @AwsCdkDsl
    ManagedRule.Builder.() -> Unit = {}): ManagedRule = ManagedRule.Builder.create(this,
    id).apply(initializer).build()
