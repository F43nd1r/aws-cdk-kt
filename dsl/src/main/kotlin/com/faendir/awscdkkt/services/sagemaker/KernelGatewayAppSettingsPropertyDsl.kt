package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@Generated
public
    fun kernelGatewayAppSettingsProperty(initializer: CfnUserProfile.KernelGatewayAppSettingsProperty.Builder.() -> Unit
    = {}): CfnUserProfile.KernelGatewayAppSettingsProperty =
    CfnUserProfile.KernelGatewayAppSettingsProperty.builder().apply(initializer).build()
