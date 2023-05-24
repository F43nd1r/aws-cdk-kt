package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.CustomRuleProps
import software.constructs.Construct

@Generated
public fun Construct.customRule(id: String, props: CustomRuleProps): CustomRule = CustomRule(this,
    id, props)

@Generated
public fun Construct.customRule(
  id: String,
  props: CustomRuleProps,
  initializer: @AwsCdkDsl CustomRule.() -> Unit,
): CustomRule = CustomRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCustomRule(id: String, initializer: @AwsCdkDsl
    CustomRule.Builder.() -> Unit): CustomRule = CustomRule.Builder.create(this,
    id).apply(initializer).build()
