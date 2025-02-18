package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CommandsAction

@Generated
public fun buildCommandsAction(initializer: @AwsCdkDsl CommandsAction.Builder.() -> Unit = {}):
    CommandsAction = CommandsAction.Builder.create().apply(initializer).build()
