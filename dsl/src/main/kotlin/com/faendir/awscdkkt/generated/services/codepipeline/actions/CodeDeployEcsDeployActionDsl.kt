package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployActionProps

@Generated
public fun codeDeployEcsDeployAction(props: CodeDeployEcsDeployActionProps):
    CodeDeployEcsDeployAction = CodeDeployEcsDeployAction(props)

@Generated
public fun buildCodeDeployEcsDeployAction(initializer: @AwsCdkDsl
    CodeDeployEcsDeployAction.Builder.() -> Unit): CodeDeployEcsDeployAction =
    CodeDeployEcsDeployAction.Builder.create().apply(initializer).build()
