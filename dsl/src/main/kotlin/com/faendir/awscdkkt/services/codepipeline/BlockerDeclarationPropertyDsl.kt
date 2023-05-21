package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@Generated
public
    fun blockerDeclarationProperty(initializer: CfnPipeline.BlockerDeclarationProperty.Builder.() -> Unit
    = {}): CfnPipeline.BlockerDeclarationProperty =
    CfnPipeline.BlockerDeclarationProperty.builder().apply(initializer).build()
