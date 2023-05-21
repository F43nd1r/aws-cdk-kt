package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables

@Generated
public fun ecrSourceVariables(initializer: EcrSourceVariables.Builder.() -> Unit = {}):
    EcrSourceVariables = EcrSourceVariables.builder().apply(initializer).build()
