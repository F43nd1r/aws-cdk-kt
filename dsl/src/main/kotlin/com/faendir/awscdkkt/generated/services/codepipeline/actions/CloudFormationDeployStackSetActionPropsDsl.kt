package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps

@Generated
public fun buildCloudFormationDeployStackSetActionProps(initializer: @AwsCdkDsl
    CloudFormationDeployStackSetActionProps.Builder.() -> Unit = {}):
    CloudFormationDeployStackSetActionProps =
    CloudFormationDeployStackSetActionProps.Builder().apply(initializer).build()
