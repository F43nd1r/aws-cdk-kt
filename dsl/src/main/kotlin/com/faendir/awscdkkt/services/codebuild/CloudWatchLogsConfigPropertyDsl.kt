package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun cloudWatchLogsConfigProperty(initializer: CfnProject.CloudWatchLogsConfigProperty.Builder.() -> Unit
    = {}): CfnProject.CloudWatchLogsConfigProperty =
    CfnProject.CloudWatchLogsConfigProperty.builder().apply(initializer).build()
