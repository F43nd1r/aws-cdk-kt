package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.EcrBuildAndPublishVariables

@Generated
public fun buildEcrBuildAndPublishVariables(initializer: @AwsCdkDsl
    EcrBuildAndPublishVariables.Builder.() -> Unit = {}): EcrBuildAndPublishVariables =
    EcrBuildAndPublishVariables.Builder().apply(initializer).build()
