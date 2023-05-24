package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesAction
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps

@Generated
public
    fun cloudFormationDeployStackInstancesAction(props: CloudFormationDeployStackInstancesActionProps):
    CloudFormationDeployStackInstancesAction = CloudFormationDeployStackInstancesAction(props)

@Generated
public fun buildCloudFormationDeployStackInstancesAction(initializer: @AwsCdkDsl
    CloudFormationDeployStackInstancesAction.Builder.() -> Unit):
    CloudFormationDeployStackInstancesAction =
    CloudFormationDeployStackInstancesAction.Builder.create().apply(initializer).build()
