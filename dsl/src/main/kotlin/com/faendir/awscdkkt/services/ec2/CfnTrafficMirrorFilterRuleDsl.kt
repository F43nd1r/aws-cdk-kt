@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps
import software.constructs.Construct

public fun Construct.cfnTrafficMirrorFilterRule(
  id: String,
  props: CfnTrafficMirrorFilterRuleProps,
  initializer: CfnTrafficMirrorFilterRule.() -> Unit = {},
): CfnTrafficMirrorFilterRule = CfnTrafficMirrorFilterRule(this, id, props).apply(initializer)
