package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput

@Generated
public
    fun codeDeployEcsContainerImageInput(initializer: CodeDeployEcsContainerImageInput.Builder.() -> Unit
    = {}): CodeDeployEcsContainerImageInput =
    CodeDeployEcsContainerImageInput.builder().apply(initializer).build()
