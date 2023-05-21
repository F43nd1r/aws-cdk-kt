package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun projectCacheProperty(initializer: CfnProject.ProjectCacheProperty.Builder.() -> Unit =
    {}): CfnProject.ProjectCacheProperty =
    CfnProject.ProjectCacheProperty.builder().apply(initializer).build()
