package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun sourceAuthProperty(initializer: CfnProject.SourceAuthProperty.Builder.() -> Unit = {}):
    CfnProject.SourceAuthProperty =
    CfnProject.SourceAuthProperty.builder().apply(initializer).build()
