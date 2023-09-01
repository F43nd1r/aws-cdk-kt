package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.AlexaSkillDeployAction

@Generated
public fun buildAlexaSkillDeployAction(initializer: @AwsCdkDsl
    AlexaSkillDeployAction.Builder.() -> Unit = {}): AlexaSkillDeployAction =
    AlexaSkillDeployAction.Builder.create().apply(initializer).build()
