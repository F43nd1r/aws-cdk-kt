@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackInstancesActionProps

public
    fun cloudFormationDeployStackInstancesActionProps(initializer: CloudFormationDeployStackInstancesActionProps.Builder.() -> Unit):
    CloudFormationDeployStackInstancesActionProps =
    CloudFormationDeployStackInstancesActionProps.builder().apply(initializer).build()
