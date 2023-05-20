@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public
    fun projectSourceVersionProperty(initializer: CfnProject.ProjectSourceVersionProperty.Builder.() -> Unit):
    CfnProject.ProjectSourceVersionProperty =
    CfnProject.ProjectSourceVersionProperty.builder().apply(initializer).build()
