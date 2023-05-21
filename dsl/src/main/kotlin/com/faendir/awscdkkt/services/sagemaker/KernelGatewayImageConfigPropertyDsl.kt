package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@Generated
public
    fun kernelGatewayImageConfigProperty(initializer: CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder.() -> Unit
    = {}): CfnAppImageConfig.KernelGatewayImageConfigProperty =
    CfnAppImageConfig.KernelGatewayImageConfigProperty.builder().apply(initializer).build()
