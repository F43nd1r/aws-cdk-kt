package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@Generated
public
    fun stageDeclarationProperty(initializer: CfnPipeline.StageDeclarationProperty.Builder.() -> Unit
    = {}): CfnPipeline.StageDeclarationProperty =
    CfnPipeline.StageDeclarationProperty.builder().apply(initializer).build()
