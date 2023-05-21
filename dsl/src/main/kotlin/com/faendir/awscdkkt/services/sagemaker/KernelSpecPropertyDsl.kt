package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@Generated
public fun kernelSpecProperty(initializer: CfnAppImageConfig.KernelSpecProperty.Builder.() -> Unit =
    {}): CfnAppImageConfig.KernelSpecProperty =
    CfnAppImageConfig.KernelSpecProperty.builder().apply(initializer).build()
