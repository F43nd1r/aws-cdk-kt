package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@Generated
public fun buildKernelSpecProperty(initializer: @AwsCdkDsl
    CfnAppImageConfig.KernelSpecProperty.Builder.() -> Unit = {}):
    CfnAppImageConfig.KernelSpecProperty =
    CfnAppImageConfig.KernelSpecProperty.Builder().apply(initializer).build()
