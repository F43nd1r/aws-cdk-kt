package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun buildSourceProperty(initializer: @AwsCdkDsl CfnProject.SourceProperty.Builder.() -> Unit
    = {}): CfnProject.SourceProperty =
    CfnProject.SourceProperty.Builder().apply(initializer).build()
