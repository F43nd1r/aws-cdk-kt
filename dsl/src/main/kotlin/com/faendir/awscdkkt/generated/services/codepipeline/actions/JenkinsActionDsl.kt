package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.JenkinsAction

@Generated
public fun buildJenkinsAction(initializer: @AwsCdkDsl JenkinsAction.Builder.() -> Unit):
    JenkinsAction = JenkinsAction.Builder.create().apply(initializer).build()
