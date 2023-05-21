package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.clientVpnAuthorizationRule(
  id: String,
  props: ClientVpnAuthorizationRuleProps,
  initializer: ClientVpnAuthorizationRule.() -> Unit = {},
): ClientVpnAuthorizationRule = ClientVpnAuthorizationRule(this, id, props).apply(initializer)
