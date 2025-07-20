package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnConfigRule.() -> Unit = {},
): CfnConfigRule = CfnConfigRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigRule(id: String, initializer: @AwsCdkDsl CfnConfigRule.Builder.() -> Unit = {}): CfnConfigRule = CfnConfigRule.Builder.create(this, id).apply(initializer).build()
