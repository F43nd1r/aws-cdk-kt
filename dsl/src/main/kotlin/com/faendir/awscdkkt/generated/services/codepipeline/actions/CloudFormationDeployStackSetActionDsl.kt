package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps

@Generated
public fun cloudFormationDeployStackSetAction(props: CloudFormationDeployStackSetActionProps):
    CloudFormationDeployStackSetAction = CloudFormationDeployStackSetAction(props)

@Generated
public fun buildCloudFormationDeployStackSetAction(initializer: @AwsCdkDsl
    CloudFormationDeployStackSetAction.Builder.() -> Unit): CloudFormationDeployStackSetAction =
    CloudFormationDeployStackSetAction.Builder.create().apply(initializer).build()
