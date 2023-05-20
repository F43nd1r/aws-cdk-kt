@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps
import software.constructs.Construct

public fun Construct.cfnClientVpnAuthorizationRule(
  id: String,
  props: CfnClientVpnAuthorizationRuleProps,
  initializer: CfnClientVpnAuthorizationRule.() -> Unit = {},
): CfnClientVpnAuthorizationRule = CfnClientVpnAuthorizationRule(this, id, props).apply(initializer)
