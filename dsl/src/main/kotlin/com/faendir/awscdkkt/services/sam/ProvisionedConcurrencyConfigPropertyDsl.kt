package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun provisionedConcurrencyConfigProperty(initializer: CfnFunction.ProvisionedConcurrencyConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.ProvisionedConcurrencyConfigProperty =
    CfnFunction.ProvisionedConcurrencyConfigProperty.builder().apply(initializer).build()
