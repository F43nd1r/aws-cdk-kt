package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

@Generated
public
    fun fileSystemConfigProperty(initializer: CfnAppImageConfig.FileSystemConfigProperty.Builder.() -> Unit
    = {}): CfnAppImageConfig.FileSystemConfigProperty =
    CfnAppImageConfig.FileSystemConfigProperty.builder().apply(initializer).build()
