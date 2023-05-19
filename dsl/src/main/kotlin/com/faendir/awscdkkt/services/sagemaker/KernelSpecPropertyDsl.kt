@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

public fun kernelSpecProperty(initializer: CfnAppImageConfig.KernelSpecProperty.Builder.() -> Unit):
    CfnAppImageConfig.KernelSpecProperty =
    CfnAppImageConfig.KernelSpecProperty.builder().apply(initializer).build()
