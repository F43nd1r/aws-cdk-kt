package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnProject

@Generated
public
    fun provisioningParameterProperty(initializer: CfnProject.ProvisioningParameterProperty.Builder.() -> Unit
    = {}): CfnProject.ProvisioningParameterProperty =
    CfnProject.ProvisioningParameterProperty.builder().apply(initializer).build()
