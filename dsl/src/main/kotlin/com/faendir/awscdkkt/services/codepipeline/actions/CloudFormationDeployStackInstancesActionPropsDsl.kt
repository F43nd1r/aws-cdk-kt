@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps

public
    fun cloudFormationDeployStackInstancesActionProps(initializer: CloudFormationDeployStackInstancesActionProps.Builder.() -> Unit):
    CloudFormationDeployStackInstancesActionProps =
    CloudFormationDeployStackInstancesActionProps.builder().apply(initializer).build()
