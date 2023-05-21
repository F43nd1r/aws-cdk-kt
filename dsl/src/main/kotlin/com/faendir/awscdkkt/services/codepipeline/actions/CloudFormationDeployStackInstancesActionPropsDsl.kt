package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps

@Generated
public
    fun cloudFormationDeployStackInstancesActionProps(initializer: CloudFormationDeployStackInstancesActionProps.Builder.() -> Unit
    = {}): CloudFormationDeployStackInstancesActionProps =
    CloudFormationDeployStackInstancesActionProps.builder().apply(initializer).build()
