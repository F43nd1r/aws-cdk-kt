@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public fun logsConfigProperty(initializer: CfnProject.LogsConfigProperty.Builder.() -> Unit):
    CfnProject.LogsConfigProperty =
    CfnProject.LogsConfigProperty.builder().apply(initializer).build()
