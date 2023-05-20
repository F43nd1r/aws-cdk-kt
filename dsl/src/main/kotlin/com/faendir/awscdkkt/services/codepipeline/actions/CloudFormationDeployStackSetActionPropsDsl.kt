@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps

public
    fun cloudFormationDeployStackSetActionProps(initializer: CloudFormationDeployStackSetActionProps.Builder.() -> Unit):
    CloudFormationDeployStackSetActionProps =
    CloudFormationDeployStackSetActionProps.builder().apply(initializer).build()
