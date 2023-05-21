package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationExecuteChangeSetActionProps

@Generated
public
    fun cloudFormationExecuteChangeSetActionProps(initializer: CloudFormationExecuteChangeSetActionProps.Builder.() -> Unit
    = {}): CloudFormationExecuteChangeSetActionProps =
    CloudFormationExecuteChangeSetActionProps.builder().apply(initializer).build()
