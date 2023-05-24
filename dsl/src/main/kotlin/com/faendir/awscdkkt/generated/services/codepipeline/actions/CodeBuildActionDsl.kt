package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps

@Generated
public fun codeBuildAction(props: CodeBuildActionProps): CodeBuildAction = CodeBuildAction(props)

@Generated
public fun buildCodeBuildAction(initializer: @AwsCdkDsl CodeBuildAction.Builder.() -> Unit):
    CodeBuildAction = CodeBuildAction.Builder.create().apply(initializer).build()
