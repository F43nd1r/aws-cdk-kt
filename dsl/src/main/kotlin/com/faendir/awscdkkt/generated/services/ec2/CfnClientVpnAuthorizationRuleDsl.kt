package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnClientVpnAuthorizationRule(
  id: String,
  props: CfnClientVpnAuthorizationRuleProps,
  initializer: @AwsCdkDsl CfnClientVpnAuthorizationRule.() -> Unit = {},
): CfnClientVpnAuthorizationRule = CfnClientVpnAuthorizationRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnClientVpnAuthorizationRule(id: String, initializer: @AwsCdkDsl
    CfnClientVpnAuthorizationRule.Builder.() -> Unit = {}): CfnClientVpnAuthorizationRule =
    CfnClientVpnAuthorizationRule.Builder.create(this, id).apply(initializer).build()
