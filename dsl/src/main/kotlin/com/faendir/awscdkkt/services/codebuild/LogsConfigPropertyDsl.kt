package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun logsConfigProperty(initializer: CfnProject.LogsConfigProperty.Builder.() -> Unit = {}):
    CfnProject.LogsConfigProperty =
    CfnProject.LogsConfigProperty.builder().apply(initializer).build()
