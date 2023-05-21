package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions

@Generated
public
    fun commonCloudFormationStackSetOptions(initializer: CommonCloudFormationStackSetOptions.Builder.() -> Unit
    = {}): CommonCloudFormationStackSetOptions =
    CommonCloudFormationStackSetOptions.builder().apply(initializer).build()
