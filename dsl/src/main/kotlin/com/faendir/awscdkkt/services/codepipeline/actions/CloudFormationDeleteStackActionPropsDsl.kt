@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackActionProps

public
    fun cloudFormationDeleteStackActionProps(initializer: CloudFormationDeleteStackActionProps.Builder.() -> Unit):
    CloudFormationDeleteStackActionProps =
    CloudFormationDeleteStackActionProps.builder().apply(initializer).build()
