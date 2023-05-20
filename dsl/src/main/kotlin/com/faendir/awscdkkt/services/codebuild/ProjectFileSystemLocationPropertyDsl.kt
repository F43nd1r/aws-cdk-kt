@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public
    fun projectFileSystemLocationProperty(initializer: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit):
    CfnProject.ProjectFileSystemLocationProperty =
    CfnProject.ProjectFileSystemLocationProperty.builder().apply(initializer).build()
