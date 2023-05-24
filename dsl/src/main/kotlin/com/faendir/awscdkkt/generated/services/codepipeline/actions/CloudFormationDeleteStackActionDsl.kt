package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackAction

@Generated
public fun buildCloudFormationDeleteStackAction(initializer: @AwsCdkDsl
    CloudFormationDeleteStackAction.Builder.() -> Unit): CloudFormationDeleteStackAction =
    CloudFormationDeleteStackAction.Builder.create().apply(initializer).build()
