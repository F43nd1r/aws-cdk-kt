@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public
    fun projectTriggersProperty(initializer: CfnProject.ProjectTriggersProperty.Builder.() -> Unit):
    CfnProject.ProjectTriggersProperty =
    CfnProject.ProjectTriggersProperty.builder().apply(initializer).build()
