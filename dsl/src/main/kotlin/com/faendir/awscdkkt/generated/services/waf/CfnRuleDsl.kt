package com.faendir.awscdkkt.generated.services.waf

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnRule
import software.amazon.awscdk.services.waf.CfnRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRule(id: String, props: CfnRuleProps): CfnRule = CfnRule(this, id, props)

@Generated
public fun Construct.cfnRule(
  id: String,
  props: CfnRuleProps,
  initializer: @AwsCdkDsl CfnRule.() -> Unit,
): CfnRule = CfnRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRule(id: String, initializer: @AwsCdkDsl CfnRule.Builder.() -> Unit):
    CfnRule = CfnRule.Builder.create(this, id).apply(initializer).build()
