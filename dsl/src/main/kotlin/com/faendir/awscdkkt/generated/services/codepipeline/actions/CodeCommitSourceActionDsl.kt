package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceAction

@Generated
public fun buildCodeCommitSourceAction(initializer: @AwsCdkDsl
    CodeCommitSourceAction.Builder.() -> Unit): CodeCommitSourceAction =
    CodeCommitSourceAction.Builder.create().apply(initializer).build()
