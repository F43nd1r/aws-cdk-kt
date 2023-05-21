package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationCreateUpdateStackActionProps

@Generated
public
    fun cloudFormationCreateUpdateStackActionProps(initializer: CloudFormationCreateUpdateStackActionProps.Builder.() -> Unit
    = {}): CloudFormationCreateUpdateStackActionProps =
    CloudFormationCreateUpdateStackActionProps.builder().apply(initializer).build()
