package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps

@Generated
public
    fun cloudFormationDeployStackSetActionProps(initializer: CloudFormationDeployStackSetActionProps.Builder.() -> Unit
    = {}): CloudFormationDeployStackSetActionProps =
    CloudFormationDeployStackSetActionProps.builder().apply(initializer).build()
