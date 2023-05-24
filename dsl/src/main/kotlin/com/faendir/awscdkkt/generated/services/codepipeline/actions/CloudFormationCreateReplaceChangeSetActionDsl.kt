package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateReplaceChangeSetActionProps

@Generated
public
    fun cloudFormationCreateReplaceChangeSetAction(props: CloudFormationCreateReplaceChangeSetActionProps):
    CloudFormationCreateReplaceChangeSetAction = CloudFormationCreateReplaceChangeSetAction(props)

@Generated
public fun buildCloudFormationCreateReplaceChangeSetAction(initializer: @AwsCdkDsl
    CloudFormationCreateReplaceChangeSetAction.Builder.() -> Unit):
    CloudFormationCreateReplaceChangeSetAction =
    CloudFormationCreateReplaceChangeSetAction.Builder.create().apply(initializer).build()
