package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct

@Generated
public
    fun provisioningParameterProperty(initializer: CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.Builder.() -> Unit
    = {}): CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty =
    CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.builder().apply(initializer).build()
