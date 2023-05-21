package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnVersion

@Generated
public
    fun provisionedConcurrencyConfigurationProperty(initializer: CfnVersion.ProvisionedConcurrencyConfigurationProperty.Builder.() -> Unit
    = {}): CfnVersion.ProvisionedConcurrencyConfigurationProperty =
    CfnVersion.ProvisionedConcurrencyConfigurationProperty.builder().apply(initializer).build()
