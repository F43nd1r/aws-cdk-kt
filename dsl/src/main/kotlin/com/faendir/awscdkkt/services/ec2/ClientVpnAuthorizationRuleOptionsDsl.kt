@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions

public
    fun clientVpnAuthorizationRuleOptions(initializer: ClientVpnAuthorizationRuleOptions.Builder.() -> Unit):
    ClientVpnAuthorizationRuleOptions =
    ClientVpnAuthorizationRuleOptions.builder().apply(initializer).build()
