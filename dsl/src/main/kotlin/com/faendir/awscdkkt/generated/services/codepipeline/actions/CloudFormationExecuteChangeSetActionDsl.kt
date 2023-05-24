package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetAction

@Generated
public fun buildCloudFormationExecuteChangeSetAction(initializer: @AwsCdkDsl
    CloudFormationExecuteChangeSetAction.Builder.() -> Unit): CloudFormationExecuteChangeSetAction =
    CloudFormationExecuteChangeSetAction.Builder.create().apply(initializer).build()
