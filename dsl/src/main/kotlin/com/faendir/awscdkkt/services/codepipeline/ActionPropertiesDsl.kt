package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.ActionProperties

@Generated
public fun actionProperties(initializer: ActionProperties.Builder.() -> Unit = {}): ActionProperties
    = ActionProperties.builder().apply(initializer).build()
