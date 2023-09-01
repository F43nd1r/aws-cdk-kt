package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackAction

@Generated
public fun buildCloudFormationCreateUpdateStackAction(initializer: @AwsCdkDsl
    CloudFormationCreateUpdateStackAction.Builder.() -> Unit = {}):
    CloudFormationCreateUpdateStackAction =
    CloudFormationCreateUpdateStackAction.Builder.create().apply(initializer).build()
