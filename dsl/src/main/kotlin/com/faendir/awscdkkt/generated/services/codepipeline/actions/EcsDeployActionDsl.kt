package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps

@Generated
public fun ecsDeployAction(props: EcsDeployActionProps): EcsDeployAction = EcsDeployAction(props)

@Generated
public fun buildEcsDeployAction(initializer: @AwsCdkDsl EcsDeployAction.Builder.() -> Unit):
    EcsDeployAction = EcsDeployAction.Builder.create().apply(initializer).build()
