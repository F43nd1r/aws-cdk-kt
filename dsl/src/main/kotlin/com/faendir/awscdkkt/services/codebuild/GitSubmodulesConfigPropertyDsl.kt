package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun gitSubmodulesConfigProperty(initializer: CfnProject.GitSubmodulesConfigProperty.Builder.() -> Unit
    = {}): CfnProject.GitSubmodulesConfigProperty =
    CfnProject.GitSubmodulesConfigProperty.builder().apply(initializer).build()
