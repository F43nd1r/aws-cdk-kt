@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public
    fun cloudWatchLogsConfigProperty(initializer: CfnProject.CloudWatchLogsConfigProperty.Builder.() -> Unit):
    CfnProject.CloudWatchLogsConfigProperty =
    CfnProject.CloudWatchLogsConfigProperty.builder().apply(initializer).build()
