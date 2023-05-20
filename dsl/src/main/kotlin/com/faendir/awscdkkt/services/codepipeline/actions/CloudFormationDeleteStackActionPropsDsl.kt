@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackActionProps

public
    fun cloudFormationDeleteStackActionProps(initializer: CloudFormationDeleteStackActionProps.Builder.() -> Unit):
    CloudFormationDeleteStackActionProps =
    CloudFormationDeleteStackActionProps.builder().apply(initializer).build()
