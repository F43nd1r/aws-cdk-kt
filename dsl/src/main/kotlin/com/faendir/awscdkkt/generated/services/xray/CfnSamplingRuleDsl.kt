package com.faendir.awscdkkt.generated.services.xray

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnSamplingRule
import software.amazon.awscdk.services.xray.CfnSamplingRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSamplingRule(id: String, props: CfnSamplingRuleProps): CfnSamplingRule =
    CfnSamplingRule(this, id, props)

@Generated
public fun Construct.cfnSamplingRule(
  id: String,
  props: CfnSamplingRuleProps,
  initializer: @AwsCdkDsl CfnSamplingRule.() -> Unit,
): CfnSamplingRule = CfnSamplingRule(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnSamplingRule(id: String): CfnSamplingRule = CfnSamplingRule(this, id)

@Generated
public fun Construct.cfnSamplingRule(id: String, initializer: @AwsCdkDsl
    CfnSamplingRule.() -> Unit): CfnSamplingRule = CfnSamplingRule(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnSamplingRule(id: String, initializer: @AwsCdkDsl
    CfnSamplingRule.Builder.() -> Unit): CfnSamplingRule = CfnSamplingRule.Builder.create(this,
    id).apply(initializer).build()
