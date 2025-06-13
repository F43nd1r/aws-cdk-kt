package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.Ec2DeployAction

@Generated
public fun buildEc2DeployAction(initializer: @AwsCdkDsl Ec2DeployAction.Builder.() -> Unit = {}):
    Ec2DeployAction = Ec2DeployAction.Builder.create().apply(initializer).build()
