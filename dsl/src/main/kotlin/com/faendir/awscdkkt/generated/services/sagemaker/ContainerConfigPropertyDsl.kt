package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@Generated
public fun buildContainerConfigProperty(initializer: @AwsCdkDsl
    CfnAppImageConfig.ContainerConfigProperty.Builder.() -> Unit = {}):
    CfnAppImageConfig.ContainerConfigProperty =
    CfnAppImageConfig.ContainerConfigProperty.Builder().apply(initializer).build()
