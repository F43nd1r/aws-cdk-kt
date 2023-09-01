package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun buildProjectCacheProperty(initializer: @AwsCdkDsl
    CfnProject.ProjectCacheProperty.Builder.() -> Unit = {}): CfnProject.ProjectCacheProperty =
    CfnProject.ProjectCacheProperty.Builder().apply(initializer).build()
