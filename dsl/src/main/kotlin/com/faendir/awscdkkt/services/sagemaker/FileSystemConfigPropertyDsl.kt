@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

public
    fun fileSystemConfigProperty(initializer: CfnAppImageConfig.FileSystemConfigProperty.Builder.() -> Unit):
    CfnAppImageConfig.FileSystemConfigProperty =
    CfnAppImageConfig.FileSystemConfigProperty.builder().apply(initializer).build()
