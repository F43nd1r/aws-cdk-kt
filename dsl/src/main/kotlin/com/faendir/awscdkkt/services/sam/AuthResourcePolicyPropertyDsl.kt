package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun authResourcePolicyProperty(initializer: CfnFunction.AuthResourcePolicyProperty.Builder.() -> Unit
    = {}): CfnFunction.AuthResourcePolicyProperty =
    CfnFunction.AuthResourcePolicyProperty.builder().apply(initializer).build()
