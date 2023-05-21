package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceVariables

@Generated
public fun codeCommitSourceVariables(initializer: CodeCommitSourceVariables.Builder.() -> Unit =
    {}): CodeCommitSourceVariables = CodeCommitSourceVariables.builder().apply(initializer).build()
