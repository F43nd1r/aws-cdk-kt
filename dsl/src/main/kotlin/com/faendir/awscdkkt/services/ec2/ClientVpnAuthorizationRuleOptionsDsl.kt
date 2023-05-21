package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions

@Generated
public
    fun clientVpnAuthorizationRuleOptions(initializer: ClientVpnAuthorizationRuleOptions.Builder.() -> Unit
    = {}): ClientVpnAuthorizationRuleOptions =
    ClientVpnAuthorizationRuleOptions.builder().apply(initializer).build()
