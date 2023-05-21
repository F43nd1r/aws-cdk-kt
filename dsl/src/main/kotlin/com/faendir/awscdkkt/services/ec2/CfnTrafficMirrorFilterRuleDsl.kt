package com.faendir.awscdkkt.services.ec2

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
  initializer: CfnTrafficMirrorFilterRule.() -> Unit = {},
): CfnTrafficMirrorFilterRule = CfnTrafficMirrorFilterRule(this, id, props).apply(initializer)
