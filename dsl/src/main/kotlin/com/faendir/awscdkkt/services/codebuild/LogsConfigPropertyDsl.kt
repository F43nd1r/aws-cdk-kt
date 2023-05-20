@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public fun logsConfigProperty(initializer: CfnProject.LogsConfigProperty.Builder.() -> Unit):
    CfnProject.LogsConfigProperty =
    CfnProject.LogsConfigProperty.builder().apply(initializer).build()
