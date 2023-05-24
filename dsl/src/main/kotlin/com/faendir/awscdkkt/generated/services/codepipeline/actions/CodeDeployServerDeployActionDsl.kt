package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployActionProps

@Generated
public fun codeDeployServerDeployAction(props: CodeDeployServerDeployActionProps):
    CodeDeployServerDeployAction = CodeDeployServerDeployAction(props)

@Generated
public fun buildCodeDeployServerDeployAction(initializer: @AwsCdkDsl
    CodeDeployServerDeployAction.Builder.() -> Unit): CodeDeployServerDeployAction =
    CodeDeployServerDeployAction.Builder.create().apply(initializer).build()
