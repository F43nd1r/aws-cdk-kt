package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ClientVpnAuthorizationRule.() -> Unit = {},
): ClientVpnAuthorizationRule = ClientVpnAuthorizationRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildClientVpnAuthorizationRule(id: String, initializer: @AwsCdkDsl
    ClientVpnAuthorizationRule.Builder.() -> Unit = {}): ClientVpnAuthorizationRule =
    ClientVpnAuthorizationRule.Builder.create(this, id).apply(initializer).build()
