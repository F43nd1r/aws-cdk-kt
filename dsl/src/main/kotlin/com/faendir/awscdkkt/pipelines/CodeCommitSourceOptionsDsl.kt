package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions

@Generated
public fun codeCommitSourceOptions(initializer: CodeCommitSourceOptions.Builder.() -> Unit = {}):
    CodeCommitSourceOptions = CodeCommitSourceOptions.builder().apply(initializer).build()
