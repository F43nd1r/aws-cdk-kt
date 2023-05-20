@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

public fun kernelSpecProperty(initializer: CfnAppImageConfig.KernelSpecProperty.Builder.() -> Unit):
    CfnAppImageConfig.KernelSpecProperty =
    CfnAppImageConfig.KernelSpecProperty.builder().apply(initializer).build()
