package com.faendir.awscdkkt.services.fms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnPolicy

@Generated
public
    fun securityServicePolicyDataProperty(initializer: CfnPolicy.SecurityServicePolicyDataProperty.Builder.() -> Unit
    = {}): CfnPolicy.SecurityServicePolicyDataProperty =
    CfnPolicy.SecurityServicePolicyDataProperty.builder().apply(initializer).build()
