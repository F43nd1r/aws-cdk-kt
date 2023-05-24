package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceAction
import software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps

@Generated
public fun codeStarConnectionsSourceAction(props: CodeStarConnectionsSourceActionProps):
    CodeStarConnectionsSourceAction = CodeStarConnectionsSourceAction(props)

@Generated
public fun buildCodeStarConnectionsSourceAction(initializer: @AwsCdkDsl
    CodeStarConnectionsSourceAction.Builder.() -> Unit): CodeStarConnectionsSourceAction =
    CodeStarConnectionsSourceAction.Builder.create().apply(initializer).build()
