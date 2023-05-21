package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps

@Generated
public fun codeCommitSourceActionProps(initializer: CodeCommitSourceActionProps.Builder.() -> Unit =
    {}): CodeCommitSourceActionProps =
    CodeCommitSourceActionProps.builder().apply(initializer).build()
