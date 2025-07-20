package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrafficMirrorFilterRule(
  id: String,
  props: CfnTrafficMirrorFilterRuleProps,
  initializer: @AwsCdkDsl CfnTrafficMirrorFilterRule.() -> Unit = {},
): CfnTrafficMirrorFilterRule = CfnTrafficMirrorFilterRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrafficMirrorFilterRule(id: String, initializer: @AwsCdkDsl CfnTrafficMirrorFilterRule.Builder.() -> Unit = {}): CfnTrafficMirrorFilterRule = CfnTrafficMirrorFilterRule.Builder.create(this, id).apply(initializer).build()
