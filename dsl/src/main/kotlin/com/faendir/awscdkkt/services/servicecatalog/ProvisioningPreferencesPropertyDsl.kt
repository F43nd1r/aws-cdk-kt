package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct

@Generated
public
    fun provisioningPreferencesProperty(initializer: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder.() -> Unit
    = {}): CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty =
    CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.builder().apply(initializer).build()
